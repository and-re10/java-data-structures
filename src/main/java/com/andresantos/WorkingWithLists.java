package com.andresantos;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main (String [] args) {
        // Create an Array List
        List<String> colors = new ArrayList<>();
        // Add 3 colors to colors list
        colors.add("purple");
        colors.add("blue");
        colors.add("yellow");
        // Colors can only receive strings
        // colors.add(1); // ERROR
        // colors.add(Object()); // ERROR
        // Print the array list
        System.out.println(colors);
        // Print the size of the list
        System.out.println(colors.size());
        // Print if the list containes yellow (true) and pink (false)
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        // Loop through the list
        // 1st
        for (String color : colors) {
            System.out.println(color);
        }
        // 2nd
        colors.forEach(System.out::println);
        // 3rd
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // Unmodifiable list
        List<String> colorsUnmodifiable = List.of(
                "blue",
                "yellow"
        );
        // We cannot change this list
        // colorsUnmodifiable.add("pink"); // ERROR
    }
}
