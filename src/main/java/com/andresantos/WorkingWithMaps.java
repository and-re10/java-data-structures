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
        // Add a new person with an existing key
        map.put(3, new Person("Ali 2"));
    }

    static record Person (String name) {}
}
