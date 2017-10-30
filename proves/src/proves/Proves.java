/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proves;

import java.util.Scanner;
import proves.QuintoMilenio;

/**
 *
 * @author quim
 */
public class Proves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entradaNums = new Scanner (System.in);
        Scanner entrada = new Scanner (System.in);

    
//    String cadena = "Segons uns ferits durant els atacs xenofobs a valencia, la policia no va fer res";
//    String paraula = "son uns fatxes";
//
//    
//    int indexParaula = 0;
//    cadena = cadena.toLowerCase();
//    cadena = cadena.replace(" ","");
//    paraula = paraula.replace(" ", "");
//        for (int i = 0; i < cadena.length(); i++) {
//            
//            if(indexParaula==paraula.length()){
//                
//                    break;
//                }
//            if(cadena.charAt(i) == paraula.charAt(indexParaula)){
//                  
//                indexParaula++;
//
//            }
//        }
//        if(indexParaula == paraula.length()){
//            System.out.println(" Paraula trobada");
//        }else{
//            System.out.println("Paraula no trobada");
//        }

    int numRepeticions = 0;
    String cadena = "";
    String subcadena = "";
    System.out.println("Indica el num de repeticions: ");
            numRepeticions = entradaNums.nextInt();
            
        while(numRepeticions>0){
            System.out.print("Introdueix una cadena: ");
            cadena = entrada.nextLine();
            System.out.print("\nIntrodueix subcadena: ");
            subcadena = entrada.nextLine();
       
            
            System.out.println(QuintoMilenio.trobarParaulaAcadena(cadena, subcadena));
            
            numRepeticions--;
        }
            
    




    }
    
}
