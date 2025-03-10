package Logic_Building.Questions;
// Find frequency of each digit in a number
// Hint :- MAP or Java Array Hashing
// I am going to use MAP(HashMap implementation) for this problem since it has key-value pairs and if we lookup for a key in Map then Map do constant time search.
// HashMap is unordered but if we want order then we can use TreeMap (ordered).
import java.util.*;
public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        int num = 724272;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(num!=0){
            int digit = num % 10;
            if(map.get(digit)==null){ //get(key)
                map.put(digit,1); //put(key,value)
            }
            else{
                int count = map.get(digit);
                count++;
                map.put(digit,count);
            }
            num = num / 10;
        }
        System.out.println(map);
    }
}
