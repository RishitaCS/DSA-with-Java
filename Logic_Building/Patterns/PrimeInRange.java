package Logic_Building.Patterns;

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter a value: ");
        // int n = sc.nextInt();
        System.out.println("Please enter the range: ");
        int range = sc.nextInt();

        boolean isPrime = false;
        for(int k=1; k<=range; k++){
            isPrime = false;
            for(int row=2; row<=Math.sqrt(k); row++){
                if(k%row==0){
                    isPrime = true;
                }
            }
            if(isPrime){
                System.out.println(k + " the number is not prime");
            }
            else{
                System.out.println(k + " the number is prime");
            }
        }
        
    }
}
