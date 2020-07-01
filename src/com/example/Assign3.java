package com.example;

import java.util.Scanner;

public class Assign3 {
    public static void main( String [] args ) {
// declare variables
        double number1, number2, number3;
        //input data
        Scanner in = new Scanner(System.in);
        System.out.print("Number 1? ");
        System.out.print("Number 2? ");
        System.out.print("Number  3? ");
        number1 = in.nextDouble();
        number2 = in.nextDouble();
        number3 = in.nextDouble();
        // calculate average
        double average = (number1 + number2 + number3 )/ 3;
// print results
        System.out.print(number1 + ", " + number2 + " & " + number3);
        System.out.println(" averages to " + average);

    }
}
