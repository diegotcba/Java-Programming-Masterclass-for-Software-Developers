package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 12/06/2019.
 */
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear = 0;
    private boolean clutchIn;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        this.gears = new ArrayList<Gear>();

        for (int i = 0; i <= maxGear; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateCluch(boolean in) {
        this.clutchIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= this.maxGear) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (this.clutchIn) {
            System.out.println("Scream!!");
            return 0.00;
        }

        return revs * this.gears.get(this.currentGear).ratio;
    }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return (revs * this.ratio);
        }
    }
}
