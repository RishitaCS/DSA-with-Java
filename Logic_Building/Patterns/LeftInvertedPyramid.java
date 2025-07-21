public class LeftInvertedPyramid {

    
    static void printStar(int stars){
        if(stars==0){
            return;
        }
        System.out.print("*");
        printStar(stars-1);
    }
    static void printRow(int rows){
        if(rows==0){
            return;
        }
        printStar(rows);
        System.out.println();
        printRow(rows - 1);
    }
    public static void main(String[] args) {
        printRow(5);
    }
}
