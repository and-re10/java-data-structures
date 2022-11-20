package com.andresantos;

import java.util.HashSet;
import java.util.Objects;
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
        // Remove red ball from the balls Set
        balls.remove(new Ball("red"));
        // Print the new size of the balls Set
        System.out.println(balls.size());
        // Add a repeated blue ball to the balls Set
        // For Ball as a record, the Set don't add the repeated element
        // For Ball as a class we need to override the equals and the HashCode to the class
        // Without the override, the ball will be repeated in the Set
        balls.add(new Ball("blue"));

    }

    // Creating a Ball as a record
    // record Ball (String color) {}
    // Creating Ball as a class
    static class Ball {
        String color;
        public Ball(String color) {
            this.color = color;
        }


    }
}
