///*
// *  UCF COP3330 Summer 2021 Assignment 12
// *  Copyright 2021 steven ortiz
// */

//Enter the principal: 1500
//Enter the rate of interest: 4.3
//Enter the number of years: 4
//After 4 years at 4.3%, the investment will be worth $1758.


package org.example;

import java.util.Scanner;

import java.text.DecimalFormat;

public class App {

    static Scanner in = new Scanner(System.in);


    private static double initial() {

        System.out.print("Enter the principal value: ");

        return in.nextDouble();

    }

    private static double rate() {

        System.out.print("Enter the rate of interest: ");

        return in.nextDouble();

    }

    private static double time() {

        System.out.print("Enter the number of years: ");

        return in.nextDouble();

    }


        public static void main(String[] args) {

        double initial = initial();

        double rate = rate();

        double time = time();

        double yearlyRate = ((initial * (1 + ((rate / 100) * time)))) * 100;

        Double Rate = (Double) Math.ceil(yearlyRate);

        double rateEnd = Rate / 100.0;

        System.out.print("After "+time+" years at "+rate+"%, the investment will be worth $");

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print(format.format(rateEnd));

    }
}
