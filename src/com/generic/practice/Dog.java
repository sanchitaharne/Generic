package com.generic.practice;

public class Dog extends Pet{
String name;
    private String foodPreference;
    public Dog(String name){
        this.name = name;
    }
    public Dog(){

    }

    public String getFoodPreference(){
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference){
        try{
            this.foodPreference = foodPreference;
        }
        catch (Exception o){
            System.out.println("exception caught");
        }
    }
}
