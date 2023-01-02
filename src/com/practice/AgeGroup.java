package com.practice;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //int age = sc.nextInt();

        //if (age<=12){
          //  System.out.println("child");
        //}else if (age >12 && age <18){
         //   System.out.println("teenager");
        //} else {
          //  System.out.println("adult");
        //}


   //    int cp,sp;
     //   System.out.println("enter cost price:");
       // cp = sc.nextInt();
   //     System.out.println("enter selling price");
     //    sp = sc.nextInt();
       //  int amt;
        // if (cp>sp){
         //    amt  = cp-sp;
         //    System.out.println("the loss is: "+ amt);
        // }else if (cp<sp){
         //    amt = sp-cp;
           //  System.out.println("the profit is: "+ amt);
         //}else {
           //  System.out.println("no profit no loss+");
         //}

        int x;
        System.out.println("enter an integer:");
        x = sc.nextInt();
        if (x>=0){
            System.out.println("you entered a positive num");
        }else {
            System.out.println("you num is negative and is skipped");
        }


    }
}
