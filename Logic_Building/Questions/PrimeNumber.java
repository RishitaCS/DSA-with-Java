package Logic_Building.Questions;
public class PrimeNumber {
    public static void main(String[] args) {
        //1st way 
        // int num = 20;
        // int count = 0;
        // for(int i=1; i<=num; i++){
        //     if(num%i==0){
        //         count++;
        //     }
        // }  
        // System.out.println(count==2?"Prime number":"Not a prime number");

        //2nd way - optimized version than 1st
        // int num = 222;
        // for(int i=2; i<num; i++){
        //     if(num%i==0){
        //         System.out.println("Not a Prime Number");
        //         return;
        //     }
        // }  
        // System.out.println("Prime Number");

        //3rd way - optimized version than 2nd
        // int num = 997;
        // for(int i=2; i<=Math.sqrt(num); i++){
        //     if(num%i==0){
        //         System.out.println("Not a Prime Number");
        //         return;
        //     }
        // }  
        // System.out.println("Prime Number");

        //4th way - if let's say we cannot use Math.sqrt() method.
        int num = 997;
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                System.out.println("Not a Prime Number");
                return;
            }
        }  
        System.out.println("Prime Number");
    }

}
