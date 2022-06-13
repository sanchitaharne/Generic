package com.generic.practice;

public enum DaysOfTheWeek {


    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    final int deliciousnessLevel;

    DaysOfTheWeek (int deliciousnessLevel){
        this.deliciousnessLevel = deliciousnessLevel;
    }
}
