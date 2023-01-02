package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class hackerrank4 {
    // public static void main(String[] args) {
    // Scanner a = new Scanner(System.in);
    // int N = a.nextInt();
    //  for (int i=1; i<=10; i++){
    //   System.out.println(N+" x "+ i+" = "+ N*i);

    //}
//}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for ( int i=1; i<=10; i++){
            System.out.println(N+" x "+ i+ " = "+ N*i);
        }

    }





        }