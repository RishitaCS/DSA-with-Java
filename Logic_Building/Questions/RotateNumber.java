package Logic_Building.Questions;

public class RotateNumber {
    public static void main(String[] args) {
        // int num = 12345;
        // int rotations = 2;
        // int count = 0;
        // int rightPart = num % (int)Math.pow(10,rotations);
        // int leftPart = num / (int)Math.pow(10,rotations);
        // // System.out.println(leftPart);
        // // System.out.println(rightPart);
        // while(num!=0){
        //     count++;
        //     num /= 10;
        // }
        // int pow2 = (int)Math.pow(10, count - rotations);
        // int result = rightPart * pow2 + leftPart;
        // System.out.println(result);

        // // If number of rotations is greater than 5 (which is the length of the number)
        // int num = 12345;
        // int rotations = 8;
        // int count = 0;
        // int copy = num;
        // while(copy!=0){
        //     count++;
        //     copy /= 10;
        // }
        // rotations = rotations % count;
        // int rightPart = num % (int)Math.pow(10,rotations);
        // int leftPart = num / (int)Math.pow(10,rotations);
        // // System.out.println(leftPart);
        // // System.out.println(rightPart);
        
        // int pow2 = (int)Math.pow(10, count - rotations);
        // int result = rightPart * pow2 + leftPart;
        // System.out.println(result);

        // If number of rotations is less than 0
        int num = 12345;
        int rotations = -2;
        int count = 0;
        int copy = num;
        while(copy!=0){
            count++;
            copy /= 10;
        }
        rotations = rotations % count;
        if(rotations<0){
            rotations = rotations + count;
        }
        int rightPart = num % (int)Math.pow(10,rotations);
        int leftPart = num / (int)Math.pow(10,rotations);
        // System.out.println(leftPart);
        // System.out.println(rightPart);
        
        int pow2 = (int)Math.pow(10, count - rotations);
        int result = rightPart * pow2 + leftPart;
        System.out.println(result);
    }
}
