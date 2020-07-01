package com.example;

import java.util.Scanner;

public class Assign12 {
    public static void main(String[] args) {
        // declare data
        double firstnum;
        double secondnum;
        double product;
        // input data
         java.util.Scanner in = new Scanner( System.in );
        System.out.print( "Enter first number to multiply: " );
          firstnum =in.nextDouble( );
        System.out.print("Enter second number to multiply: " );
          secondnum = in.nextDouble( );
        // calculate result
        product = firstnum * secondnum;
        // output results
        System.out.print( firstnum + " * " );
        System.out.print( secondnum + " = " );
        System.out.println( product );
    }
}
