package Recursion;

public class FactorialOfNum {

    static int fact(int num){
        if(num==1){
            return 1;
        }
        int result = num * fact(num-1);
        return result;
        
    }

    static void fact(int num, int result){
        if(num==1){
            System.out.println("Factorial:- " + result);
            return;
        }
        fact(num-1, num*result);
    }
    // static void factorialOfNum(int num, int f){
    //     if(num==0){
    //         System.out.println("Factorial:- " + f);
    //         return;
    //     }

    //     f = f*num;
    //     factorialOfNum(num-1,f);
    // }
    public static void main(String[] args) {
        //factorialOfNum(5,1);
        //fact(3,1);
        int result = fact(5);
        System.out.println("Factorial:- " + result);
    }
}
