package com.generic.practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {
        //add data
        String[] friendsArr2 = {"john","chris","eric","luke"};
        ArrayList<String> newFreindsArrList = new ArrayList<>(Arrays.asList("mary","lisa","mona","claire"));
        System.out.println(friendsArr2[1]);
        System.out.println(newFreindsArrList.get(1));

        //length of array
        System.out.println(friendsArr2.length);
        System.out.println(newFreindsArrList.size());

        //adding new data to the array
        newFreindsArrList.add("morgan");
        System.out.println(newFreindsArrList.get(4));

        //set an element
        friendsArr2[1] = "patt";
        System.out.println(friendsArr2[1]);
        newFreindsArrList.set(1,"lim");
        System.out.println(newFreindsArrList.get(1));

        //remove the element
        newFreindsArrList.remove(2);
        System.out.println(newFreindsArrList.get(2));

        //printing array
        System.out.println(friendsArr2);
        System.out.println(newFreindsArrList);
    }
}
