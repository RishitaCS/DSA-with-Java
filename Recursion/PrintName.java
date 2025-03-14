package Recursion;

public class PrintName {
    static void printName(int num){
        // Recursion Stop
        // Termination case / Base case
        if(num==0){
            return;
        }
        System.out.println("Rishita"); //Logic
        // num - 1 (Small problem) + Recursion
        printName(num-1);
    }
    public static void main(String[] args) {
        printName(6);
    }
}
