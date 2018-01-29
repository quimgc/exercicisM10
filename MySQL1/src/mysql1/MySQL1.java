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
                statement = con.createStatement();
                
                System.out.println("Enter a query: ");
                Scanner scanner = new Scanner(System.in);
                
                sql1 = scanner.nextLine();
                
                if(sql1.toLowerCase().startsWith("select")) {
                    
                     ResultSet rs =  statement.executeQuery(sql1);
                           
                    while (rs.next()) {
                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
                    }
                
                } else {
                
                    statement.executeUpdate(sql1);
                    
                }
                
                
                
//                statement = con.createStatement();
//                sql1 = ent;
//                int r = statement.executeUpdate(sql1);
//                System.out.println(r);
            
            } catch (Exception e) {
                
                e.printStackTrace();
            
            }

    }
    
}
