package com.practice;

import java.util.Scanner;

class JavaArrays2 {

    static void printArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   public static void main(String[] args) {

       //Taking Array input in Java
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Size of Array");
       int n = sc.nextInt();
       int[] arr = new int[n];

       System.out.println("Enter "+ n + " elements ");
       for (int i=0; i< n; i++){
           arr[i] = sc.nextInt();
       }
   //    for (int i =0; i< n; i++){
   //        System.out.print(arr[i]+ " ");
       System.out.println("original arr");
       printArray(arr);

       int[] arr_2 = arr;
       System.out.println("copied arr_2");
       printArray(arr_2);

       //changing some values of arr_2
       arr_2[0] = 0;
       arr_2[1] = 0;
       System.out.println("original array after  changing arr_2");
       printArray(arr);

       System.out.println("copied arr_2 after changing arr_2");
       printArray(arr_2);



       }
       //Trying to copy arr to arr_2


       //for (int i=0; i<n; i++){
       //    System.out.print(arr_2[i] + " ");
       }




