public class PrintTable {

    static String printTable2(int num, int val){
        if(val==0){
            return "";
        }
        
        String result = printTable2(num, val-1);
        String expression = num + "x" + val + "=" + (num*val) + "\n";
        return result + expression;
    }

    static void printTable(int num, int val){
        if(val == 0){
            return;
        }

        // Small problem
        printTable(num, val-1);
        // Stack Full
        System.out.println(num + "x" + val + "=" + (num*val));
    }
    public static void main(String[] args) {
        //printTable(5,10);
        String r = printTable2(5, 10);
        System.out.println(r);
    }
}
