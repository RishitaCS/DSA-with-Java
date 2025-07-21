public class Arrays1 {
    static void show(int[]a){ // copy of arr 
        a[0] = 100;
        for(int i:a){
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        int [] arr = new int[]{10,20,30};
        show(arr);
        System.out.println("After Show call");
        for(int i:arr){
            System.out.println(i);
        }
    }
}
