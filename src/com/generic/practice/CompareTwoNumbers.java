package com.generic.practice;

import java.util.ArrayList;

public class CompareTwoNumbers {
    public static void main(String[] args) {
      ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(3);
        arrInt.add(5);

        String res = arrInt.get(0)>arrInt.get(1)?"pass":"fail";
        System.out.println(res);

        }
    }
