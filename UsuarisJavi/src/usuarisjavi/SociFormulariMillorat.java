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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author quimgonzalez
 */
public class Formulari extends JFrame implements ActionListener{
    JTextField tcodi = new JTextField();
    JTextField tnom = new JTextField();
    static final String RUTA =  "C:\\Users\\diqgonzalez\\Documents\\NetBeansProjects\\Prova2\\socis.txt";
    boolean isDadesFitxer = false;
    
    JList list = new JList();
    
    ArrayList<Soci> llistaSocis = new ArrayList();
    
    public Formulari(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        
        //dos labels, codi i nom.
        JLabel codi = new JLabel("Codi: ");
        JLabel nom = new JLabel("Nom: ");
        
        //buttons
        JButton desar = new JButton("Desar");
        JButton guardar = new JButton("Guardar");
        JButton eliminar = new JButton("Eliminar");
        JButton restaurar = new JButton("Restaurar");
        JButton dadesFitxer = new JButton("Dades Guardades");
        JButton dadesLlista = new JButton("Dades Llista");
        
        
        //accio per als botons:
        desar.addActionListener(this);
        guardar.addActionListener(this);
        eliminar.addActionListener(this);
        restaurar.addActionListener(this);
        dadesFitxer.addActionListener(this);
        dadesLlista.addActionListener(this);
        
        p1.add(codi);
        p1.add(nom);
        p1.add(desar);
        p1.add(guardar);
        p1.add(dadesFitxer);
        
        p2.add(tcodi);
        p2.add(tnom);
        p2.add(eliminar);
        p2.add(restaurar);
        p2.add(dadesLlista);
        
        //distribucio panells
        p1.setLayout(new GridLayout(5,1));
        p2.setLayout(new GridLayout(5,1));

        //distribucio
        this.add(p1, BorderLayout.WEST);
        this.add(p2, BorderLayout.EAST);
        this.add(list, BorderLayout.SOUTH);
        this.pack();
    }
    
  
    public void actualitzarLlista(){

        DefaultListModel dl = new DefaultListModel();
        
        Iterator<Soci> it = llistaSocis.iterator();
        
        while(it.hasNext()) {
            dl.addElement(it.next().toString());
        }
        
        list.setModel(dl);
        
        pack();
        
    }
    
    
    public void desarSoci(String c, String n){
        if(c.length() == 0 || n.length() == 0){
            MissatgeError msg = new MissatgeError("Error", "No has introduït cap valor.");
        } else {
            
            try {
                
                Soci soci = new Soci(Integer.parseInt(c), n);
                llistaSocis.add(soci);
                actualitzarLlista();
                
            }catch(Exception e){
                
                MissatgeError msg = new MissatgeError("Error", "El valor introduït a codi és erroni.");
            
            }
            
       }
        
    }
    
   
    public boolean comprovarSoci(int codi) {

        Iterator<Soci> it = llistaSocis.iterator();

        while (it.hasNext()) {
            
            if (it.next().getCodi() == codi) {
                
                return true;
                
            }
        }
        
        return false;

    }
    
    
    public void eliminarSoci()
    {
       try
       {
            llistaSocis.remove(list.getSelectedIndex());
            actualitzarLlista();
       
       }catch(Exception e)
       {
            MissatgeError msg = new MissatgeError("Error", "Error a l'esborrar el soci.");
       }
       
    }
    
    
    public void guardarSocis()
    {
        try
        {

            FileWriter fw = new FileWriter(RUTA);
            PrintWriter pw = new PrintWriter(fw);
            Iterator<Soci> it = llistaSocis.iterator();
            Soci s = new Soci();
            while(it.hasNext()) {

                s = it.next();
                pw.println(s.getCodi());
                pw.println(s.getNom());

            }
            
            fw.close();
            pw.close();

        }catch(Exception e)
        {
            MissatgeError msg = new MissatgeError("Error", "Error al restaurar la llista de socis.");
        }
    }
    
    
    public void restaurarLlista()
    {
        //guardar els socis a un fitxer socis.txt
        try
        {
            //primer es guarda el fitxer.
            File f = new File(RUTA);
            //es crea un scanner apartir del fitxer.
            Scanner sc = new Scanner(f);
            
            //llimpiem la llista de socis per poder importar-los de nou.
            llistaSocis.clear();
            
            while(sc.hasNext())
            {
                
                desarSoci(sc.nextLine(),sc.nextLine());
            
            }
            
            actualitzarLlista();
            sc.close();
            
        }catch(Exception e)
        {
            
            MissatgeError msg = new MissatgeError("Error", "Error de lectura");
            
        }
    
    
    }
    
    
    public void mostrarDadesFitxer() 
    {
        try
        {
            DefaultListModel dl = new DefaultListModel();
            File f = new File(RUTA);
            Scanner s = new Scanner(f);
            Soci soci = new Soci();

            while(s.hasNext()){
                soci.setCodi(s.nextInt());
                soci.setNom(s.next());
                dl.addElement(soci.toString());
            }
            list.setModel(dl);
            pack();
            s.close();

        }catch(Exception e)
        {
            MissatgeError msg = new MissatgeError("Error", "No s'ha pogut llegir el fitxer de dades.");
        }
    }
    
    
    public static void main(String[] args) {

      Formulari sf = new Formulari();
      sf.setVisible(true);

    }

      @Override
    public void actionPerformed(ActionEvent e) {

        
        switch(e.getActionCommand()){
            case "Desar":
                if(!comprovarSoci(Integer.parseInt(tcodi.getText())))
                {
                    desarSoci(tcodi.getText(), tnom.getText());
                } else 
                {
                    MissatgeError msg = new MissatgeError("Error", "Aquest Soci ja existeix.");
                }

                break;
            
            case "Eliminar": 
                if(!isDadesFitxer){
                   
                    eliminarSoci();
                    
                } else {
                    
                    MissatgeError msg = new MissatgeError("Error", "No pots eliminar dades del fitxer.");
                
                }
                
                break;
           
            case "Restaurar": 

                restaurarLlista();

                break;
            
            case "Guardar": 
                
                Object[] options = {"Yes",
                "No"};
                int n = JOptionPane.showOptionDialog(this,
                "Estàs segur que vols guardar la informació? Es sobrescriurà les dades.",
                "Guardar dades",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,     //do not use a custom Icon
                options,  //the titles of buttons
                options[0]); //default button title
                
                if(n == 0){
                    
                    guardarSocis();
                } 

                break;
                
             
            case "Dades Guardades": 
                isDadesFitxer = true;
                mostrarDadesFitxer();

                break;
            case "Dades Llista": 
                isDadesFitxer = false;
                actualitzarLlista();

            break;
            
            default: MissatgeError msg =  new MissatgeError("Error", "Opció incorrecta.");
   
        }
    
    }
    
}
