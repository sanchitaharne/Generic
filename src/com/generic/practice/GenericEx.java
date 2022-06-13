package com.generic.practice;

import jdk.nashorn.internal.ir.CatchNode;

public class GenericEx extends Pet {

    public static void main(String[] args) {
        Printer<Cat> cats = new Printer<>(new Cat());
        Printer<Dog> dogs = new Printer<>(new Dog());

        cats.print();
        dogs.print();
    }
}
