package com.example;

public class Assign11 {
    public static void main(String[] args) {
        double cost, qty;
        java.util.Scanner in = new java.util.Scanner( System.in );
        System.out.print( "Enter a quantity: " );
        qty = in.nextDouble( );
        cost = 15000;
        System.out.println( "Total: " + qty * cost );
    }
}
