public class ArraySortedOrNot {

    // Using boolean return variable
    static boolean isSorted2(int [] arr, int index){
        // Base case
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        // Small problem
        return isSorted2(arr, index+1);
    }

    // Using void
    static void isSorted(int [] arr, int index){
        if(index == arr.length-1){
            System.out.println("Sorted");
            return;
        }
        if(arr[index]>arr[index+1]){
            System.out.println("Not sorted");
            return;
        }
        isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        isSorted(arr,0);
        // boolean r = isSorted2(arr, 0)
        // System.out.println(r?"Sorted":"Not Sorted");
    }
}
