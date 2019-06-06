package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("*********************************");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        System.out.println("*********************************");
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int primeCounter = 0;
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                primeCounter++;
                System.out.println("Prime number: " + i);
                if(primeCounter == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= Math.sqrt(n); i++) {
            //System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
}
