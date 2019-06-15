package com.diegot;

/**
 * Created by DiegoT on 14/06/2019.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not good at that, can I go for a swim instead?");
    }
}
