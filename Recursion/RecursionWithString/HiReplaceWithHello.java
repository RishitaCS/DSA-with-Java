public class HiReplaceWithHello {

    static String hiReplaceHello(String s){
        // Base case
        if(s.length() <= 1){
            return s;
        }
       
        if(s.charAt(0) == 'h' && s.charAt(1) == 'i'){
            String smallString = hiReplaceHello(s.substring(2));
            return "Hello" + smallString;
        }
        else{
            String smallString = hiReplaceHello(s.substring(1));
            char firstChar = s.charAt(0);
            return firstChar + smallString;
        }

        
    }
    public static void main(String[] args) {
        String result = hiReplaceHello("hi John hi Ron");
        System.out.println(result);
    }
}
