public class MazePathProblem {

    static void mazePossibility(int row, int col, int endRow, int endCol, String result){
        // Base case
        if(row == endRow && col == endCol){
            // reach goal
            System.out.println(result);
            return;
        }
        if(row>endRow || col>endCol){
            return;
        }
        // Small Problem
        // Move Horizontal
        mazePossibility(row, col+1, endRow, endCol, result + "H");
        // Move Vertical
        mazePossibility(row+1, col, endRow, endCol, result + "V");
    }
    public static void main(String[] args) {
        mazePossibility(0, 0, 2, 2, "");
    }
}
