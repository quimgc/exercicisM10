
package connectpostgres;

/**
 *
 * @author quim
 */
import java.sql.*;

public class pt4_Connect_postgres2 {

  public static void main (String [] args){
        String url="jdbc:postgresql://localhost:5432/albums";
        String usuari="admin_db";
        String contra="123456";
        Connection connexio=null;
        try {
            Class.forName("org.postgresql.Driver");
            connexio=DriverManager.getConnection(url, usuari,contra);
            java.sql.Statement st=connexio.createStatement();
            
            st.executeUpdate("DROP TABLE usuarisVideo");
            
            st.executeUpdate("CREATE TABLE usuarisVideo (id SERIAL, PRIMARY KEY(id), nom VARCHAR(20), cognoms VARCHAR(20), telefon VARCHAR(20))");
            
            String noms[] = {"Arnau", "Anna", "Pepe"};
            String cognoms[] = {"Guimerà", "Puig", "Mengual"};
            String telefons[] = {"123456789", "987654321", "112233445"};

            for (int i = 0; i < noms.length; i++) {
                st.executeUpdate("INSERT INTO usuarisVideo (nom, cognoms, telefon) VALUES ('" + noms[i] + "','" + cognoms[i] + "','" + telefons[i] + "' )");
            }

            ResultSet rs = st.executeQuery("select * from usuarisVideo");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connexio != null) {
                    connexio.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
  
    }
}