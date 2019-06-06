package com.diegot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int number;
        while(count <= 10) {
            System.out.println("Enter number #" + count + ":");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum += number;

                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handle enter key and clear the previous value
        }


        scanner.close();
        System.out.println("The sum is:" + sum);
    }
}
