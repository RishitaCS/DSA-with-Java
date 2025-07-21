class ArrayUpdateAndRangeSumQueries{

    static final int MOD = 1000000007;
    public static int processQueries(int[] A, int[][] queries){
        int totalSum = 0;
        for(int [] query : queries){
            int type = query[0];
            int l = query[1];
            int r = query[2];

            if(type==1){
                for(int i=l; i<=r; i++){
                    A[i] = (int)(((long)(i-l+1)*A[l])% MOD);
                }
            }
            else if(type==2){
                long sum = 0;
                for(int i=l; i<=r; i++){
                    sum = (sum + A[i]) % MOD;
                }
                totalSum = (int)((totalSum + sum) % MOD);
            }
        }
        return totalSum;
    }
    public static void main(String[] args) {
        int A [] = {1,4,5,1,6,7,8};
        int [][]queries = {{1, 1, 6}, {1, 1, 5}, {2, 5, 5}, {2, 3, 4}, {2, 3, 3}};

        int result = processQueries(A, queries);
        System.out.println(result);
    }    
}