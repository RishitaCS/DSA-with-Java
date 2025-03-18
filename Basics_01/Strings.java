package Basics_01;

public class Strings {
    public static void main(String[] args) {
        // String firstName = "Rishita";
        // String lastName = "Rawat";
        // System.out.println(firstName + lastName);
        // String t = "Hello How Are You";
        // System.out.println(t);
        String name = "Amit";
        String name2 = "Amit"; // 0 object
        String name3 = new String("Amit").intern(); // 1 object // Because of intern() method, now this will reference to the value inside the string pool even with new keyword
        String name4 = new String("Ram"); // 2 object
        System.out.println(name==name2);
        System.out.println(name==name3);
        System.out.println(name.equals(name2));


    }
}
