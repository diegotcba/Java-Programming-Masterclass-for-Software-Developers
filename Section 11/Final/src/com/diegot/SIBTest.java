package com.diegot;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class SIBTest {
    public static final String owner;

    static {
        owner = "Diego";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("second initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
