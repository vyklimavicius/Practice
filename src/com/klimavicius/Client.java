package com.klimavicius;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {

        int[] arr = {2, 34, 5, 9, 50, 23, 9, 32};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    /*
        Bubble sort implementation - O(n^2)
    */
    public static int[] bubbleSort(int[] arr) {
        int orderedIndex = arr.length - 1;
        while(orderedIndex > 0) {
            for(int i = 0; i < orderedIndex; i++) {
                if(arr[i] > arr[i + 1]) {
                    int valueToPass = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = valueToPass;
                }
            }
            orderedIndex--;
        }
        return arr;
    }

    /*
        Selection sort implementation - O(n^2)
    */
    public static int[] selectionSort(int[] arr) {
        int orderedIndex = arr.length - 1;
        while(orderedIndex > 0) {
            int largestNumberIndex = 0;
            for(int i = 0; i < orderedIndex; i++) {
                if(arr[i] > arr[i + 1]) {
                    if(arr[i] > arr[largestNumberIndex]) largestNumberIndex = i;
                }
            }
            if(arr[largestNumberIndex] > arr[orderedIndex]) {
                int currentLast = arr[orderedIndex];
                arr[orderedIndex] = arr[largestNumberIndex];
                arr[largestNumberIndex] = currentLast;
            }
            orderedIndex--;
        }
        return arr;
    }
}
