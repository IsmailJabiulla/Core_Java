package com.practice;

import java.util.Calendar;

public class Fruit {
    String name;
    void Taste(){
        System.out.println("Sweet");
    }
}

class Orange2 extends Fruit{
    public void colour(){
        System.out.println("the colour is "+ name);
    }

    public static void main(String[] args) {
        Orange2 A = new Orange2();
        A.name = "orangeeee";
        A.colour();
        A.Taste();

    }
}