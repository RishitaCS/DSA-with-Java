

public class SearchArray {

    static boolean isFound2(int [] arr, int index, int target){
        // Base cases
        if(arr[index]==target){
            return true;
        }
        if(index == arr.length-1){
            return false;
        }
        return isFound2(arr, index+1, target);
    }

    static void isFound(int [] arr, int index, int target){
        if(arr[index]==target){
            System.out.println("Target Found");
            return;
        }
        if(index == arr.length-1){
            System.out.println("Target Not Found");
            return;
        }
        isFound(arr, index+1, target);
    }
    public static void main(String[] args) {
        int arr [] = {10,20,30,50,60};
        int target = 50;
        isFound(arr, 0, target);
        boolean r = isFound2(arr, 0, target);
        System.out.println(r?"Found":"Not Found");
    }
}
