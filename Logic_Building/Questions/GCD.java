public class GCD {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;

        // Division method
        while(a%b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("GCD = " + b);

        //Subtraction Method
        // while(a!=b){
        //     if(a>b){
        //         a = a-b;
        //     }
        //     else{
        //         b = b-a;
        //     }
        // }
        // System.out.println("GCD = " + a);

    // Normal method
    //     int min = a>b?b:a;
    //     while(min>0){
    //     if(a%min == 0 && b%min == 0){
    //         System.out.println("GCD = " + min);
    //         break; // exit from the current loop
    //     }
    //     min--;
    // }

    }
}
