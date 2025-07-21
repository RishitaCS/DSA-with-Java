import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        // Upper half of the pattern
        for(int row=1; row<=size; row++){
            for(int col=row; col<=size; col++){
                System.out.print("*");
            }
            for(int col=1; col<=2*row-2; col++){
                System.out.print(" ");
            }
            for(int col=row; col<=size; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for(int row=1; row<=size; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            for(int col=2*row-2; col<2*size-2; col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
