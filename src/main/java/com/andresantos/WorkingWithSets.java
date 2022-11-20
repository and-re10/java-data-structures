package com.andresantos;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main (String[] args) {
        // Create a new Set
        Set<Ball> balls = new HashSet<>();
        // Add 3 balls to the Set
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add((new Ball("red")));
        // Print the size of the balls Set
        System.out.println(balls.size());
        // Print all the balls in the balls set
        balls.forEach(System.out::println);

    }

    // Creating a Ball with record
    record Ball (String color) {}
}
