package com.example;

import java.util.Scanner;

public class Assign14 {
    public static void main(String[] args) {
        // declare data
         double celsius;
         double fahrenheit;
        // input temperature
        Scanner in = new Scanner( System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        fahrenheit = in.nextDouble( );
        // calculate celsius equivalent
         celsius = 5.0/9 * (fahrenheit - 32);
        // output results
        System.out.print( fahrenheit+ "\u00B0"+"F= " );
        System.out.println( celsius+ "\u00B0"+"C" );


    }
}
