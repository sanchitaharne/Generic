package com.inheritence.practice;

public class Derived extends Base{

    public Derived(){
        System.out.println("Derived class");
    }

    public static void main(String[] args) {
        Base dr = new Derived();
    }
}
