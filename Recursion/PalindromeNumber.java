public class PalindromeNumber {

    static boolean palindromeNumber(int num, int reverse, int cpy){
        // Base case
        if(num==0){
            return reverse == cpy;
        }
        int digit = num % 10; // Last digit
        reverse = reverse * 10 + digit;
        // Small problem
        return palindromeNumber(num/10, reverse, cpy);
    }

    // static void palindromeNumber(int num, int reverse, int cpy){
    //     // Base case
    //     if(num==0){
    //         System.out.println(reverse==cpy?"Palindrome":"Not Palindrome");
    //         return;
    //     }
    //     int digit = num % 10; // Last digit
    //     reverse = reverse * 10 + digit;
    //     // Small problem
    //     palindromeNumber(num/10, reverse, cpy);
    // }
    public static void main(String[] args) {
        int num = 151;
        int cpy = num;
        boolean r = palindromeNumber(num ,0, cpy);
        System.out.println(r?"Palindrome ":"Not Palindrome");
    }
}
