public class SearchAndReplaceChar {

    static String searchAndReplace(String s, char search, char replace){
        if(s.length() == 0){
            return "";
        }
        String smallString = searchAndReplace(s.substring(1),search,replace);
        if(s.charAt(0) == search){
            return replace + smallString;
        }
        else{
            return s.charAt(0) + smallString;
        }
    }
    public static void main(String[] args) {
        String r = searchAndReplace("Hello",'l','x');
        System.out.println(r);
    }
}
