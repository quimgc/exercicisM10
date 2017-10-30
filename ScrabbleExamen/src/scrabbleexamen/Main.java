/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrabbleexamen;
import scrabbleexamen.ScrabbleExamen;

/**
 *
 * @author quim
 */
public class Main {
    
    public static void main(String[] args) {
        
        ScrabbleExamen s = new ScrabbleExamen();
        
        s.demanarLletres();
        System.out.println(s.comporvarParaula("quim"));
        
    
    }
    
}
