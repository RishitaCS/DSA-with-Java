package Logic_Building.Questions;

// Find out the sum of digit
public class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;  
        }
        System.out.println("Sum of digits: " + sum);
    }
}
