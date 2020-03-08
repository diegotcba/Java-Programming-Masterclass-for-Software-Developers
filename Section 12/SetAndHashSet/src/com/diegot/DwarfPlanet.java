package com.diegot;

/**
 * Created by DiegoT on 08/03/2020.
 */
public class DwarfPlanet extends HeavenlyBody {
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
}
