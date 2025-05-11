package Recursion.LeetCodeQuestions;
public class ClimbingStair {

    // This code is not the optimized solution since its giving exponential time complexity , so we will use dp approach to solve it.
    static int climbStairs(int n) {
        if(n<=1){
            return 1;
        }
        int count1 = climbStairs(n-1);
        int count2 = climbStairs(n-2);
        return count1 + count2;
    }
    public static void main(String[] args) {
        int result = climbStairs(5);
        System.out.println(result);
    }
}
