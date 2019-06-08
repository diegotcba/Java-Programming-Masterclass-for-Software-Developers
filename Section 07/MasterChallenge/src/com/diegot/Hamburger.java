package com.diegot;

/**
 * Created by DiegoT on 08/06/2019.
 */
public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }


    public double itemizeHamburger() {
        double totalPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll " +
                            "price is " + this.price);

        if (addition1 != null) {
            totalPrice += addition1Price;
            System.out.println("Added " + this.addition1 + " for an extra " + this.addition1Price);
        }
        if (addition2 != null) {
            totalPrice += addition2Price;
            System.out.println("Added " + this.addition2 + " for an extra " + this.addition2Price);
        }
        if (addition3 != null) {
            totalPrice += addition3Price;
            System.out.println("Added " + this.addition3 + " for an extra " + this.addition3Price);
        }
        if (addition4 != null) {
            totalPrice += addition4Price;
            System.out.println("Added " + this.addition4 + " for an extra " + this.addition4Price);
        }

        return totalPrice;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1 = additionName;
        this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2 = additionName;
        this.addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3 = additionName;
        this.addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4 = additionName;
        this.addition4Price = additionPrice;
    }
}
