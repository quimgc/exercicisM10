/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;
import javax.swing.*;
/**
 *
 * @author quim
 */
public class Swing {
    public static void main(String[] args) {
        //contenedor = frame
                                //("Frame") -> és el nom
        JFrame frame2 = new JFrame("Frame");
      
        
        
        //codi botó.
        
        JButton b1 = new JButton("Boto1");
        b1.setBounds(0,0,200,50); //x,y, amplada, alçada
        frame2.add(b1);
    
        JToggleButton b2 = new JToggleButton("ToggleButton");
        b2.setBounds(200,0,200,50);
        frame2.add(b2);
        
        //checkbox
        JCheckBox b3 = new JCheckBox("JCheckBox");
        b3.setBounds(0,50,200,50);
        frame2.add(b3);
   
        JRadioButton b4 = new JRadioButton("JRaddioButton");
        b4.setBounds(200,50,200,50);
        frame2.add(b4);
        
        
        JLabel b5 = new JLabel("JLabel");
        b5.setBounds(400,0,200,50);
        frame2.add(b5);
        
        JTextField b6 = new JTextField("JTextField");
        b6.setBounds(400,50,200,50);
        frame2.add(b6);
        
        
        JTextArea b7 = new JTextArea("JTextArea");
        b7.setBounds(0,100,200,50);
        frame2.add(b7);
        
        String llista[] = {"Opció 1", "Opció 2", "Opció3 "};
        JList b8 = new JList(llista);
        b8.setBounds(200,100,200,50);
        frame2.add(b8);
        
        
        frame2.setSize(1000,1000);
        frame2.setLayout(null);
        frame2.setVisible(true);

       
        frame2.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    
    }
}
