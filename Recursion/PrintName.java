package Recursion;

public class PrintName {
    static void printName(int num){
        // Recursion Stop
        // Termination case / Base case
        if(num==0){
            return; // exit from the current function call
        }
        // Pre - processing
        System.out.println("Rishita " + num); //Logic
        // num - 1 (Small problem) + Recursion
        printName(num-1); // Recursion call end of the function
        //Post - processing
        System.out.println("Rawat " + num);
    } // End bracket (Tail)
    public static void main(String[] args) {
        printName(5);
    }
}
