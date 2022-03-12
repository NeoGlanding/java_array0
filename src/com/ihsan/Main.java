package com.ihsan;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] firstArray = generateIntArray(10);
        showAllElement(firstArray);
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
}
