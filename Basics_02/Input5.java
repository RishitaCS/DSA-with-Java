package Basics_02;

import java.util.Scanner;

public class Input5 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner("Hello How are you\n Hi This is text\n Another text\n");
        // while(scanner.hasNext()){
        //     //System.out.println(scanner.next());
        //     scanner.next();
        //     count++;
        // }
        //System.out.println("Word count:- " + count);

        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
        }
        System.out.println("Line count:- " + count);
        scanner.close();
    }
}
