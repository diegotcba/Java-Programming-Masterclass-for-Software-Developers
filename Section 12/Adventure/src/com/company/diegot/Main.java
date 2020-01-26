package com.company.diegot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static final String WEST_EXIT = "W";
    private static final String EAST_EXIT = "E";
    private static final String SOUTH_EXIT = "S";
    private static final String NORTH_EXIT = "N";

    private static final String QUIT = "Q";

    public static void main(String[] args) {
        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner = new Scanner(System.in);


        Map<String, String> keywords = new HashMap<String, String>();
        keywords.put("WEST", WEST_EXIT);
        keywords.put("EAST", EAST_EXIT);
        keywords.put("SOUTH", SOUTH_EXIT);
        keywords.put("NORTH", NORTH_EXIT);
        keywords.put("QUIT", QUIT);

        Map<String, Integer> tempExits = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", tempExits));

        // Road exits
        tempExits = new HashMap<String, Integer>();
        tempExits.put(WEST_EXIT, 2);
        tempExits.put(EAST_EXIT, 3);
        tempExits.put(SOUTH_EXIT, 4);
        tempExits.put(NORTH_EXIT, 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building", tempExits));

        // Hill exits
        tempExits = new HashMap<String, Integer>();
        tempExits.put(NORTH_EXIT, 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExits));

        // Building exits
        tempExits = new HashMap<String, Integer>();
        tempExits.put(WEST_EXIT, 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExits));

        // Valley exits
        tempExits = new HashMap<String, Integer>();
        tempExits.put(NORTH_EXIT, 1);
        tempExits.put(WEST_EXIT, 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream", tempExits));

        // Forest exits
        tempExits = new HashMap<String, Integer>();
        tempExits.put(WEST_EXIT, 2);
        tempExits.put(SOUTH_EXIT, 1);
        locations.put(5, new Location(5, "You are in the forest", tempExits));

        int loc = 1;

        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words) {
                    if(keywords.containsKey(word)) {
                        direction = keywords.get(word);
                        break;
                    }
                }

            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction!");
            }
        }

    }
}
