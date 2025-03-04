package Basics_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input2 {
    public static void main(String[] args) throws IOException{
        // 2) System.in.read() :- gives you a raw form of data
        // int single = System.in.read(); //reads only 1 input
        // System.out.println(single);
        // byte q [] = System.in.readAllBytes();// Reads all remaining bytes from the input stream.
        // System.out.println(q);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first name");
        String name = br.readLine();
        System.out.println("Enter the ID");
        int id = Integer.parseInt(br.readLine());
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        br.close(); // to prevent memory leakage
    }
}
