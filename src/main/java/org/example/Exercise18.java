/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 18 - Temperature Converter

package org.example;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
    //Choose F or C
        Scanner getInfo = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. ");
        String temp_type = getInfo.nextLine();

        System.out.println(String.format("Your choice: " +temp_type));

        //if-else for choice - includes both for lower/uppercase choices per constraint
        //initialize variables and create scanner for both if-else
        double temp_F, temp_C;
        Scanner getTemp = new Scanner(System.in);

        // F to C conversion
        if(temp_type.equals("c") | temp_type.equals("C")){

            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp_F = getInfo.nextInt();
            temp_C = (temp_F - 32) * 5 / 9;
            System.out.println(String.format("The temperature in Celsius is %.02f.", temp_C));
        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            temp_C = getInfo.nextInt();
            temp_F = (temp_C * 9 / 5) + 32;
            System.out.println(String.format("The temperature in Fahrenheit is %.02f.", temp_F));
        }
    }
}
