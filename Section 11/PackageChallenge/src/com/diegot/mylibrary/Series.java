package com.diegot.mylibrary;

/**
 * Created by DiegoT on 18/06/2019.
 */
public class Series {

    public static long nSum(int n) {
        long sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }

        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }

        return product;
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long Minus1 = 1;
        long Minus2 = 0;
        long fib = 0;

        for (int i = 1; i < n; i++) {
            fib = Minus1 + Minus2;
            Minus2 = Minus1;
            Minus1 = fib;
        }

        return fib;
    }
}
