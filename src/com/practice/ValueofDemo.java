package com.practice;

public class ValueofDemo {
    public static void main(String[] args) {

        //this program requires two
        //arguments on the command line
        if (args.length == 2){
            //convert String to numbers
            float a = Float.valueOf(args[0]);
            float b = Float.valueOf(args[1]);


            //do some arithmetic
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a *b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

        }
        else {
            System.out.println("This program " + "requires two command-line arguments");
        }
    }
}
