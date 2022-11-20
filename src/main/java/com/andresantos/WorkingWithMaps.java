package com.andresantos;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main (String[] args) {
        // Create a new Map with persons
        Map<Integer, Person> map = new HashMap<>();
        // Add 3 persons to the map
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Ali"));
        // Print the map
        System.out.println(map);
        // Add a new person with an existing key - it will override the key
        map.put(3, new Person("Ali 2"));
        // Print the size of the map
        System.out.println(map.size());
        // Print the person with the key 1
        System.out.println(map.get(1));
        // Print if the map contains the key 4 (true or false)
        System.out.println(map.containsKey(4));
        // Print all the existing keys
        System.out.println(map.keySet());
        // Print all the entries
        System.out.println(map.entrySet());
    }

    static record Person (String name) {}
}