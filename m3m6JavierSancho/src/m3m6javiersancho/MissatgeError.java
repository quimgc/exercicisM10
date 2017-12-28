/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;


/**
 *
 * @author javi
 */
public class MissatgeError extends JDialog implements ActionListener
{
    
    public MissatgeError(String title, String message) {
    
    setTitle(title);
    JPanel messagePane = new JPanel();
    messagePane.add(new JLabel(message));
    getContentPane().add(messagePane);
    JPanel buttonPane = new JPanel();
    JButton button = new JButton("OK"); 
    buttonPane.add(button); 
    button.addActionListener(this);
    getContentPane().add(buttonPane, BorderLayout.SOUTH);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    pack(); 
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    setVisible(false); 
    dispose(); 
  }
  public static void main(String[] a) {
    MissatgeError dlg = new MissatgeError("title", "message");
  }
    
}