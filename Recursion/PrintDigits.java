public class PrintDigits {

    static void printDigits(int num){
        // Base case
        if(num==0){
            return; // Stack fall
        }
        // Small problem
        printDigits(num/10);
        // Large problem
        System.out.println(num%10); // Post processing
        
    }
    public static void main(String[] args) {
        printDigits(12345);
    }
    
}
