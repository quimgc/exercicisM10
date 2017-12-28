/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarisjavi;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author quim
 */
public class SociFormulari extends JFrame implements ActionListener {
    static final String RUTA = "//home//quim//socis.txt";
    JTextField tcodi = new JTextField();
    JTextField tnom = new JTextField();
    JList list = new JList();
    
    ArrayList<Soci> llistaSocis = new ArrayList<>();

    public SociFormulari() {    
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //creacio de panells
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        
        //creacio de labels, camps de text i botons
        JLabel codi = new JLabel("codi: "); 
        JLabel nom = new JLabel("nom: ");
        JButton Bdesa = new JButton("Desa");
        JButton Bguarda = new JButton("Guarda");
        JButton Belimina = new JButton("Elimina");
        JButton Brestaura = new JButton("Restaura");
        
        //afegir accio al botó
        Bdesa.addActionListener(this);
        Bguarda.addActionListener(this);
        Belimina.addActionListener(this);
        Brestaura.addActionListener(this);
        
        //distribucio dels panells
        jp1.setLayout(new GridLayout(4,1));
        jp2.setLayout(new GridLayout(4,1));
        
        //afegir als respectius llocs
        jp1.add(codi);
        jp1.add(nom);
        jp1.add(Bdesa);
        jp1.add(Bguarda);
        
        jp2.add(tcodi);
        jp2.add(tnom);
        jp2.add(Belimina);
        jp2.add(Brestaura);
        
        this.add(jp1, BorderLayout.WEST);
        this.add(jp2, BorderLayout.EAST);
        this.add(list, BorderLayout.SOUTH);
        
        this.pack();
    }
    public void desarSoci(String codi, String nom){
        
        if(nom.length() == 0 || codi.length() == 0 ){
            
            MissatgeError msg = new MissatgeError("Error", "No has introduït cap valor.");
            
        } else {
            
            try{

                Soci soci = new Soci(Integer.parseInt(codi), nom);
                llistaSocis.add(soci);
                actualitzarLlista();
            }catch(NumberFormatException e){

                MissatgeError msg = new MissatgeError("Error", "El valor introduït a Codi és erroni.");
            }
        }
        
    
    }
    
    public void actualitzarLlista(){
        
        DefaultListModel dl = new DefaultListModel();
        
        Iterator<Soci> it = llistaSocis.iterator();
        
        while(it.hasNext()){
            
            dl.addElement(it.next().toString());
        }
        
        list.setModel(dl);
        
        pack();
    }
    
    public void eliminarSoci() {
        if(list.getSelectedIndex()>=0){
       
            llistaSocis.remove(list.getSelectedIndex());
            actualitzarLlista();     

        }
    }
    
    public void llegirDades() {
        
        try{
            File f = new File(RUTA);
            Scanner sc = new Scanner(f);
            llistaSocis.clear();
            
            while(sc.hasNext()){

                desarSoci(sc.nextLine(), sc.nextLine());
            
            }
            
            actualitzarLlista();
            sc.close();
            
        }catch(Exception e){

            MissatgeError msg = new MissatgeError("Error", "Error de lectura.");

        }
        
    }
    
    public void guardarDadesFitxer(){
        
        try{
            
            FileWriter f = new FileWriter(RUTA);
            BufferedWriter bw = new BufferedWriter(f);
            Iterator<Soci> it = llistaSocis.iterator();
            Soci s = new Soci();
            while(it.hasNext()){
                s = it.next();
                bw.write(s.getCodi()+"");
                bw.newLine();
                bw.write(s.getNom());
                bw.newLine();
            }
            
            bw.close();
            
        }catch(Exception e){
    
            MissatgeError msg = new MissatgeError("Error", "Error d'escriptura de dades.");

        }
    }
   
   
    public static void main(String[] args) {
        
        SociFormulari sf = new SociFormulari();
        sf.setVisible(true);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "Desa":
                        
                desarSoci(tcodi.getText(), tnom.getText());
                
                break;
            
            case "Elimina":
                    
                eliminarSoci();
            
                break;
                
            case "Guarda":
                    guardarDadesFitxer();
                break;
                    
            case "Restaura": 
                
                llegirDades();
                
                break;
                    
          
                    
            
        }
    }
    
    
}
