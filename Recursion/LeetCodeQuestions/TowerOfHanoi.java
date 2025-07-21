public class TowerOfHanoi {

    static void toh(int disks,char A, char B, char C){
        if(disks==0){
            return;
        }
        toh(disks-1, A, C, B);
        System.out.println("Move Disk" + disks + " from " + A + " to " + C);
        toh(disks-1, B, A, C);
    }
    public static void main(String[] args) {
        int disks=3;
        toh(disks, 'A', 'B', 'C');
    }
}
