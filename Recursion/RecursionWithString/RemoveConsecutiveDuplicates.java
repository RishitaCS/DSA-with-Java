public class RemoveConsecutiveDuplicates {

    static String removeConsecutiveDuplicates(String s){
        if(s.length()<=1){
            return s;
        }
        String smallString = removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0) == s.charAt(1)){
            return smallString;
        }
        else{
            char firstChar = s.charAt(0);
            return firstChar + smallString;
        }
    }
    public static void main(String[] args) {
        String result = removeConsecutiveDuplicates("AAAABBBCCCDC");
        System.out.println(result);
    }
}
