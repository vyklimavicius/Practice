package com.klimavicius;



import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static ICar iCar;

    public static void main(String[] args) {

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(1);
//        numbers.add(4);
//
//        System.out.println(cutTheBamboo(numbers));
//        System.out.println(cutTheBamboo(new int[]{3,2,1,4}));
//        System.out.println(cutTheBamboo(new int[]{5,6,1,2,1,4}));

//        System.out.println(arrange("Cats and hats"));
//        System.out.println(arrange("The lines are printed in reverse order."));
//        System.out.println(arrange("Here i come."));

//          int[] result = getMinimumDifference("a","bb"); // -1
//          int[] result = getMinimumDifference("jk","kj"); // 0
//          int[] result = getMinimumDifference("abb","bbc"); // 1
//            int[] result = getMinimumDifference("mn","op"); // 2
//          int[] result = getMinimumDifference("abc","def"); // 3
//            String[] a1 = {"a", "jk", "abb", "mn", "abc"};
//            List<String> a = new ArrayList<String>(Arrays.asList(a1));
//
//            String[] b1 = {"bb", "kj", "bbc", "op", "def"};
//            List<String> b = new ArrayList<String>(Arrays.asList(b1));

//            String[] a1 = {"ab"};
//            List<String> a = new ArrayList<String>(Arrays.asList(a1));
//
//            String[] b1 = {"bc"};
//            List<String> b = new ArrayList<String>(Arrays.asList(b1));

//             String[] a1 = {"abc", "aaa"};
//             List<String> a = new ArrayList<String>(Arrays.asList(a1));
//
//             String[] b1 = {"bba", "bbb"};
//             List<String> b = new ArrayList<String>(Arrays.asList(b1));
//
//            List<Integer> result = getMinimumDifference(a,b);
//
////          for(int i = 0; i < result.length; i++) {
////              System.out.println(result[i]);
////          }
//
//            for(Integer i: result) {
//                System.out.println(i);
//            }

//        printA();
        Car v = new Car();
        System.out.println("The log is" + v);
}
    public static List<Integer> cutTheBamboo(List<Integer> pieces) {

        /*
         * - cut the number of pieces of bamboo
         * - find the shortest length piece(s)
         * - discard any piece of that length
         * - cut that shortest length from each of the longer pieces. Each piece just cut is an offcut(Every interaction save the number of pieces).
         * - discard all offcuts
         * - repeat until there are no more pieces
         * - return an array with the pieces at the start of each turn
         */

        List<Integer> numberPieces = new ArrayList<Integer>();
        int n = pieces.size();
        numberPieces.add(n);
        Collections.sort(pieces);
        final int[] cut = {pieces.get(0)};
        while(n > 1) {
            List<Integer> filteredArray = pieces.stream().map(i -> i - cut[0]).filter(i -> i != 0).collect(Collectors.toList());
            numberPieces.add(filteredArray.size());
            pieces = filteredArray;
            n = filteredArray.size();
            Collections.sort(filteredArray);
            cut[0] = filteredArray.get(0);
        }

        return numberPieces;

        // HackerRank
//        List<Integer> numberPieces = new ArrayList<Integer>();
//        int n = arr.length;
//        numberPieces.add(n);
//        Arrays.sort(arr);
//        final int[] cut = {arr[0]};
//        IntStream intStream = Arrays.stream(arr);
//
//        while(n > 1) {
//            int[] filteredArray = intStream.map(i -> i - cut[0]).filter(i -> i != 0)                 .toArray();
//            numberPieces.add(filteredArray.length);
//            intStream = Arrays.stream(filteredArray);
//            n = filteredArray.length;
//            Arrays.sort(filteredArray);
//            cut[0] = filteredArray[0];
//        }
//
//        // System.out.println(numberPieces);
//        return numberPieces.stream().mapToInt(i -> i).toArray();

//        List<Integer> numberPieces = new ArrayList<Integer>();
//        int n = pieces.length;
//        numberPieces.add(n);
//        Arrays.sort(pieces);
//        final int[] cut = {pieces[0]};
//        IntStream intStream = Arrays.stream(pieces);
//
//        while(n > 1) {
//            int[] filteredArray = intStream.map(i -> i - cut[0]).filter(i -> i != 0).toArray();
//            numberPieces.add(filteredArray.length);
//            intStream = Arrays.stream(filteredArray);
//            n = filteredArray.length;
//            Arrays.sort(filteredArray);
//            cut[0] = filteredArray[0];
//        }
//
//        System.out.println(numberPieces);
//        return numberPieces.stream().mapToInt(i -> i).toArray();

    }

    public static String arrange(String sentence) {
        /*
         *  Each word is ordered by length, ascending
         *  Words of equal length must appear in the same order as in the original sentence
         *  The rearranged sentence must be formatted to satisfy the regular expression ^[A-Z][a-z]*\.$
         */
        String noCase = sentence.toLowerCase().replace(".", "");
        List<String> sentenceSplit = Arrays.asList(noCase.split(" "));
        Collections.sort(sentenceSplit, (a, b)->Integer.compare(a.length(), b.length()));
        String format = sentenceSplit.toString().replace("[", "").replace("]", "").replace(",", "") + ".";
        String result = format.substring(0,1).toUpperCase() + format.substring(1);

        return result;
    }

    public static List<Integer> getMinimumDifference(List<String> one, List<String> two) {
        /*
         * tea and ate are anagrams, so we would need to modify 0 characters.
         * tea and toe are not anagrams, but we can modify 1 character in either string (o -> a or a -> o) to make them anagrams
         * act and acts are not anagrams and cannot be converted to anagrams because they contain different numbers of characters
         */
        List<Integer> minimumDifference = new ArrayList<Integer>();
        Set<Character> justCheck = new HashSet<Character>();
        List<Integer> count = new ArrayList<Integer>();
        count.add(0);

        Iterator oneList = one.iterator();
        Iterator twoList = two.iterator();

        while(oneList.hasNext() && twoList.hasNext()) {
            String oneS = oneList.next().toString();
            String twoS = twoList.next().toString();
            char[] charOne = oneS.toCharArray();
            Arrays.sort(charOne);
            char[] charTwo = twoS.toCharArray();
            Arrays.sort(charTwo);
            if (charOne.length > charTwo.length || charTwo.length > charOne.length) {
                minimumDifference.add(-1);
            } else {
                for (char c : charOne) {
                        justCheck.add(c);
                }

                for (char c : charTwo) {
                    if (justCheck.add(c) != false) {
                        count.set(0, count.get(0) + 1);
                    }
                }

                minimumDifference.add(count.get(0));
                count.set(0,0);
            }
        }

            return minimumDifference;
        }

