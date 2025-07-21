public class SumOfDigit {

    // Stack-Fall Approach
    static int sumofDigit(int num){
        if(num==0){
            return 0;
        }
        // int sum = sumofDigit(num/10);
        // int digit = num % 10;
        // sum = sum + digit;
        // return sum;
        return num % 10 + sumofDigit(num/10); 

    }

    // Stack-Building Approach
    static void sumofDigit(int num, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int digit = num % 10;
        sum = sum + digit;
        sumofDigit(num / 10,sum);        
    }
    public static void main(String[] args) {
        //sumofDigit(123,0);
        System.out.println(sumofDigit(123));
    }
    
}
