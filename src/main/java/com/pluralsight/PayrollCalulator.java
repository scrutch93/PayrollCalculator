package com.pluralsight;

import java.util.Scanner;

public class PayrollCalulator {

    public static void main (String[] args){


        Scanner keyboard = new Scanner (System.in);

        System.out.println("Hello, please enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("How many hours have your worked? : ");
        int hours = keyboard.nextInt();

        System.out.println("What is your rate of pay? : ");
        double payRate = keyboard.nextDouble();

        double gross = hours * payRate;

        System.out.println("Your gross pay is : " + gross);
        //double payRate =










    }



}
