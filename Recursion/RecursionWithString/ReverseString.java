public class ReverseString {

    static String reverse(String s){
        //Base case
        if(s.length() == 0){
            return "";
        }
        //Small problem
        String smallString = reverse(s.substring(1));
        String result = smallString + s.charAt(0);
        return result;
    }
    public static void main(String[] args) {
        String r = reverse("Rishita");
        System.out.println(r);
    }
}
