package com.diegot;

/**
 * Created by DiegoT on 14/06/2019.
 */
public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out. Repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping his wings");
    }
}
