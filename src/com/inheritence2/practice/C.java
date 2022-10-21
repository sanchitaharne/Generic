package com.inheritence2.practice;

public class C extends B{

    public void method1(){
        System.out.println("Hello from C");
    }

    public static void main(String[] args) {

        C c = new C();
        c.method1();

        B b = new B();
        b.method1();

        B b1 = new C();
        b1.method1();

        A a = new C();
        a.method1();

        A a1 = new B();
        a1.method1();

        A a2 = new A();
        a2.method1();
    }

}
