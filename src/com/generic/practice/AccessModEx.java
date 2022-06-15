package com.generic.practice;

public class AccessModEx extends AccessModifiers{

    public static void main(String[] args) {
        AccessModEx am = new AccessModEx();
        System.out.println(am.i);
        System.out.println(am.k);
        System.out.println(am.l);

        am.test1();
        am.test3();
        am.test4();
    }
}
