package Basics_01;

public class Strings2 {
    public static void main(String[] args) {
        
        // StringBuffer sql = new StringBuffer("select * from users");
        // sql.append("where userid ='amit' and password='111'");
        // sql.append(" and status='A'");

        StringBuilder sql = new StringBuilder("select * from users");
        // We can achieve synchronization in StringBuilder using synchronized block 
        synchronized(sql){
            sql.append("where userid ='amit' and password='111'");
        }
        sql.append(" and status='A'");


    }
}
