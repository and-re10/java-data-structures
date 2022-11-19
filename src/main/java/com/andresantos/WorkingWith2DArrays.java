package com.andresantos;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main (String[] args) {
        // Create a 2D Array
        char [][] board = new char[3][3];
        // Fill thr array with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

    }
}
