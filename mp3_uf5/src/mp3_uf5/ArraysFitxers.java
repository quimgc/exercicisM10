/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3_uf5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class ArraysFitxers {
    
    public static void main(String[] args) throws FileNotFoundException{
        
    Integer[] arr = new Integer[6];
    //or
    Integer[] arr2 = {12,2,33,45,5,26};

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        
        }
        
        System.out.println("");
        
        //Equivalent
        Arrays.sort(arr2); // això ordena un array de < a >.

        
        for(Integer i : arr2){
            System.out.print(i + " ");
        }
        
        System.out.println("");
        Arrays.fill(arr2, 5);

        //amb això es converteix un array amb un iterador (per convertir amb una llista)
        Iterator it = Arrays.asList(arr2).iterator();
        
        //it.hasNext() retorna = mentres hi hagi un següent element...
        
        
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
        
        System.out.println("");
        
        
        arr2 = Arrays.copyOf(arr2, 8);
        
        
        //amb això es converteix un array amb un iterador (per convertir amb una llista)
        Iterator it2 = Arrays.asList(arr2).iterator();
        
        //it.hasNext() retorna = mentres hi hagi un següent element...     
        while(it2.hasNext()){
            System.out.print(it2.next()+ " ");
        }
        
        System.out.println("");
        
         
        
        Scanner in = new Scanner(new FileReader("text.txt"));
        
        while(in.hasNext()){
            Integer i = Integer.parseInt(in.nextLine());
            System.out.println(i);
        }
    }
 
}
