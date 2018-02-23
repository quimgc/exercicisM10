/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scaperoom;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author quim
 */
public class ScapeRoom {

    static String lletres = "dixcns";
    static ArrayList<Combinacio> combinacions = new ArrayList<Combinacio>();
    static final String RUTA =  "combinacions.txt";


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        int numCombinacions = getCombinacions(lletres.length());
        
        guardarCombinacio(lletres);

        numCombinacions --;

        while (numCombinacions > 0) {

            String tmp = generarCombinacio();

            if (comprovarCombinacio(tmp)) {
                
                guardarCombinacio(tmp);
                numCombinacions--;

            } 

        }
        
        llistarCombinacions();
        
        guardarFitxerText();


    }
    
    public static void guardarCombinacio(String c){
        
           Combinacio co = new Combinacio(c);
            combinacions.add(co);
    }

    public static boolean comprovarCombinacio( String c) {
        
        if(lletres == c){
            
            return false;
        }

        Iterator it = combinacions.iterator();
        
        Combinacio com;
        
        while(it.hasNext()){
        
            com = (Combinacio)it.next();

            if(com.getCombinacio().equals(c) ){
                return false;

            }
        }

   
        return true;
    }

    public static void llistarCombinacions() {
        Iterator it = combinacions.iterator();
        Combinacio com;
        while (it.hasNext()) {
            com = (Combinacio) it.next();
            System.out.println(com.toString());
        }
    }

    public static String generarCombinacio() {
        Random rnd = new Random();

        String combinacio = "";
        for (int i = 0; i < lletres.length(); i++) {

            combinacio += lletres.charAt(rnd.nextInt(lletres.length()));
        }
        
        return combinacio;
    }
    
    public static void guardarFitxerText(){
    {
        try
        {

            FileWriter fw = new FileWriter(RUTA);
            PrintWriter pw = new PrintWriter(fw);
            Iterator<Combinacio> it = combinacions.iterator();
            Combinacio c;
            while(it.hasNext()) {
                c = it.next();
                pw.println(c.getCombinacio());

            }
            
            fw.close();
            pw.close();

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
    
     public static int getCombinacions(int n){
         
        int num = 1;
         for (int i = 1; i<= n; i++) {
            num*=i;
         
         }
        return num;
    }
   
}
