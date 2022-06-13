package com.generic.practice;

public class EnumEx {

public static void main (String[] args){

    DaysOfTheWeek day = DaysOfTheWeek.FRIDAY;
    System.out.println(day.deliciousnessLevel);
    for (DaysOfTheWeek days: DaysOfTheWeek.values()){
        System.out.println(days);
    }
}
}
