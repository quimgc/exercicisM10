
package connectpostgres;

/**
 *
 * @author quim
 */
import java.sql.*;

public class ConnectPostgres {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/videoteca";
        String usuari = "admin_db";
        String contra = "admin_db";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connexio = DriverManager.getConnection(url,usuari,contra);
            java.sql.Statement st = connexio.createStatement();
            String sql = "SELECT nom, director FROM pelis";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                String nom = result.getString("nom");
                String director = result.getString("director");
                System.out.println("Nom " + nom +" Director " + director);
            }
            
            result.close();
            st.close();
            connexio.close();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            
        }
        
    }
    
}
