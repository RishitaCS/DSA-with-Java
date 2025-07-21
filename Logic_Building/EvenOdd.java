public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;
        // 1st method:- Using If-else
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        // 2nd method:- Using Bitwise Operators
        // XOR:-
        if((num^1) == num+1){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        // AND:-
        if((num&1) == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        // OR:-
        if((num|1) > num){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
