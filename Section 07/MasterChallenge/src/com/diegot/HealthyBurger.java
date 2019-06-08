package com.diegot;

/**
 * Created by DiegoT on 08/06/2019.
 */
public class HealthyBurger extends Hamburger {
    private String addition5;
    private double addition5Price;
    private String addition6;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "brown rye bread");
    }

    public void addHealthAddition1(String name, double price) {
        this.addition5 = name;
        this.addition5Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.addition6 = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (this.addition5 != null) {
            totalPrice += this.addition5Price;
            System.out.println("Added " + this.addition5 + " for an extra " + this.addition5Price);
        }
        if (this.addition6 != null) {
            totalPrice += this.addition6Price;
            System.out.println("Added " + this.addition6 + " for an extra " + this.addition6Price);
        }

        return totalPrice;
    }
}
