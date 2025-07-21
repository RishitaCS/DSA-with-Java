public class MinInitialOilToAvoidDisturbance {

    public static int minInitialOil(int[] A, int C){
        int n = A.length;
        int minOil = 0;
        int currOil = 0;

        for(int i=0; i<n; i++){
            if(A[i]==-1){
                currOil -= 1;
                minOil = Math.min(minOil, currOil);
            }
            else if(A[i]==1){
                if(currOil<C){
                    currOil+=1;
                }
            }
        }
        return Math.max(0, -minOil);
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] A1 = {-1, 1, 1};
        int C1 = 3;
        System.out.println(minInitialOil(A1, C1));  // Expected: 1

        // Test Case 2: consecutive buyers
        int[] A2 = {-1, -1, 1};
        int C2 = 2;
        System.out.println(minInitialOil(A2, C2));  // Expected: 2

        // Test Case 3: all sellers
        int[] A3 = {1, 1, 1, 1};
        int C3 = 3;
        System.out.println(minInitialOil(A3, C3));  // Expected: 0 (no buyer, no risk of underflow)

        // Test Case 4: buyers then sellers
        int[] A4 = {-1, -1, 1, 1};
        int C4 = 3;
        System.out.println(minInitialOil(A4, C4));  // Expected: 2

        // Test Case 5: just enough capacity, but overflows not counted
        int[] A5 = {1, 1, 1, 1, -1};
        int C5 = 2;
        System.out.println(minInitialOil(A5, C5));  // Expected: 0

        // Edge Case: empty queue
        int[] A6 = {};
        int C6 = 5;
        System.out.println(minInitialOil(A6, C6));  // Expected: 0
    }
}
