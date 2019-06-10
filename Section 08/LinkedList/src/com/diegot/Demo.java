package com.diegot;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by DiegoT on 09/06/2019.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();

        addInOrder(places, "Sydney");
        addInOrder(places, "Melbourne");
        addInOrder(places, "Brisbane");
        addInOrder(places, "Perth");
        addInOrder(places, "Camberra");
        addInOrder(places, "Adelaide");
        addInOrder(places, "Darwin");

        printList(places);

        addInOrder(places, "Alice Springs");
        addInOrder(places, "Darwin");
        printList(places);

        visit(places);
    }

    public static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);

            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before the current
                // Brisbane -> Adelaide

                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("End of list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:");

        System.out.println("0 - quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - show menu");

    }
}
