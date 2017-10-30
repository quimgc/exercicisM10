/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proves;

/**
 *
 * @author quim
 */
public class QuintoMilenio {
    
    public static String trobarParaulaAcadena(String cadena, String subcadena){
        if(cadena.length()==0 || subcadena.length()==0){
            return "No has passat els paràmetres correctament";
        }
        
       cadena = cadena.toLowerCase().replace(" ", "").replace(".","");
        
       subcadena = subcadena.toLowerCase().replace(" ", "").replace(".", " ");
       
       int indexSubcadena = 0;
        for (int i = 0; i < cadena.length(); i++) {
            
            if(indexSubcadena == subcadena.length()){
                return "SI";
            }
            if(cadena.charAt(i) == subcadena.charAt(indexSubcadena)){
                
                indexSubcadena++;
            }
            
        }
        
        if(indexSubcadena == subcadena.length()){
            return "SI";
        }
       return "NO";   
    }
    
}
