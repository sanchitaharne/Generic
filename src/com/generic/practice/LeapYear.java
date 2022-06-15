package com.generic.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = sc.nextInt();
        sc.close();

        if(year%4==0)
            System.out.println("Year is a leap Year");
        else
            System.out.println("Year is not a leap year");
    }
}
