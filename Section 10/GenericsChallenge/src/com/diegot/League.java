package com.diegot;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by DiegoT on 16/06/2019.
 */
public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (this.league.contains(team)) {
            return false;
        }
        this.league.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(this.league);

        for (T t : this.league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
