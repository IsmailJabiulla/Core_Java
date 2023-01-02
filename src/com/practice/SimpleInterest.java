package com.practice;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("Enter rate of Interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        int t = sc.nextInt();

        float sI = (p * r * t)/100;


        System.out.println("Principle: "+ p);
        System.out.println("Rate: "+ p);
        System.out.println("Time: "+ p);

        System.out.println("Simple Interest: "+ sI);

    }





}
