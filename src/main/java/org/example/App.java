/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static double roundMoney(double raw){
        return Math.round(raw*100)/100.0;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "How many euros are you exchanging? " );
        double euro = input.nextDouble();
        System.out.print( "What is the exchange rate? " );
        double rate = input.nextDouble();

        double $ = roundMoney(euro * rate);

        System.out.print(euro + " euros at an exchange rate of " + rate +
                " is\n" + $ + " U.S. dollars.");
    }
}
