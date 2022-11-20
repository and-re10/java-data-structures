package com.andresantos;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main (String[] args) {
        // Create a new Map with persons
        Map<Integer, Person> map = new HashMap<>();

    }

    static record Person (String name) {}
}
