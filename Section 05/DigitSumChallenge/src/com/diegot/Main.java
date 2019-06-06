package com.diegot;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits on number 12 = " + sumDigits(12));
        System.out.println("Sum of digits on number 125 = " + sumDigits(125));
        System.out.println("Sum of digits on number -125 = " + sumDigits(-125));
        System.out.println("Sum of digits on number 4 = " + sumDigits(4));
        System.out.println("Sum of digits on number 32123 = " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if(number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            sum += (number % 10);
            number = (number / 10);
        }

        return sum;
    }
}
