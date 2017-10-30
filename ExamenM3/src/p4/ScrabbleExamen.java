/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;

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

public ScrabbleExamen(String lletres){
this.lletres = lletres;
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

/*

public boolean comprovarParaula(String paraula){
    String copiaLletres = this.lletres;

    for(int i=0; i<paraula.length(); i++){
        int posicio = copiaLletres.indexOf(paraula.charAt(i)); 

    //això el que fa es bucar la lletra a copiaLletres.
     //si posicio és igual a -1, es que no ha trobat la lletra, per tant, s'ha acabat la comprovació.
     // else, treiem la lletra a copiaLletres amb replaceFirst. 

        if(posicio == -1){
            return false;
        }else{
        
            copiaLletres  = copiaLletres.replaceFirst(""+copiaLletres.charAt(j),"");
        
        }
    
    }

return true;

}

 */



public boolean comporvarParaula(String paraula){
    if(paraula.length()>7){
        System.out.println("paraula massa gran");
        return false;
    }
    int indexParaula = 0;
    String copiaLletres = this.lletres;
    for (int i = 0; i < paraula.length(); i++) {
        //System.out.println("paraula "+ paraula.charAt(i));

        for (int j = 0; j < copiaLletres.length(); j++) {
           // System.out.println(" copiaLLetres "+copiaLletres.charAt(j) );

            if(copiaLletres.charAt(j) == paraula.charAt(i)){
               // System.out.println(copiaLletres.charAt(j) +" "+ paraula.charAt(i));
                //System.out.println("String "+ copiaLletres);

                //String.valueOf converteix un char a String.
                //copiaLletres = copiaLletres.replaceFirst(String.valueOf(copiaLletres.charAt(j)),"");

                copiaLletres = copiaLletres.replaceFirst(""+copiaLletres.charAt(j),"");
                 //System.out.println("String "+ copiaLletres);
                indexParaula ++;
                break;
                            
            }
        }
        
    }
   
    if(indexParaula == paraula.length()){
        return true;
    }
   return false;
}


/**
      int intIndex = a.indexOf("lenguaje sql");
          if(intIndex == - 1){
             System.out.println("palabra encontrada");
          }else{
             System.out.println("palabra no encontrada"
             + intIndex);
          }
 */

}
