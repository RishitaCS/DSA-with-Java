package Logic_Building.Questions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 123;
        int copy = num;
        int digit_count = 0;
        int sum = 0;
        //count digits
        while(copy!=0){
            digit_count++;
            copy = copy/10;
        }
        copy = num;
        while(copy!=0){
            int lastDigit = copy%10;
            sum = sum + (int)Math.pow(lastDigit, digit_count);
            copy = copy/10;
        }

        if(num == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
