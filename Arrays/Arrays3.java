import java.util.List;
import java.util.ArrayList;
public class Arrays3 {
    public static void main(String[] args) {
        // Static vs Dynamic Array
        int arr [] = new int [10]; // Static array
        // Dynamic array
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=20;i++){
            list.add(i);
        }
        System.out.println(list);
    }
}
