package com.diegot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minimum = 0;
        int maximum = 0;
        boolean first = true;
        int number;
        while (true) {
            System.out.println("Enter number:");

            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                if(first) {
                    first = false;
                    minimum = number;
                    maximum = number;
                }

                if(number > maximum) {
                    maximum = number;
                }
                if(number < minimum) {
                    minimum = number;
                }

            } else {
                System.out.println("Invalid number");
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Min = " + minimum + "; Max = " + maximum);
    }
}
