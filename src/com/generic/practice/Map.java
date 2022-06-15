package com.generic.practice;

import java.util.HashMap;

public class Map    {

    public static void main(String[] args) {

        HashMap<String,Integer> empIds = new HashMap<>();
        empIds.put("john",234);
        empIds.put("singh",2134);
        empIds.put("alex",2341);
        empIds.put("rahul",2314);
        System.out.println(empIds);

        System.out.println(empIds.get("john"));
        System.out.println(empIds.containsKey("george"));
        System.out.println(empIds.containsValue("333"));
        empIds.put("john",1111);
        System.out.println(empIds);

        empIds.put("cramer",1111);
        System.out.println(empIds);

        empIds.put("cramer",1111);
        System.out.println(empIds);

        empIds.replace("rahul",2314,4444);
        System.out.println(empIds);
    }
}
