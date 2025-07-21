class ArrayExample{
    public static void main(String[] args) {
        int arr[] = new int[5]; // {0,0,0,0,0}
        // System.out.println(arr.toString());
        int []arr2 = new int[5];
        
        int [] arr3 = {10, 20, 30, 40, 50};
        int [] arr4 = new int[]{10,20,30,40,50};
        // String a = new String("AMIT");
        // System.out.println(a);

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        //Enhance for loop
        for(int i : arr){
            System.out.println(i);
        }
    }
}