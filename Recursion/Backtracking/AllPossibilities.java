package Recursion.Backtracking;

// Exhaustive Search
public class AllPossibilities {
    static void allAtoZPos(int nLen, String result){
        // Base case
        if(result.length() == nLen){
            System.out.print(result + " ");
            return;
        }
        for(char alpha = 'A'; alpha<='Z';alpha++){ //loop
            if(alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U'){
            allAtoZPos(nLen, result + alpha); // recursive call
            }
        }
    }
    public static void main(String[]args){
        allAtoZPos(2,"");
    }
}
