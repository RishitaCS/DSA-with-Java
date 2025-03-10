package Logic_Building.Questions;
// Strong number or Peterson Number
public class StrongNumber {

    static int fact(int digit){
        int factorial = 1;
        int i = 1;
        while(i<=digit){
            factorial*=i;
            i++;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int num = 145;
        int copy = num;
        int sum = 0;
        while(copy!=0){
            int digit = copy%10;
            sum = sum + fact(digit);
            copy = copy/10;
        }
        System.out.println(sum == num?"Strong Number":"Not a Strong Number");

        

    }
}
