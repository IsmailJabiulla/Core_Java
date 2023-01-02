package com.practice;

public class PwVariables {
    public static void main(String[] args) {
        //Q2 - Print the ASCII value of character ‘U’
        int x = 'U';
        System.out.println("The ASCii value of character u is: "+ x);

        //Write a Java program to take the length and breadth of a rectangle and print its area.
        int length = 5;
        int breadth = 6;
        System.out.println("The length is: "+ length);
        System.out.println("The breadth is: "+ breadth);
        int area = length*breadth;
        System.out.println("The area is: "+ area);

        //Write a Java program to calculate the cube of a number
        int a = 2;
        int qube= a*a*a;
        System.out.println("the side is: "+ a);
        System.out.println("the qube is: "+ qube);

        //Write a Java program to swap two numbers with the help of a third variable.
        int num_1 = 5;
        int num_2 = 10;
        System.out.println("the first num before swap: "+ num_1);
        System.out.println("the last num before swap: "+ num_2);
        int temp;//variable used to swap two nums
        temp = num_1;
        num_1 = num_2;
        num_2= temp;
        System.out.println("the first num after swap: "+ num_1);
        System.out.println("the last num after swap: "+ num_2);
    }



}
