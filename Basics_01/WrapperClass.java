package Basics_01;
import java.math.*;
import java.util.Date;
public class WrapperClass {
    public static void main(String[] args) {
        int e = 100; //Value type
        Integer e2 = 100; // Ref type
        float w = e2.floatValue(); // Easy TypeCasting
        int v = Integer.parseInt("10000"); // string to int
        System.out.println(e);
        System.out.println(w);
        System.out.println(v);
        // Integer pool 1 Byte Range value
        // -128 to 127
        Integer i = 128;
        Integer j = 128;
        System.out.println(i==j);
        BigInteger x = new BigInteger("322324568786875969698978645234576965654");
        BigInteger y = new BigInteger("322324568786812345766790787654323457694"); 
        BigInteger z = x.add(y);
        System.out.println(z);
        Date d = new Date();
        System.out.println("Date is " + d);
    }
    
}