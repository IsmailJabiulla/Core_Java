package com.practice;

public class Animal {
    String name;
    void eat(){
        System.out.println("i can eat");
    }
}

class lion extends Animal {
    //overriding the eat method//
    @Override
    void eat() {
        super.eat();

        System.out.println("i eat lion food");
    }

    //new method in subclass//
    public void roar(){
      System.out.println("i can roar");
    }

   public static void main(String[] args) {
       lion A = new lion();
        A.eat();
        A.roar();
    }
}