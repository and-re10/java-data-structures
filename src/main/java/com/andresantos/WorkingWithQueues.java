package com.andresantos;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main (String[] args) {
        // Create a new Linked List of Persons
        LinkedList<Person> linkedList = new LinkedList<>();
        // Add 2 persons to the Linked List
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        // Add a new person at the position 1
        linkedList.add(1, new Person("Ali", 18));

    }

    private static void queues() {
        // Create a new Queue
        Queue<Person> queue = new LinkedList<>();
        // Add 3 persons to the Queue
        queue.add(new Person("Alex", 21));
        queue.add(new Person("Mariam", 18));
        queue.add(new Person("ALi", 40));
        // Print the size of the Queue
        System.out.println(queue.size());
        // Print the first item of the Queue
        System.out.println(queue.peek());
        // Remove and print the first item of the Queue
        System.out.println(queue.poll());
        // Print the new size of the Queue
        System.out.println(queue.size());
        // Print the new first item of the Queue
        System.out.println(queue.peek());
    }

    static record Person (String name, int age){}
}
