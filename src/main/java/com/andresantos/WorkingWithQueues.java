package com.andresantos;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main (String[] args) {
        // Create a new Queue
        Queue<Person> queue = new LinkedList<>();
        // Add 3 persons to the Queue
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 18));
        queue.add(new Person("ALi", 40));

    }

    static record Person (String name, int age){}
}
