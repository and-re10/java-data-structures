package com.andresantos;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main (String[] args) {
        // Create a new Queue
        Queue<Person> queue = new LinkedList<>();

    }

    static record Person (String name, int age){}
}
