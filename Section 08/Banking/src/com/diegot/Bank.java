package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 09/06/2019.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String newBranch) {
        if (findBranch(newBranch) != null) {
            System.out.println(newBranch + " already exists");
            return false;
        }

        this.branches.add(new Branch(newBranch));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch foundBranch = findBranch(branchName);

        if (foundBranch != null) {
            return foundBranch.addCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch foundBranch = findBranch(branchName);

        if (foundBranch == null) {
            return false;
        }

        return foundBranch.addCustomerTransaction(customerName, amount);
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch foundBranch = findBranch(branchName);

        if (foundBranch == null) {
            return false;
        }

        ArrayList<Customer> branchCustomers = foundBranch.getCustomers();
        System.out.println("Customer list for branch " + foundBranch.getName());
        for (int i = 0; i < branchCustomers.size(); i++) {
            Customer customer = branchCustomers.get(i);

            System.out.println("Customer: " + customer.getName() + " [" + (i+1) + "]");
            if (showTransactions) {
                ArrayList<Double> transactions = customer.getTransactions();
                System.out.println("\tTransactions");
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("\t[" + (j+1) + "] Amount " + transactions.get(j));
                }
            }
        }

        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch currentBranch = this.branches.get(i);
            if (currentBranch.getName().equals(branchName)) {
                return currentBranch;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }
}
