import java.util.*;
public class MinMovesToReduceToOne {

    // BFS Approach

    public static int minMovesToOne(int N){
        if(N==1) return 0;
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(N);
        visited.add(N);

        int steps = 0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            steps++;

            for(int i=0; i<size; i++){
                int curr = queue.poll();

                // Move 1
                int move1 = curr-1;
                if(move1 == 1) return steps;
                if(move1 > 0 && visited.add(move1)){
                    queue.add(move1);
                }

                // Move 2
                if(curr % 2 == 0){
                    int move2 = curr/2;
                    if(move2==1) return steps;
                    if(visited.add(move2)){
                        queue.add(move2);
                    }
                }

                // Move 3
                if(curr % 3 == 0){
                    int move3 = curr/3;
                    if(move3==1) return steps;
                    if(visited.add(move3)){
                        queue.add(move3);
                    }
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int N = 5;
        int result = minMovesToOne(N);
        System.out.println(result);
    }
}
