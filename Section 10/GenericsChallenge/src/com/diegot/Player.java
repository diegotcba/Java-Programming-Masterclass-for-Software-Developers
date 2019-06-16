package com.diegot;

/**
 * Created by DiegoT on 15/06/2019.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
