public class BinaryToDecimal {

    static int convertToDecimal2(int num, int pow, int sum){
        if(num==0){
            return sum;
        }
        
        int digit = num%10;
        sum = sum + ((int)Math.pow(2,pow)*digit);
        return convertToDecimal2(num/10, pow+1, sum);
        
    }

    static void convertToDecimal(int num, int pow, int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int digit = num%10;
        sum = sum + ((int)Math.pow(2,pow)*digit);
        pow = pow + 1;
        convertToDecimal(num/10, pow, sum);
    }
    public static void main(String[] args) {
        //convertToDecimal(1010, 0,0);
        int sum = convertToDecimal2(1010, 0, 0);
        System.out.println(sum);
    }
    
}
