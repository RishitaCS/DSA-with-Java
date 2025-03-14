package Logic_Building.Patterns;

public class AlphabetPattern {
    public static void main(String[] args) {
        int range = 5;
        char character = 'A';
        for(int row=1; row<=range; row++){
            for(int col=1; col<=row; col++){
                System.out.print(character + " ");
                character++;
            }
            System.out.println();
        }
    }
}
