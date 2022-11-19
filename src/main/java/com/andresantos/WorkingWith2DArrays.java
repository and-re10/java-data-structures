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
        // fill the board on column 0 row 0, column 0 row 1 and column 0 row 2 witho 'O'
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        // Print the 2D array as a string
        System.out.println(Arrays.deepToString(board));

    }
}
