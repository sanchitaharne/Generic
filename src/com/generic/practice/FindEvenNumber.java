package com.generic.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrIntList = new ArrayList<>(Arrays.asList(2,5,6,7,4,3,1,9));
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (Integer i: arrIntList){
            if(i%2==0){
                evenList.add(i);
            }
            else{
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);
    }

}
