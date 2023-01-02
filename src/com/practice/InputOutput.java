package com.practice;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.next();
        String last_name = sc.next();
        int roll_number = sc.nextInt();
        String field_of_interest = sc.next();
        System.out.println("name: "+ first_name+" "+last_name);
        System.out.println("roll number: "+ roll_number);
        System.out.println("field of interest: "+ field_of_interest);
        System.out.println(first_name+" "+last_name+" "+roll_number+" "+field_of_interest);

        String first = sc.next();
        String second = sc.next();
        System.out.println(first+second);
    }
}
