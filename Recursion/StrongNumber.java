package Recursion;
// Find out number is strong or not
public class StrongNumber {

    static int strongNumber2(int num, int cpy){
        if(num==0){
            return 0;
        }
        
        int sum = strongNumber2(num/10, cpy);
        int digit = num % 10;
        int f = 1;
        while(digit!=0){
            f = f *digit;
            digit = digit - 1;
        }
        sum = sum + f;
        return sum;
    }
    // Using void
    static void strongNumber(int num, int sum, int cpy){
        if(num==0){
            System.out.println(cpy==sum?"Strong Number":"Not a Strong Number");
            return;
        }
        int digit = num % 10;
        int f = 1;
        while(digit!=0){
            f = f *digit;
            digit = digit - 1;
        }
        sum = sum + f;
        strongNumber(num/10, sum, cpy);
    }
    public static void main(String[] args) {
        int num = 145;
        int cpy = num;
        //strongNumber(145, 0, cpy);
        int sum = strongNumber2(num, cpy);
        System.out.println(sum==cpy?"Strong Number":"Not a Strong Number");
    }
    
}
