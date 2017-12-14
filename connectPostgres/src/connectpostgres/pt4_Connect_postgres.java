
package connectpostgres;

/**
 *
 * @author quim
 */
import java.sql.*;

public class pt4_Connect_postgres {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/albums";
        String usuari = "client_albums";
        String contra = "123456";
        
        try{
            Class.forName("org.postgresql.Driver");
            Connection connexio = DriverManager.getConnection(url,usuari,contra);
            java.sql.Statement st = connexio.createStatement();
            String sql = "SELECT * FROM albums_musicals";
            ResultSet result = st.executeQuery(sql);
            while(result.next()){
                String id = result.getString("id");
                String titol = result.getString("titol");
                String autor = result.getString("autor");
                String suport = result.getString("suport");
                String data_edicio = result.getString("data_edicio");

                System.out.println("id: " + id +" Titol: " + titol+" Autor: " + autor + " Suport: " + suport + " Data_edicio: " + data_edicio);
            }
            
            result.close();
            st.close();
            connexio.close();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            
        }
        
    }
    
}
