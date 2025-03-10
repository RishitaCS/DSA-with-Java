package Logic_Building;

public class GreaterNumberInThree {
    public static void main(String[] args) {
        int first = 500;
        int second = 200;
        int third = 700;
        if(first>second){
            if(first>third){
                System.out.println("First is greater");
            }
            else{
                System.out.println("Third is greater");
            }
        }
        else{
            if(second>third){
                System.out.println("Second is greater");
            }
            else{
                System.out.println("Third is greater");
            }
        }
    }
}
