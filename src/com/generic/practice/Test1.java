package com.generic.practice;

public class Test1 {

public void add(int a, int b){
    System.out.println(a+b);
}

public void add(double a, double b){
    System.out.println(a+b);
}

    public static void main(String[] args) {

        Test1 test = new Test1();
        test.add(1,2);
        test.add(1.2,2.3);

    }
}
