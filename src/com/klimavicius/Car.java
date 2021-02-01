package com.klimavicius;

public class Car {

    private Brand brand;
    private Color color;
    private String type;

    // Only once - When class gets loaded//
//    static {
//        System.out.println("A new Instance of car was created!");
//    }

    // Every time an instance is created //
//    {
//        System.out.println("A new Instance of car was created!");
//    }

    // Enums //
    public enum Color {
        BLUE,
        YELLOW,
        RED
    }

    public Car() {

    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    @ToDo("By Vytautas Klimavicius")
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }




    public class Brand {

        private String name;

        public Brand() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Brand{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

interface ICar extends test{

    String sayName(String name);


}


//          Car vCar = new Car();
//          Car.Color blue = Car.Color.RED;
//          vCar.setColor(blue);

//          Method[] carMethods =  Car.class.getMethods();

//          for(int i = 0; i < carMethods.length; i++){
//              if(carMethods[i].isAnnotationPresent(ToDo.class)){
//                  System.out.println("The annotation is active!");
//              }
//          }

//        try {
//            Class cls = Class.forName("Main");
//            ClassLoader cLoader = cls.getClassLoader();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//          int d = 10;
//          assert d >= 0 : "d variable is not greater or equal to 0";
//
//            int a = 1;
//            int b = + 1;
//        System.out.println(b);
//        DataBConfig newConfig = new DataBConfig();
//        Connection myConnection = newConfig.getConnection();

//        try
//         {
//            PreparedStatement stmt = myConnection.prepareStatement("insert into employee (ename, age, city, phone_no) values (?, ?, ?, ?)"
//            stmt.setString(1, "Mike");
//            stmt.setInt(2, 21);
//            stmt.setString(3, "Miami");
//            stmt.setString(4, "312-345-9187");
//
//            stmt.executeQuery();

//            Statement st = myConnection.createStatement();
//            ResultSet rs = st.executeQuery("select * from employee");
//
//
//            while(rs.next()) {
//                int id = rs.getInt("empid");
//                String name = rs.getString("ename");
//                int age = rs.getInt("age");
//                String city = rs.getString("city");
//                String phone = rs.getString("phone_no");
//                System.out.println(id + " " + name + " " + age + " " + city + " " + phone);
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        int a = Integer.MAX_VALUE;
//        float b = Float.MAX_VALUE;
//        double c = Double.BYTES;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
// -------- Check the digits of a number to see which one is even -------------//
//        int[] numbers = {12,23,35,42,58};
//        int count = 0;
//        for(int i = 0; i < numbers.length ; i++) {
//            int numLength = Integer.toString(numbers[i]).length();
//            int currentNumber = numbers[i];
//            for(int x = 0; x < numLength ; x++){
//                int last = currentNumber % 10;
//                if( last % 2 == 0) {
//                    count+= 1;
//                }
//                currentNumber = currentNumber / 10;
//            }
//        }
//        System.out.println(count);

//    public static void loopsTwo(int a, int b, int n) {
//
//        int query = 0;
//
//        for(int i = 0, x = 2; i < n; i++) {
//
//            if(i == 0) {
//                query = a + 1 * b;
//                System.out.print(query);
//            } else {
//                int loop = query + x * b;
//                query = loop;
//                x = x * 2;
//                System.out.print(" " + loop);
//            }
//        }
//    }

//        new Car() {
//            @Override
//            public Brand getBrand() {
//                Brand ford = new Brand();
//                ford.setName("Ford");
//                return ford;
//            }
//
//        };


// write your code chevy
//        Car vCar = new Car();
//        Car.Color blue = Car.Color.RED;
//        vCar.setColor(blue);
//        System.out.println(vCar.getColor());
//
//        boolean colorCheck = vCar.getColor() == Car.Color.BLUE;


// Created checked exception //
//            if(colorCheck) {
//                System.out.println(true);
//            } else {
//               throw new Verror("This is an error!");
//            }

// Try / catch exception //
//        try {
//            int d = 2 / 0;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }
//        Car kCar = new Car();
//        Car cCar = new Car();
//        Car qCar = new Car();
//        ICar names = (String name) -> {
//            return "Hello," + name;
//        };
//
//        System.out.println(names.sayName("Vytautas"));
//        String hello = "Hello";
//        new StringBuilder("Hello").reverse().toString();
//        char[] val = hello.toCharArray();
//        String result = new String(val);
//        int a = val.length;
//        for(char i: val) {
//            System.out.println(i);
//        }
//
//        String regExp = result.replaceAll("[el]","d");
//        System.out.println(result);
//        System.out.println(regExp);
//        int num = 345;
//        HashMap<Integer, String> test = new HashMap();
//
//        test.put(1, "Hello");
//        test.put(2, "Bye");
//        test.put(3, "Sup");
//        test.put(4, "Word");
//
//        Set<Integer> keySet = test.keySet();
//
//        System.out.println(keySet);
//        System.out.println(res);
//        System.out.println(div);
//
//        int length = Integer.toString(num).length();
//
//        for(int i = 0; i < length; i++) {
//            int res = num % 10;
//            int div = num / 10;
//
//        }
//        Car.Brand chevy = vCar.new Brand();
//        chevy.setName("Chevrolet");
//        vCar.setBrand(chevy);
//        vCar.setColor("Red");
//        vCar.setType("SUV");
//
//        OneInstance onlyOne = OneInstance.getInstance();
//        onlyOne.setNumber(6);
//        OneInstance onlytwo = OneInstance.getInstance();
//        OneInstance onlythree = OneInstance.getInstance();
//        System.out.println(onlyOne.getNumber());
//        System.out.println(onlytwo.getNumber());
//        System.out.println(onlythree.getNumber());
//        System.out.println(B);
//        System.out.println(H);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(3);
//        numbers.add(1);
//        numbers.add(2);
//
//        numbers.forEach( num -> {
//            System.out.println(Integer.toString(numbers.indexOf(num)) + ". " + num);
//        });
//
//        new Thread( new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running");
//            }
//        }).start();
//
//        Collections.sort(numbers);
//        numbers.forEach( num -> {
//            System.out.println(Integer.toString(numbers.indexOf(num)) + ". " + num);
//        });
//
//        String b = "fivee";
//        int result = b.compareTo("five");
//        System.out.println(result);

//        String v = new String("Hello");
//
//        String d = v.replaceAll("[el]", "v");
//        System.out.println(d);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(4);
//
//        Set<Integer> nums = new HashSet<>(numbers);

//        for(int i: nums){
//            System.out.println(i);
//        }
//
//        numbers = new ArrayList<>(nums);
//        for(int i: numbers){
//            System.out.println(i);
//        }

//        int a = 1;
//        int b = 2;
//
//        boolean check = a == b ? true: false;
//        System.out.println(check);
//        System.out.println("This is coming from my main thread!");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("I'm in a new thread!");
//            }
//        }).start();

//        List<String> names = new ArrayList<String>();
//        names.add("Vytautas");
//        names.add("Carlos");
//        names.add("Alberto");
//        names.add("Maximo");
//
//        Collections.sort(names, Collections.reverseOrder());
//        System.out.println(names);

//        char[] a = new String("Vytautas").toCharArray();
//        int aLength = a.length;
//        String reverse = null;
//        char[] temp = new char[aLength];
//        for (int i = 0, x = aLength - 1 ; i < aLength ; i++, x--){
//            temp[i] = a[x];
//        }
//        System.out.println(new String(temp));
//
//
//        int d = 234;