package Recursion.LeetCodeQuestions;

public class SubsequenceOfString {

    static void subSequenceGen(String str, String result){
        // Base case
        if(str.length()==0){
            System.out.print(result + " , ");
            return;
        }
        // Not take it 
        subSequenceGen(str.substring(1), result);
        // Take it
        subSequenceGen(str.substring(1), result + str.charAt(0));
    }
    public static void main(String[] args) {
        subSequenceGen("abc", "");
    }
}
