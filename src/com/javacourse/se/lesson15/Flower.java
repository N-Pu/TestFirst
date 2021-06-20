package com.javacourse.se.lesson15;

public class Flower {
        String name;
        String color;
//    public String name;
//    public String color;

    public Flower() {
    }

    public Flower(String myName, String myColor) {
        name = myName;
        color = myColor;
    }



    public String getName(){

        return name;
    }
    public void setName(String value){
        name = value;
    }



    public String getColor(){

        return color;
    }

    public void setColor(String value){
        color = value;
    }
}

