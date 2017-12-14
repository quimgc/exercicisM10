/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author quim
 */
public class SwingExercici {
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("frame");
        
        JLabel b1 = new JLabel("JLabel");
        b1.setBounds(0, 0, 200, 50);
        b1.setOpaque(true);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.black);
        
        frame.add(b1);
        
        JLabel b2 = new JLabel("JLabel2");
        b2.setBounds(0, 50, 200, 50);
        b2.setOpaque(true);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.black);
        frame.add(b2);
        
        JButton b3 = new JButton("button");
        b3.setBounds(200, 0, 200, 50);
        b3.setOpaque(true);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.black);
        frame.add(b3);
        
        JButton b4 = new JButton("button2");
        b4.setBounds(200, 50, 200, 50);
        b4.setOpaque(true);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.black);
        frame.add(b4);
        
        JTextArea b5 = new JTextArea("textArea");
        b5.setBounds(400, 0, 200, 50);
        b5.setOpaque(true);
        b5.setBackground(Color.RED);
        b5.setForeground(Color.black);
        frame.add(b5);
        
        JTextArea b6 = new JTextArea("textArea2");
        b6.setBounds(400, 50, 200, 50);
        b6.setOpaque(true);
        b6.setBackground(Color.RED);
        b6.setForeground(Color.black);
        frame.add(b6); 
        
        
        frame.setSize(1000,1000);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
}
