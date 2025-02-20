package Basics_01;

public class Datatypes {
    public static void main(String[] args) {
        byte age = 21;
        float roi = 9.5F;
        boolean att = true;
        char a = 'A';
        System.out.println(a);
        int x = 10;
        int y = x;
        System.out.println(x+20);
        System.out.println(x);
        // x = x + 20;
        // System.out.println(x);
        y++; // y=y+1;
        System.out.println(y);
        System.out.println(x); // Immutable type
    }
}
