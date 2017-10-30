/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_uf5;

/**
 *
 * @author quim
 */
public class Main {
    public static void main(String[] args){
        
        //Es crea una classe d'enters.
        ClasseGenerica<Integer> cg = new ClasseGenerica<Integer>(23);
        System.out.println(cg.getElement());
        
        //Es crea una classe amb Strings
        ClasseGenerica<String> cgs = new ClasseGenerica("Hola");
        System.out.println(cgs.getElement());
    
        ClasseGenerica<ClasseNova> cg2 = new ClasseGenerica(new ClasseNova());
        
        System.out.println(cg2.getElement());
        

    }
}
