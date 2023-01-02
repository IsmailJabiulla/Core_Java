package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        //creating an arraylist//
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("ArrayList: " + numbers);

        //creating an instance of iterator//
        Iterator<Integer> iterate = numbers.iterator();

        //using the next() method//
        int number = iterate.next();
        System.out.println("Accessed Element: " + number);

        //using the remove() method//
        iterate.remove();
        System.out.println("Removed Element: " + number);
        System.out.println("updated array list: " + number);

        //using the hasNext() method//
        while (iterate.hasNext()){
            //using the for each remaining method//
            iterate.forEachRemaining((value) ->System.out.print(value + " ,"));
        }



    }





}
