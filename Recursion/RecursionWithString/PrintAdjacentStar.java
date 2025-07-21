public class PrintAdjacentStar {

    static String printStar(String s){
        if(s.length()<=1){
            return s;
        }
        String smallString = printStar(s.substring(1));
        if(s.charAt(0) == s.charAt(1)){
            return s.charAt(0) + "*" + smallString;
        }
        else{
            return s.charAt(0) + smallString;
        }
    }
    public static void main(String[] args) {
        String result = printStar("AABBCDCC");
        System.out.println(result);
    }
}
