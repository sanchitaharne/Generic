package com.generic.practice;


import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("sanchita");
        namesLinkedList.add("nithya");
        namesLinkedList.add("prasad");

        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(2, "akshara");
        System.out.println(namesLinkedList.get(2));
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("sanchita");
        namesArrayList.add("nithya");
        namesArrayList.add("prasad");

        System.out.println(namesArrayList.get(2));
        namesLinkedList.add(2, "akshara");

        //arraylist is effecient in traversing the array and get the element but way slower than linked list while adding a new element
        //LinkedList is effecient in adding new elements

    }
}
