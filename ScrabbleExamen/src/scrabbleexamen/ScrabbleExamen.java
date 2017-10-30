/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabbleexamen;

import java.util.Scanner;

/**
 *
 * @author quim
 */
public class ScrabbleExamen {


private String lletres;

    public String getLletres() {
        return lletres;
    }


public ScrabbleExamen(){

}



public void demanarLletres(){
   Scanner entrada = new Scanner(System.in);
   String paraula="";
    System.out.println("Introdueix 7 caràcters:  ");
    paraula = entrada.nextLine();
    if(paraula.length() == 7){
        
        this.lletres=paraula;

    } else {
        throw new RuntimeException("No has introduït 7 caràcters.");

    }
    
}

public boolean comporvarParaula(String paraula){
    if(paraula.length()>7){
        return false;
    }
    String convertit= this.lletres;
    int lletraTrobada = 0;
    for (int i = 0; i < convertit.length(); i++) {
        for (int j = 0; j < paraula.length(); j++) {
            if(convertit.charAt(i)==paraula.charAt(j)){
            }
        }
    }
    if(lletraTrobada == paraula.length()){
        return true;
    }
   return false;
}

}
