package com.diegot;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Define number elements to enter: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] integerValues = readIntegers(count);

        System.out.println("Integer elements: " + Arrays.toString(integerValues));

        int minValue = findMin(integerValues);

        System.out.println("Minimum value: " + minValue);
    }

    public static int[] readIntegers(int number) {
        int[] values = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter integer #" + (i+1));
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return values;
    }

    public static int findMin(int[] array) {
        int min;
        
        min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        return min;
    }
}
