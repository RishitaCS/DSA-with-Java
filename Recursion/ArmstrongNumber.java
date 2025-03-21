package Recursion;

public class ArmstrongNumber {

    static int countDigit(int num){
        if(num==0){
            return 0;
        }
        int count = countDigit(num/10);
        return count + 1;
    }

    static int armstrongNumber(int num, int count){
        if(num==0){
            return 0;
        }
        int digit = num % 10;
        int sum = armstrongNumber(num/10, count);
        sum = sum + (int)Math.pow(digit,count);
        return sum;
        
    }

    // Using void
    static void armstrongNumber(int num, int sum, int cpy, int count){
        if(num==0){
            System.out.println(sum==cpy?"Armstrong Number":"Not an Armstrong Number");
            return;
        }
        
        int digit = num % 10;
        sum = sum + (int)Math.pow(digit,count);
        armstrongNumber(num/10, sum, cpy, count);

    }
    public static void main(String[] args) {
        int num = 153;
        int count = countDigit(num);
        int cpy = num;
        //armstrongNumber(num,0,cpy, count);
        int sum = armstrongNumber(num,count);
        System.out.println(sum==cpy?"Armstrong Number":"Not an Armstrong Number");
    }
}
