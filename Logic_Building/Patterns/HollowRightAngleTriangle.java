package Logic_Building.Patterns;

public class HollowRightAngleTriangle {
    public static void main(String[] args) {
        int range = 5;
        for(int row=1 ; row<=range; row++){
            for(int col=1; col<=row; col++){
                if(row==range || col==1 || row==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
