package com.practice;

import sun.java2d.loops.CustomComponent;

import java.util.*;

public class Queusssss {
    public static void main(String[] args) {
        //implementing queue//
        Queue<String> queue = new LinkedList<>();
        //adding elements in queue//
        queue.add("orange");
        queue.add("banana");
        queue.add("mango");
        queue.add("apple");

        //prints the front of the queue//
        System.out.println(queue.peek());

        //remove element from queue//
        queue.remove();
        queue.remove();

        //prints the front of the queue//
        System.out.println(queue.peek());

        //returns the total number of elements present in the queue//
        System.out.println(queue.size());
       //check if the queue is empty//
        if (queue.isEmpty()) {
            System.out.println("the queue is empty");
        } else {
            System.out.println("the queue is not empty");
        }
        System.out.println("===============================================");

        //implementing the LinkedList() class//

        //creating queue using linkedlist class//
        Queue<Integer> numbers3 = new LinkedList<>();

        //offer() elements to the queue//
        numbers3.offer(11);
        numbers3.offer(22);
        numbers3.offer(33);
        System.out.println("Queue: " + numbers3);

        //Access elements of the queue//
        int s = numbers3.peek();
        System.out.println("Accessed element: " + s);

        //remove element from the queue//
        int rem = numbers3.remove();
        System.out.println("Removed Element: " + rem);

        System.out.println("Updated Queue: " + numbers3);


        System.out.println("++++++++++++++++++++++++++++");


         //priority queue////
        System.out.println("Topic= insertElements to PriorityQueue");

        //creating a priority queue//
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        //using the add() method//
        numbers.add(30);
        numbers.add(20);
        System.out.println("Priority Queue: " + numbers);

        //using the offer() method//
        numbers.offer(10);
        System.out.println("updated Priority Queue: " + numbers);


        System.out.println("Access PriorityQueue Elements");
        System.out.println(numbers);
        int a = numbers.peek();
        System.out.println("Accessed Element: " + a);



        System.out.println("Topic = Remove PriorityQueue Elements");
        System.out.println(numbers);
        //using remove() method//
        boolean b = numbers.remove(20);
        System.out.println("is the element 20 removed? " + b);

        //using the poll() method//
        int c = numbers.poll();
        System.out.println("removed element using poll(): " + c);
        System.out.println("numbers now " + numbers);
        numbers.add(10);
        numbers.add(20);

        System.out.println("Topic = Iterating Over a PriorityQueue");
        System.out.println(numbers);

        //using the iterator() method//
        Iterator<Integer> ir = numbers.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
            System.out.println(" ,");

        }
        //contains() method//
        boolean d = numbers.contains(40);
        System.out.println("is this element 20 is found: " + d);

        //size() method//
        int f = numbers.size();
        System.out.println(f);

        //toArray() method//
        Object[] g = numbers.toArray();
        System.out.println(g);


        System.out.println("Topic = PriorityQueue Comparator");

        // Creating a priority queue
        PriorityQueue<Integer> numbersz = new PriorityQueue<>(new CustomComparator());
        numbersz.add(4);
        numbersz.add(2);
        numbersz.add(1);
        numbersz.add(3);
        System.out.print("PriorityQueue: " + numbersz);
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer number1, Integer number2) {
        int value =  number1.compareTo(number2);
        // elements are sorted in reverse order
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
