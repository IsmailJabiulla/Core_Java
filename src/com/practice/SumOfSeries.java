package com.practice;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem:- find the sum of the following series s=1-2+3-4....n
        //if n = 5:- 1-2+3-4+5 = 3

        int n = sc.nextInt();
        int ans = 0;

        for (int i=1; i<=n; i++){
            if (i%2 ==0){
                ans -= i;
            } else {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
