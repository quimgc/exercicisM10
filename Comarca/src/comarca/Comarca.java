/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author quim
 */
public class Comarca<Com> {

    private Com codi;
    private Com nom;
    private Com numMunicipis;
    private Com superficie;
    private Com habitants;

    public Com getCodi() {
        return codi;
    }

    public void setCodi(Com codi) {
        this.codi = codi;
    }

    public Com getNom() {
        return nom;
    }

    public void setNom(Com nom) {
        this.nom = nom;
    }

    public Com getNumMunicipis() {
        return numMunicipis;
    }

    public void setNumMunicipis(Com numMunicipis) {
        this.numMunicipis = numMunicipis;
    }

    public Com getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Com superficie) {
        this.superficie = superficie;
    }

    public Com getHabitants() {
        return habitants;
    }

    public void setHabitants(Com habitants) {
        this.habitants = habitants;
    }
    
    
    
    
   public static boolean isNumeric(String s) {  
    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
}

    public static void main(String[] args) throws FileNotFoundException {
        int numLinies=0;
        int index = 0;

        Scanner cp = new Scanner(new FileReader("Comarques.txt"));
        //comptador de linies del fitxer.
        
        while (cp.hasNext()) {
         String i = String.valueOf(cp.nextLine());
            numLinies++;
        }
       
        String[] vector = new String[(numLinies/2)+1];
        
        
        Scanner in = new Scanner(new FileReader("Comarques.txt"));
        
        
        while (in.hasNext()) {
            
            String i = String.valueOf(in.nextLine());
            if(isNumeric(i)){
                index = Integer.parseInt(i);
               // System.out.print(" index "+ index);
            }else{
                //System.out.println(" comarca "+ i);
                vector[index]=i;
            }
            
        }
        
    }
}
