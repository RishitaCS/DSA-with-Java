// Count even and odd number between 1 to N
public class CountEvenOdd {

    static int[] countEvenOdd(int range){
        // Base case
        if(range==0){
            int result [] = new int[2]; // fill with 0
            // [0] = evenCount, [1] = oddCount
            return result;
        }
        // Small problem
        int result[] = countEvenOdd(range-1);
        //Logic
        if(range % 2 == 0){
            result[0] = result[0] + 1;
        }
        else{
            result[1] = result[1] + 1;
        }
        return result;
    }

    static void countEvenOdd(int range, int even, int odd){
        // Base case
        if(range==0){
            System.out.println("Even count " + even + " Odd count " + odd);
            return; // exit from the current function call
        }
        // Logic (Stack Building)
        if(range % 2 == 0){
            even++;
        }
        else{
            odd++;
        }
        // Small problem
        countEvenOdd(range-1, even, odd);
    }
    public static void main(String[] args) {
        //countEvenOdd(10, 0, 0);
        int arr[] = countEvenOdd(10);
        System.out.println("Even count " + arr[0]);
        System.out.println("Odd count " + arr[1]);
    }
}
