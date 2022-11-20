package com.andresantos;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main (String[] args) {
        // Create a new Stack of Integers
        Stack<Integer> stack = new Stack<>();
        // Add 3 numbers to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Print the top item of the stack
        System.out.println(stack.peek());
        // Print the size of the stack
        System.out.println(stack.size());
        // Remove the top item of the stack
        System.out.println(stack.pop());
        // Print the new size of the stack
        System.out.println(stack.size());
        // Print if the stack is empty with a true of false
        System.out.println(stack.empty());

    }
}
