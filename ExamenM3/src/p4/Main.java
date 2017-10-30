/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4;
import java.util.Scanner;
import p4.ScrabbleExamen;

/**
 *
 * @author quim
 */
public class Main {
    
    public static void main(String[] args) {
        
        ScrabbleExamen s = new ScrabbleExamen();
        Scanner entrada = new Scanner(System.in);
        String p="";
        s.demanarLletres();
        int index = 5;
        while(index>0){
            System.out.print("Introdueix una paraula: ");
            p = entrada.nextLine();
            if(p==null || p.length() == 0){
                System.out.println("No has passat cap paraula.");
                 
            }else{
             System.out.println(s.comporvarParaula(p));
             index--;
            }
        }
        
    
    }
    
}
