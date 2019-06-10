package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 09/06/2019.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(initialTransaction);
    }


    public boolean addTransaction(double transaction) {
        this.transactions.add(transaction);

        return true;
    }

    public void printTransactions() {
        System.out.println("Transaction List");
        for (int i = 0; i < this.transactions.size(); i++) {
            System.out.println((i + 1) + ". " + this.transactions.get(i));
        }
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
