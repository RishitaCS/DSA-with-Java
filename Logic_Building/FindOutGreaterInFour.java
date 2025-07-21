public class FindOutGreaterInFour {
    public static void main(String[] args) {
        int first = 1500;
        int second = 1200;
        int third = 1000;
        int fourth = 1900;
        if(first>second){
            if(first>third){
                if(first>fourth){
                    System.out.println("First is the greater number");
                }
                else{
                    System.out.println("Fourth is the greater number");
                }
            }
            else{
                if(third>fourth){
                    System.out.println("Third is the greater number");
                }
                else{
                    System.out.println("Fourth is the greater number");
                }
            }
        }
        else{
            if(second>third){
                if(second>fourth){
                    System.out.println("Second is the greater number");
                }
                else{
                    System.out.println("Fourth is the greater number");
                }
            }
            else{
                if(third>fourth){
                    System.out.println("Third is the greater number");
                }
                else{
                    System.out.println("Fourth is the greater number");
                }
            }

        }
    }
}
