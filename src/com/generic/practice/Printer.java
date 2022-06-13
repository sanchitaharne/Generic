package com.generic.practice;

import javafx.animation.Animation;

public class Printer <T extends Pet>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
