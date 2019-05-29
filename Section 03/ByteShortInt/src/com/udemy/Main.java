package com.udemy;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myIntTotal = (myMinValue / 2);
        // System.out.println("myIntTotal: " + myIntTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myByteTotal = (byte)(myMinByteValue / 2);
        System.out.println("myByteTotal: " + myByteTotal);

        // short has a width of 16
        short myShortValue = 32767;
        short myShortTotal = (short) (myShortValue/2);

        // long has a width of 64
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = 9_223_372_036_854_775_807L;

        //System.out.println(myMaxLongValue);


        // 1. Create a byte variable and set it to any valid byte number.
        byte byteValue = 10;
        // 2. Create a short variable and set it to any valid short number.
        short shortValue = 20;
        // 3. Create a int variable and set it to any valid in number.
        int intValue = 50;
        // 4. Create a variable of type long, and make it equal to
        //    50000 + 10 times the sum of the byte, plus the short plus the int
        long longTotal = (50000L + (10L * (byteValue + shortValue + intValue)));
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal: " + longTotal);
        System.out.println("shortTotal: " + shortTotal);
    }
}
