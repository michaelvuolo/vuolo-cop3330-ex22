/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // setup largest variable
        int largest = 0;

        // record values
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        // determine output
        if (first == second && first == third) {
            System.out.print("Exiting... Please make sure all three numbers are different.");
            System.exit(0);
        }
        else if (first >= second && first >= third)
            largest = first;
        else if (second >= first && second >= third)
            largest = second;
        else
            largest = third;

        System.out.print("The largest number is " + largest + ".");
    }
}

