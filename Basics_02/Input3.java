package Basics_02;

import java.util.Scanner;

public class Input3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the Name:- ");
        // String name = scanner.nextLine();
        // System.out.println("Enter the ID:- ");
        // int id = scanner.nextInt();
        System.out.println("Enter the ID:- ");
        int id = scanner.nextInt();
        scanner.nextLine();// eat \n
        System.out.println("Enter the Name:- ");
        String name = scanner.nextLine();
        System.out.println("Enter the city:- ");
        String city = scanner.next();
        System.out.println("Id:- " + id);
        System.out.println("Name:- " + name);
        System.out.println("City:- " + city);
        scanner.close();
    }
}
