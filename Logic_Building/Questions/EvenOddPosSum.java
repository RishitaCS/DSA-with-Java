package Logic_Building.Questions;
// Even and Odd Place(Position) Sum of Digit
public class EvenOddPosSum {
    public static void main(String[] args) {
        int num = 8765;
        int position = 0;
        int OddSum = 0;
        int EvenSum = 0;
        while(num!=0){
        int lastDigit = num%10;
        position++;
        if(position%2==0){
            EvenSum = EvenSum + lastDigit;
        }
        else{
            OddSum = OddSum + lastDigit;
        }
        num = num/10;
    }
    System.out.println("Even Sum:- " + EvenSum);
    System.out.println("Odd Sum:- " + OddSum);
    }
}
