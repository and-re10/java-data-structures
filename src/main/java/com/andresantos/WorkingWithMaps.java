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
        // Remove the person with key 3
        map.remove(3);
        // Loop through the map with entry set
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        // Loop through the map with foreach
        map.forEach((key, person) -> {
            System.out.println(key + " " + person);
        });
        // Print the person with key 3 with default value if it don't exists
        System.out.println(map.getOrDefault(3, new Person("default")));
        // Print only the values of the map
        System.out.println(map.values());
    }

    static record Person (String name) {}
}
