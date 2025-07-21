public class FlipDigitWithPos {
    public static void main(String[] args) {
        int num = 32145;
        int position = 0;
        int sum = 0;
        while(num!=0){
            int lastDigit = num%10;
            position++;
            int pow = (int)Math.pow(10,lastDigit-1);
            sum = sum + position*pow;
            num = num/10; // make number small
        }
        System.out.println(sum);
}
}
