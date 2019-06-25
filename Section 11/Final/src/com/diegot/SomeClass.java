package com.diegot;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class SomeClass {
    private static int classCounter = 0;
    public final int instanceNumber;
    private String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(this.name + " created, instance is " + this.instanceNumber);
    }
}
