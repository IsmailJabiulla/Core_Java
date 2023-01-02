package com.practice;

public class MaxVariablesDemo {
    public static void main(String[] args) {
        //integers
        byte smallestByte = Byte.MIN_VALUE;
        short smallestShort = Short.MIN_VALUE;
        int smallestInteger = Integer.MIN_VALUE;
        long smallestLong = Long.MIN_VALUE;

        //real numbers
        float smallestFloat = Float.MIN_VALUE;
        double smallestDouble = Double.MIN_VALUE;

        //other primitive types
        char aChar = 'S';
        boolean aBoolean = true;

        //Display them all
        System.out.println("The smallest byte value is " + smallestByte + ".");
        System.out.println("The smallest short value is " + smallestShort + ".");
        System.out.println("The smallest integer value is " + smallestInteger + ".");
        System.out.println("The smallest long value is " + smallestLong + ".");
        System.out.println("The smallest float value is " + smallestFloat + ".");
        System.out.println("The smallest double value is " + smallestDouble + ".");

        if (Character.isUpperCase(aChar)){
            System.out.println("The Character " + aChar + " is UpperCase. ");
        } else {
            System.out.println("The Character " + aChar + " is lowercase. ");
        }
        System.out.println("The value of aBoolean is " +aBoolean + ".");




    }




}
