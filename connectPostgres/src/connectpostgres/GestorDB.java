/**    ___________
      |.---------.|
      ||IES Ebre ||
      ||DAM - BD ||
      ||Gonçal V.||
      |'---------'|
       `)__ ____('
       [=== -- o ]--.
     __'---------'__ \
    [::::::::::: :::] )
     `""'"""""'""""`/T\
                    \_/
 */

package connectpostgres;
import java.sql.*;
import javax.swing.JOptionPane;
public class GestorDB {


    public static Connection connectaDB(){
     
        String url="jdbc:postgresql://localhost:5432/"+JOptionPane.showInputDialog("Base de dades:");
        String usuari=JOptionPane.showInputDialog("Usuari:");
        String contra=JOptionPane.showInputDialog("Contrasenya:");
        Connection connexio=null;
        try {
            Class.forName("org.postgresql.Driver");
            connexio=DriverManager.getConnection(url, usuari,contra);
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return connexio;
    }
    public static void tancaDB(Connection c){
          try {
                if (c != null) {
                    c.close();
                    System.out.println("Tancat!");
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
     }
    public static void afegirTaula(Connection c){
        try{
            java.sql.Statement st=c.createStatement();
           
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
        
        
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void AddAlbum(Connection c){
    String titol=JOptionPane.showInputDialog("Nom títol:");
    String autor=JOptionPane.showInputDialog("Autor:");
    String suport=JOptionPane.showInputDialog("Suport:");
    String data_edicio=JOptionPane.showInputDialog("Data edició:");
    
        try{
            java.sql.Statement st=c.createStatement();
            st.executeUpdate("INSERT INTO albums_musicals (titol,autor,suport,data_edicio) VALUES('" + titol + "','" + autor + "','" + suport + "','"+data_edicio+"' )");

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void selectAlbums(Connection c){
              try{
            java.sql.Statement st=c.createStatement();
            String sql = "SELECT * FROM albums_musicals";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               System.out.println("id: "+rs.getInt(1) + " Titol: " + rs.getString(2) + " Autor: " + rs.getString(3) + " Suport: " + rs.getString(4) + " Data edició: " + rs.getDate(5));
               
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void deleteAlbums(Connection c){
        selectAlbums(c);
        String id=JOptionPane.showInputDialog("id: ");
        try{
            java.sql.Statement st=c.createStatement();
            String sql = "DELETE FROM albums_musicals WHERE id ='"+id+"'";
            int rs = st.executeUpdate(sql);
           
            
            
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());

        }
    }
    
    public static void crearTaulaUsers(Connection c){
    
        try{
            java.sql.Statement st=c.createStatement();
           
            st.executeUpdate("DROP TABLE usuarisAlbums");
           
            st.executeUpdate("CREATE TABLE usuarisAlbums (id SERIAL, PRIMARY KEY(id), nom VARCHAR(20), password varchar(20))");
           
            String nom = JOptionPane.showInputDialog("Nom usuari:");
            String pass = JOptionPane.showInputDialog("Password usuari:");
            st.executeUpdate("INSERT INTO usuarisAlbums (nom, password) VALUES ('" + nom + "','" + pass + "' )");

            
            ResultSet rs = st.executeQuery("select * from usuarisAlbums");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }     
        
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    
    }
    
     public static void deleteUserById(Connection c){
          try{
            java.sql.Statement st=c.createStatement();
            String sql = "SELECT * FROM usuarisAlbums";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
               System.out.println("id: "+rs.getInt(1) + " Nom: " + rs.getString(2) );
               
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         String id=JOptionPane.showInputDialog("id: ");
              try{
            java.sql.Statement st=c.createStatement();
            String sql = "DELETE FROM usuarisAlbums WHERE id ='"+id+"'";
            int rs = st.executeUpdate(sql);
           
            
            
        }catch (SQLException e) {
            
            System.out.println(e.getMessage());

        }
     }
    
    public static void main (String [] args){
      
        Connection c=connectaDB();
        afegirTaula(c);
        //AddAlbum(c);
        //selectAlbums(c);
        //deleteAlbums(c);
        crearTaulaUsers(c);
        deleteUserById(c);
        tancaDB(c);
 
    }
}