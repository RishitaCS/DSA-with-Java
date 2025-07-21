public class Loops {
    public static void main(String[] args) {
        
        // while
        /*int i=1; //start
        while(i<=10){ //condition
            System.out.println("Rishita");
        }
        //i = i+1;
        i++; //increment
        */

        // for
        /*for(int i=1; i<=10; i++){
            System.out.println("Rishita");
        }*/

        // Do-while
        /*int i = 20;
        do{
            System.out.println("Rishita");
            i++;
        }while(i<=10);
        */

        //Java 5 onwards
        //Enhance for loop
        int arr[] = {10,20,30,40,50};
        // Traditional Way
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        for(int e:arr){
            System.out.println(e);
        }
    }
}
