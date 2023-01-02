package com.practice;

import java.util.Scanner;

public class HackerRankStaticIntializer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B,H;
        B = sc.nextInt();
        H = sc.nextInt();

        if (B>0 && H>0){
            int area = B*H;
            System.out.println(area);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }
}
