package com.diegot;

import java.util.Scanner;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Enter number:");
        this.x = x.nextInt();
    }

    public void x() {
        for(int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + (x * this.x));
        }
    }
}
