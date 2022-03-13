package com.ihsan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
//        int[] firstArray = sortArrayInt(generateIntArray(10));
        int[] secondArray = {6,4,4,2,12};
        int[] copyArray = Arrays.copyOf(secondArray, secondArray.length);

//        secondArray[0] = 2;
//        copyArray[0] = 3;

        int smallestElementInArray1 = findSmallest(secondArray);

        System.out.println(smallestElementInArray1);





//        showAllElement(secondArray);
//        showAllElement(copyArray);
//        System.out.println(Arrays.toString(copyArray));



//        showAllElement(firstArray);
//        showAllElement(secondArray);
    }

    public static int[] generateIntArray(int number) {
        int[] newArray = new int[5];

        System.out.println("Go input a " + newArray.length + " total of numbers");
        for (int i = 0 ; i < newArray.length ; i++) {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    public static void showAllElement(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArrayInt(int[] arr) {
//        Array
        int[] sortedArray = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            sortedArray[i] = arr[i];
        }

        for(int i = 0; i < arr.length - 1 ; i++) {
            if (sortedArray[i] < sortedArray[i + 1]) {
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
            }
        }

        return sortedArray;
    }

    public static int findSmallest(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);

        int smallest = arr[0];
        for (int i = 1 ; i < arr.length ; i++) {
            if (smallest > arr[i]) smallest = arr[i];
        }

        return smallest;
    }
}
