package com.generic.practice;

public class GenericMethod {

    public static void main(String[] args) {
        shout("John", "come here");
        System.out.println(shout("Sheela", "go there"));
    }

        private static <T,V> T shout(T whoShouts, V message){
            System.out.println(whoShouts +" "+message+"!!!!!!!!!");
            return whoShouts;
        }
    }
