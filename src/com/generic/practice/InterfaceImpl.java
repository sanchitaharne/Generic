package com.generic.practice;

public class InterfaceImpl implements InterfaceEx{

    String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        InterfaceImpl im = new InterfaceImpl();
        im.setName("sanchita");
        System.out.println(im.getName());
    }
}
