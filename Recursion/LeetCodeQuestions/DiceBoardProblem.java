package Recursion.LeetCodeQuestions;

public class DiceBoardProblem {

    static void boardProblem(int currentValue, int endValue, String result){
        // Base case
        if(currentValue == endValue){
            System.out.print(result + " , ");
            return;
        }
        // Negative case
        if (currentValue > endValue) {
            return;
        }
        for(int dice=1; dice<=6; dice++){
            boardProblem(currentValue+dice, endValue, result+dice);
        }
    }
    public static void main(String[] args) {
        boardProblem(0, 10, "");
    }
}
