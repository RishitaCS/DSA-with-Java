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

        Float o = 90.20f;
        Long p = 10000L;
        Character q = 'A';
        System.out.println(q.toLowerCase('A'));
        char r = q.charValue();
        System.out.println(q.charValue());
        Integer m = 220;// Boxing
        Integer n = 220;
        System.out.println(m==n);
        m++;// AutoBoxing (Unboxing, Boxing) Java 5
        System.out.println(m);
        System.out.println(m.toString());
        System.out.println(m.floatValue());
        System.out.println(m.longValue());
        System.out.println(m.byteValue());
        System.out.println(Integer.parseInt("900"));



        //Notes:-
        // For Boxing and Unboxing
        // Java Collection Framework works on Object
        // Serialization happens on Object
        // Multithreading synchronization on object
        // Provide 100% OOPS implementation
    }
    
}