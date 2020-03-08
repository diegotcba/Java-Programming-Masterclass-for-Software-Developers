package com.diegot;

/**
 * Created by DiegoT on 08/03/2020.
 */
public class Moon extends HeavenlyBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.MOON);
    }
}
