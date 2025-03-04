package Basics_02;

import java.util.Scanner;

public class Input4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:- ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:- ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber + secondNumber);
        scanner.close();
        // Output :- 
        // Enter the first number:- 10 20
        // Enter the second number:- 30
    }
}
