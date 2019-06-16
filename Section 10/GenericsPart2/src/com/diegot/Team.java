package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 15/06/2019.
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void  matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            this.won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            this.lost++;
            message = " lost to ";
        } else {
            this.tied++;
            message = " drew with ";
        }

        this.played++;
        if (opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (this.won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> otherTeam) {
        if(this.ranking() > otherTeam.ranking()) {
            return -1;
        } else if (this.ranking() < otherTeam.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
