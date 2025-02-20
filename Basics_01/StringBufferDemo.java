package Basics_01;

public class StringBufferDemo {
    public static void main(String[] args) {
        String name = "Rishita";
        name = name + "Rawat";
        // StringBuffer resolves the problem of immutability in the String
        StringBuffer sb = new StringBuffer("rishita");
        System.out.println(sb.length()); 
        System.out.println(sb.capacity()); // 7 -> default capacity
        sb.append(" hello123456788910347646"); // 16+7=23 
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // New cap = Old cap * sizeOfOneChar + LastChar
        // = 23 * 2 + 2 
    }
}
