package com.diegot;

import java.util.ArrayList;

/**
 * Created by DiegoT on 09/06/2019.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String newCustomerName, double firstTransaction) {
        // check if new customer exists
        Customer foundCustomer = findCustomer(newCustomerName);

        if (foundCustomer != null) {
            System.out.println(newCustomerName + " was found on file");
            return false;
        }

        this.customers.add(new Customer(newCustomerName, firstTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer foundCustomer = findCustomer(customerName);

        if (foundCustomer == null) {
            System.out.println(customerName + " was not found");
            return false;
        }

        foundCustomer.addTransaction(amount);
        return true;
    }

    public void printCustomers(boolean printTransactions) {
        System.out.println("Customer List");
        for (int i = 0; i < this.customers.size(); i++) {
            System.out.println("\t\t" + (i+1) + "- " + this.customers.get(i).getName());
            if (printTransactions) {
                this.customers.get(i).printTransactions();
            }
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer currentCustomer = this.customers.get(i);
            if (currentCustomer.getName().equals(name)) {
                return currentCustomer;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
