package Logic_Building.Questions;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        while(num!=0){
            int lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = num/10;
        }
        System.out.println("Reverse:- " + rev);
    }
}
