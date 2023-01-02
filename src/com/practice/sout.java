package com.practice;

import com.ismail.Numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class sout {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet();

        //using add() method//
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println(evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();

        //using addAll() method//
        numbers.addAll(evenNumbers);
        numbers.add(5);
        System.out.println(numbers);

        //Access HashSet() elements//
        //Calling iterator() method//
        Iterator<Integer> a = evenNumbers.iterator();
        System.out.println("HashSet using Iterator: ");

        //Access elements//
        while (a.hasNext()){
            System.out.print(a.next());
            System.out.print(",");
        }

        System.out.println("===========");
        System.out.println(numbers);
        //using remove() method//
        boolean v = numbers.remove(5);
        System.out.println("Is 5 removed: " + v);

        boolean vv = numbers.removeAll(numbers);
        System.out.println("Is all numbers removed: " + vv);

        System.out.println("evenNumbers: " + evenNumbers);
        numbers.add(10);
        numbers.add(4);
        numbers.add(20);
        System.out.println(numbers);

        Set<Integer> numbers2 =     new HashSet<>();
        numbers2.add(30);
        numbers2.add(4);
        numbers2.add(20);


        //Intersection of two sets//
        evenNumbers.retainAll(numbers);
        System.out.println("Intersection is: " + evenNumbers);

        //difference b/w numbers2 and numbers//
        numbers2.removeAll(numbers);
        System.out.println("Difference: " + numbers2);

        System.out.println("numbers: " + numbers);
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);
        System.out.println("numbers2: " + numbers2);

        //check if numbers2 is a subset of numbers//
        boolean result = numbers2.containsAll(numbers);
        System.out.println("is num is subset of num2: " + result);

        HashSet<Integer> x = new HashSet<>();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        System.out.println("x elements: " + x);

        HashSet<Integer> y = new HashSet<>();
        y.add(20);
        y.add(30);
        System.out.println("y elements: " + y);

        //check if y is a subset of x//
        boolean result2 = x.containsAll(y);
        System.out.println("if y is sub set of x: " + result2);

        //clone()//
       x.clone();
        System.out.println(x.clone());

        //empty()
        boolean result3 = x.isEmpty();
        System.out.println("if g is empty: " + result3);

        System.out.println(x.size());

















    }



}
