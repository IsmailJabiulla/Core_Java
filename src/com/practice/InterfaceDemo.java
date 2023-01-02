package com.practice;

interface NewInterface2 {
    // Java program to demonstrate
// static method in Interface
        static void hello()
        {
            System.out.println("Hello, New Static Method Here");
        }

        // Public and abstract method of Interface
        void overrideMethod(String str);
    }

// Implementation Class
public class InterfaceDemo implements NewInterface2 {

    public static void main(String[] args)
    {
        InterfaceDemo interfaceDemo = new InterfaceDemo();

        // Calling the static method of interface
        NewInterface2.hello();

        // Calling the abstract method of interface
        interfaceDemo.overrideMethod("Hello, Override Method here");
    }

    // Implementing interface method

    @Override
    public void overrideMethod(String str)
    {
        System.out.println(str);
    }
}