//        public static void printA() {
//            int i;
//            boolean x;
//            System.out.println(" " + i + x);
//        }
//
//            Arrays.sort(charTwo);
//            if (charOne.length > charTwo.length || charTwo.length > charOne.length) {
//                minimumDifference.add(-1);
//            } else {
//                for (char c : charArray) {
//                    if (justCheck.add(c) == false) {
//                        count.set(0, count.get(0) + 1);
//                        minimumDifference.add(count.get(0));
//                    }
//                for (int i = 0; i < charOne.length; i++) {
//                    if () {
//                        count.set(0, 0);
//                    } else {
//                        count.set(0, count.get(0) + 1);
//                    }
//                }
//                minimumDifference.add(count.get(0));
//                count.set(0, 0);
//                }
//            if (charOne.length > charTwo.length || charTwo.length > charOne.length) {
//                List<Integer> errorLength = new ArrayList<>();
//                minimumDifference.add(-1);
//            }
//
//            for(int i = 0; i < charOne.length; i++) {
//                if(charOne[i] == charTwo[i]){
//                    count = 0;
//                } else {
//                    count++;
//                }
//                minimumDifference.add(count);
//            }
//            System.out.println(minimumDifference);
//            System.out.println("hello");
//            return minimumDifference;


//        char[] charOne = one.toCharArray();
//        char[] charTwo = two.toCharArray();
//        Arrays.sort(charOne);
//        Arrays.sort(charTwo);
//        List<Integer> minimumDifference = new ArrayList<Integer>();
//        minimumDifference.add(0);
//        int count = 0;
//
//        if (charOne.length > charTwo.length || charTwo.length > charOne.length) return new int[]{-1};
//
//
//        for(int i = 0; i < charOne.length; i++) {
//            if(charOne[i] == charTwo[i]){
//                count = 0;
//            } else {
//                count++;
//            }
//            minimumDifference.set(0, count);
//        }
//
//        return minimumDifference.stream().mapToInt(i -> i).toArray();


    public static String cashRegister(double PP, double CH) {
        /*
         * Given two decimal numbers first purchase price(PP)
         * second is cash(CH)
         * Calculate change to be returned
         * Output should be alphabetically sorted
         *
         */
        System.out.println(PP);
        System.out.println(CH);

        return null;
    }



}

