public class Input6 {
    public static void main(String[] args) {
        System.out.println("Enter the UserID:- ");
        String userID = System.console().readLine();
        System.out.println("Enter the Password:- ");
        char[] pwd = System.console().readPassword();// To make password unreadable, we take the password in a character array.
        System.out.println("UserID:- " + userID);
        System.out.println("Password:- " + new String(pwd));// To make password readable for printing purpose, we converted it into the String.
        // But in real world cases, we never make the password readable for security purposes.
    }
}
