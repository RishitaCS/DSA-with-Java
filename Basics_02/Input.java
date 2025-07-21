import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static void main(String[] args) throws IOException{
        // int sum = 0;
        // for(int i=0; i<args.length; i++){
        //     sum = sum + Integer.parseInt(args[i]);
        // }
        // System.out.println("Result is " + sum);

        // 1) Command Line Arguments
        // String firstName = args[0];
        // String lastName = args[1];
        // System.out.println(firstName+lastName); 
        
        // Terminal :-
        // PS D:\vs coding\.vscode\DSA with Java\Basics_02> javac Input.java
        // PS D:\vs coding\.vscode\DSA with Java\Basics_02> java Input.java Rishita Rawat
        // RishitaRawat

        // if(args.length == 2){
        // int firstNumber = Integer.parseInt(args[0]); //parseInt is a static method of Integer wrapper class
        // int secondNumber = Integer.parseInt(args[1]);
        // int result = firstNumber + secondNumber;
        // System.out.println(result);
        // }
        // else {
        //     System.out.println("Invalid number of args");
        // }

        //Terminal:-
        // PS D:\vs coding\.vscode\DSA with Java\Basics_02> javac Input.java
        // PS D:\vs coding\.vscode\DSA with Java\Basics_02> java Input.java 100 200      
        // 300
        // PS D:\vs coding\.vscode\DSA with Java\Basics_02> java Input.java 100
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    }
}
