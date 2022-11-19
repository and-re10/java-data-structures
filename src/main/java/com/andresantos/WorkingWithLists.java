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

    }
}
