package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 25/06/2019.
 */
public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("Cannot deposit negative amount");
            return;
        }

        this.transactions.add(amount);
        this.balance += amount;
        System.out.println(amount + " deposited. Balance is now " + this.balance);
    }

    public void withdraw(int amount) {
        if (amount < 0) {
            System.out.println("Cannot withdraw negative amount");
            return;
        }

        int withdrawal = -amount;
        this.transactions.add(withdrawal);
        this.balance += withdrawal;
        System.out.println(amount + " withdrawan. Balance is now " + this.balance);
    }

    public void calculateBalance() {
        this.balance = 0;

        for (int i = 0; i < this.transactions.size(); i++) {
            this.balance += this.transactions.get(i);
        }

        System.out.println("Calculated balance is " + this.balance);
    }
}
