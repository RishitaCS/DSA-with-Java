public class FindMinAndMax {

    static int[] getMinMax(int arr[], int index){
        if(index==arr.length-1){
            int r[] = new int[2]; // {0,0}
            r[0] = Integer.MAX_VALUE;
            r[1] = Integer.MIN_VALUE;
            return r;
        }
        int result[] = getMinMax(arr, index+1);
        // Min element
        if(result[0]>arr[index]){
            result[0] = arr[index];
        }
        else if(result[1]<arr[index]){
            result[1] = arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {10,90,130,240,50,3,88,40};
        int result[] = getMinMax(arr, 0);
        System.out.println("Min " + result[0] + " Max " + result[1]);
    }
}
