package com.andresantos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        // Create a new Array of string with 5 elements
        String[] colors = new String[5];
        // color in position 0 recives "purple" and color in position 1 recieves "blue"
        colors[0] = "purple";
        colors[1] = "blue";
        // Print all the array has a string
        System.out.println(Arrays.toString(colors));
        // print color 0 and 1
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        // color in the position 2 is yellow
        colors[2] = "yellow";
        // Pring the upfated array of colors
        System.out.println(Arrays.toString(colors));
        // ARray of integers with a fixed size
        int[] numbers = {100, 200};

        // Loop through Arrays
        // 1st - from the firt to the last
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        // 2nd - from the last to the first
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }
        // 3rd
        for (String color : colors) {
            System.out.println(color);
        }
        // Stream all the elements of the colors array
        Arrays.stream(colors).forEach(System.out::println);
    }
}
