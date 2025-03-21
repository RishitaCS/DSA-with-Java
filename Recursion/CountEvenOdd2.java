package Recursion;
// Count even and odd digits in a number
public class CountEvenOdd2 {

    static int[] countEvenOdd2(int num){
        if(num==0){
            return new int[]{0,0};
        }
        int [] counts = countEvenOdd2(num/10);
        int digit = num%10;
        if(digit%2==0){
            counts[0]++;
        }
        else{
            counts[1]++;
        }
        return counts;
    }

    static void countEvenOdd(int num, int evenCount, int oddCount){
        if(num==0){
            System.out.println("Even:- " + evenCount + " Odd:- " + oddCount);
            return;
        }
        int digit = num%10;
        if(digit%2==0){
            evenCount++;
        }
        else{
            oddCount++;
        }
        countEvenOdd(num/10, evenCount, oddCount);

    }
    public static void main(String[] args) {
        //countEvenOdd(7242,0,0);
        int [] result = countEvenOdd2(7243);
        System.out.println("Even:- " + result[0] + " Odd:- " + result[1]);
    }
}
