package com.diegot;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone myMobilePhone = new MobilePhone("+54 351 23444353");

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.println("Enter action: (6 to show available actions)");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Quitting...");
                    quit = true;
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchContact();
                    break;
                default:
                    printInstructions();
                    break;
            }
        }

        scanner.close();

    }

    private static void searchContact() {
        System.out.println("Enter name contact to search:");
        String removeName = scanner.nextLine();

        Contact foundContact = myMobilePhone.queryContact(removeName);

        if (foundContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + foundContact.getName() + " phone number is " + foundContact.getPhoneNumber());
    }

    private static void removeContact() {
        System.out.println("Enter name contact to remove:");
        String removeName = scanner.nextLine();

        Contact foundContact = myMobilePhone.queryContact(removeName);

        if (foundContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (myMobilePhone.removeContact(foundContact)) {
            System.out.println("Successfully removed contact");
        } else {
            System.out.println("Error removing contact");
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To quit the application.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an contact in the list.");
        System.out.println("\t 3 - To modify an contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To print choice options.");
        System.out.println("Enter choice:");

    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String number = scanner.nextLine();

        Contact newContact = new Contact(name, number);

        if (myMobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name=" + name + ", phone=" + number);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String oldName = scanner.nextLine();

        Contact oldContact = myMobilePhone.queryContact(oldName);

        if(oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = new Contact(newName, newNumber);
        if (myMobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void printContactList() {
        myMobilePhone.printContactList();
    }
}
