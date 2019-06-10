package com.diegot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DiegoT on 09/06/2019.
 */
public class MobilePhone {
    private String myNumber;
    private List<Contact> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public boolean addContact(Contact contact) {
        if(findContact(contact) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was no found");
            return false;
        } else if (findContact(newContact) >= 0) {
            System.out.println(newContact.getName() + " already exists");
            return false;
        }

        this.contactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replace by " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);

        if (position < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }

        this.contactList.remove(position);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    private int findContact(Contact contact) {
        return contactList.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contactList.size(); i++) {
            if (this.contactList.get(i).getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }

        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);

        if (position >= 0) {
            return this.contactList.get(position);
        }

        return null;
    }

    public void printContactList() {
        System.out.println("Contact list");
        for (int i = 0; i < this.contactList.size(); i++) {
            System.out.println((i + 1) + "." + this.contactList.get(i).getName()
            + " -> " + this.contactList.get(i).getPhoneNumber());
        }
    }
}
