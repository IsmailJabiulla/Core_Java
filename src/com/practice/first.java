package com.practice;

import java.util.EnumSet;
import java.util.Iterator;

public class first {

    //an enum named size
    enum  Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        //creating an Enumset using allof()
        EnumSet<Size> a = EnumSet.allOf(Size.class);

        System.out.println("EnumSEt: "+ a);

        Iterator<Size> i = a.iterator();
        System.out.print("EnumSet i: ");
        while (i.hasNext()){
            System.out.print(i.next());
            System.out.print(", ");
        }

        //creating an EnumSet using noneoff()
        EnumSet<Size> b = EnumSet.noneOf(Size.class);
        System.out.println("EnumSet: "+ b);

        //using add() method
        b.add(Size.MEDIUM);
        System.out.println("EnumSet usind add: "+ b);

        //using addAll() method
        b.addAll(a);
        System.out.println("EnumSet using addAll: "+ b);


        //creating an EnumSet using range()
        EnumSet<Size> c = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("EnumSet: "+ c);

        //creating an EnumSet using of()
        EnumSet<Size> d = EnumSet.of(Size.MEDIUM);
        System.out.println("EnumSet1: "+ d);

        EnumSet<Size> e = EnumSet.of(Size.SMALL, Size.LARGE);
        System.out.println("EnumSet2: "+ e);

        System.out.println("now==="+ a);

        //using remove()
        boolean j = a.remove(Size.MEDIUM);
        System.out.println("Is MEDIUM removed? "+ j);

        //using removeall()
        boolean k = a.removeAll(a);
        System.out.println("Is all elements removed? "+ k);

        EnumSet<Size> cpyof = EnumSet.copyOf(d);
        System.out.println("copied: "+ cpyof);

        boolean cntns = a.contains(Size.LARGE);
        System.out.println("Is LARGE founded? "+ cntns);

        System.out.println("a is: "+ a);

        boolean empt = b.isEmpty();
        System.out.println("Is b is empty? "+ empt);
        System.out.println("b: "+ b);

        int sze = b.size();
        System.out.println("sze: "+ sze);

        System.out.println("then b: "+ b);

        b.clear();
        System.out.println("now b: "+ b);






    }




}
