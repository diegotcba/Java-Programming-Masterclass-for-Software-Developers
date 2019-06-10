package com.diegot;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[] {1, 2, 3, 4, 5};

        int[] reversedArray = Arrays.copyOf(myIntArray, myIntArray.length);

        //reverse(reversedArray);
        reverseV2(reversedArray);

        System.out.println("Original array: " + Arrays.toString(myIntArray));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

    public static void reverse(int[] array) {
        int[] original = Arrays.copyOf(array, array.length);
        int maxIndex = original.length - 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = original[maxIndex - i];
        }

    }

    public static void reverseV2(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
