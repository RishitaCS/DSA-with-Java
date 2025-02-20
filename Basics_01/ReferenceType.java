package Basics_01;

import java.util.Date;

/*
What is Reference Type in Java?
Reference Type store the address of an object which is created in the Heap Memory.
Heap - it is a memory area which contain the objects.
*/
public class ReferenceType {
    public static void main(String[] args) {
        int x = 100;
        String y = "Rishita"; //String literal
        Date date = new Date(); //new object
        // new is a keyword and it use to allocate a memory (C - malloc function)
        System.out.println(date);
        System.out.println(y);
    }
}
