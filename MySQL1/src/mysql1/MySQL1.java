package mysql1;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author quim
 */
public class MySQL1 {

    public static void main(String[] args) {

            String url = "jdbc:mysql://localhost/miBase1";
            String user = "root";
            String password = "root";
            
            Connection con = null;
            Statement statement = null;
            ResultSet result = null;
            String sql1 = "";
            try {
                con = DriverManager.getConnection(url, user, password);
                System.out.println("Success");
                
//                
//                System.out.println("Query: ");
//                Scanner scanner = new Scanner(System.in);
//                String ent;
//                
//                ent = scanner.nextLine();
            
            } catch (Exception e) {
                
                e.printStackTrace();
            
            }

    }
    
}
