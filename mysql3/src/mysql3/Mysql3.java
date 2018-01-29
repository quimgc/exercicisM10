/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql3;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author quim
 */
public class Mysql3 extends JFrame implements ActionListener{

  DefaultTableModel model = new DefaultTableModel();
  JTable tabla = new JTable(model);
  JTextField codi = new JTextField();
  JTextField isbn = new JTextField();
  JTextField titol = new JTextField();
  JTextField anyPublicacio = new JTextField();
  JTextField editorial = new JTextField();
  JTextField llocPublicacio = new JTextField();

  static Connection con = null;
  static Statement statement = null;
  static ResultSet result = null;
  
  public static ResultSet resultSet(String sql){
        String url = "jdbc:mysql://localhost/miBase1";
        String user = "root";
        String password = "root";
        
        try {
            con = DriverManager.getConnection(url, user, password);
            
        statement = con.createStatement();

        result = statement.executeQuery(sql);

        } catch (Exception e) {

            e.printStackTrace();

        }
        
        return result;
  }
  
  public void refrescarTaula(){
      try{
       
        model.addColumn("codi");
        model.addColumn("ISBN");
        model.addColumn("titol");
        model.addColumn("anyPublicacio");
        model.addColumn("editorial");
        model.addColumn("llocPublicacio");
        
        Object [] llista = new Object[6];
        llista[0] ="codi";
        llista[1] = "ISBN";
        llista[2] = "titol";
        llista[3] = "anyPublicacio";
        llista[4] = "editorial";
        llista[5] = "llocPublicacio";
        
        model.setColumnIdentifiers(llista);
        
        try{
            
            
        while(result.next()){
            int numColumnes = 6;
            for (int i = 0; i < numColumnes; i++) {
                llista[i] = result.getObject(i+1);
            }
            
            model.addRow(llista);
        }
            
        }catch(Exception e){
           
            e.getMessage();
           
        }
  
      }catch(Exception e){
          
      }
    }

  
  
    public static void main(String[] args) {
        // TODO code application logic here
        resultSet("SELECT * FROM llibres");
        Mysql3 formulari1 = new Mysql3();
        formulari1.setVisible(true);
        
    }
    
    public Mysql3() {
    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setBounds(0,0,500,500);

        refrescarTaula();
        
        JScrollPane panell1 = new JScrollPane(tabla);
        JScrollPane panell2 = new JScrollPane(tabla);

        JPanel panell3 = new JPanel();
//        
//        JButton boto1 = new JButton();
//        JButton boto2 = new JButton();
        
        

        panell3.add(panell1, BorderLayout.SOUTH);
        panell3.add(panell2, BorderLayout.NORTH);
        
        add(panell3);
        pack();
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
