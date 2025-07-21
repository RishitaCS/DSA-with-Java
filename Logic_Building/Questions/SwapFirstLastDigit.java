// Swap first and last digit of a number
public class SwapFirstLastDigit {
    public static void main(String[] args) {
        int num = 9246;
        int copy = num;
        int count = 0;
        while(copy!=0){
            count++;
            copy = copy/10;
        }
        int pow = (int)Math.pow(10,count-1);
        int lastDigit = num % 10;
        int firstDigit = num / pow;
        num = num/10;
        int pow2 = (int)Math.pow(10,count-2);
        int middleNum = num % pow2;
        int result = lastDigit * pow + middleNum * 10 + firstDigit;
        System.out.println(result);        
        // System.out.println(firstDigit);
        // System.out.println(lastDigit);


    }
}
