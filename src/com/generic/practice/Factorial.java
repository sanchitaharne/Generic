package com.generic.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number \n");
        int value = sc.nextInt();
        sc.close();
        int factorial = value;
       for(int j = value-1; j>1;j--){
           factorial = factorial * j ;
       }

        System.out.println("factorial of the number is "+factorial);

    }
}
