// We will have a name input and need to convert the input string into the proper case 
//(i.e. First letter capital and others small of each word)
public class Assignment_01 {

    public static String properCase(String fullname) {
        String [] list = fullname.split(" ");
        String finalName = "";
        for(String name : list){
            char singleChar = name.charAt(0);
            String temp = String.valueOf(singleChar).toUpperCase() + name.substring(1).toLowerCase();
            finalName +=temp + " ";
        }
        return finalName;
    }
    public static void main(String[] args) {
        String fullname = "riShITa raWAt";
        System.out.println(properCase(fullname));

    }
}