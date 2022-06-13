package com.generic.practice;

public class Cat extends Pet{
String name;
    private String litterPreference;
    public Cat(String name){
        this.name = name;
    }
    public Cat(){

    }

    public String getLitterPreference(){
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference){
        try{
            this.litterPreference = litterPreference;
        }
        catch (Exception o){
            System.out.println("exception caught");
        }
    }
}
