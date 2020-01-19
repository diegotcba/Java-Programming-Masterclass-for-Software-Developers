package com.diegot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DiegoT on 07/10/2019.
 */
public class MapProgam {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "a interpreted, objet-oriented, high-level programming language with dynamic semantic");
        languages.put("Algol", "a algoritmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Insctruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println("============================================================================");

        //languages.remove("Lisp");

        if(languages.remove("Algol", "a algoritmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        //System.out.println(languages.replace("Scala", "This will not be added"));
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
