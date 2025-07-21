import java.util.*;

public class MaxSumGoodSubarrayWithKDistinct {

    // Sliding Window + HashMap approach

    public static int maxSumGoodSubarray(int[] A, int k){
        int n = A.length;
        Map<Integer,Integer> freq = new HashMap<>();
        int left = 0, right = 0;
        int currentSum = 0, maxSum = 0;

        while(right<n){
            int val = A[right];
            freq.put(val, freq.getOrDefault(val, 0)+1);
            currentSum += val;

            while(freq.size()>k){
            int leftVal = A[left];
            freq.put(leftVal, freq.get(leftVal)-1);
            if(freq.get(leftVal) == 0){
                freq.remove(leftVal);
            }
            currentSum -= leftVal;
            left++;
            }
            maxSum = Math.max(currentSum, maxSum);
            right++;

        }

        return maxSum;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 3, 2, 3, 5, 1, 2, 1, 1};
        int k = 2;

        int result = maxSumGoodSubarray(A, k);
        System.out.println(result);
    }
}
