// Count number of zeros in a number
public class CountZeros {

    static int countZeros2(int num){
        if(num==0){
            return 0; //count initial value = 0
        }
        
        int count = countZeros2(num/10);
        int digit = num % 10;
        if(digit==0){
            count = count +1 ;
        }
        return count;
    }
    static void countZeros(int num, int count){
        if(num==0){
            System.out.println(count);
            return;
        }
        int digit = num % 10;
        if(digit==0){
            count++;
        }
        countZeros(num/10, count);
    }
    public static void main(String[] args) {
        //countZeros(100200300,0);
        int r = countZeros2(10203040);
        System.out.println(r);
    }
}
