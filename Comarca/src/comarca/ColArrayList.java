/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author quim
 */
public class ColArrayList {
 //municipis
    
        public static void main(String[] args) throws FileNotFoundException {

            //ArrayList<Integer> v = new ArrayList();
           List <Integer> v = new LinkedList();
            
        Scanner in = new Scanner(new FileReader("Enters.txt"));
        
        while(in.hasNext()){
            Integer i = Integer.parseInt(in.nextLine());
            v.add(i);
        }
        in.close();
        /*
            for (int i = 0; i < v.size(); i++) {
                System.out.println(v.get(i));
            }
        */
        //equivalent
        Iterator it = v.iterator();
        /*
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        
        //equivalent
        /*
        v.forEach((element)->{
            System.out.println(element);  
        });*/
        
        //equivalent
        //v.forEach(System.out::println);
        
        //ordena una llista amb ordre
        Collections.sort(v);
        //ordena una llista de forma invers
        Collections.reverse(v);
        
        Collections.sort(v, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                     //ordenadció invertida
                    return o2.compareTo(o1);
                    //ordenació normal
                    // return o1.compareTo(o2);
                }
        });
        
        
        
        v.forEach(new Consumer<Integer>(){
            
                @Override
                public void accept(Integer t) {
                    System.out.println(t);
                }
                
            
        });
        
       /* Municipi[] municipis = new Municipi[0];
        
        while (mun.hasNext()) {
            //llegim el numero
            int codiComarca = Integer.parseInt(mun.nextLine());
            int codiMunicipi = Integer.parseInt(mun.nextLine());
            //llegim el nom de la següent linia
            String nom = mun.nextLine();
            int numHab = Integer.parseInt(mun.nextLine());
            double superficie = Double.parseDouble(mun.nextLine());
        
            Municipi m = new Municipi(codiComarca, codiMunicipi, nom, numHab, superficie);
        
            if(codiComarca<municipis.length){
                municipis[codiComarca]=m;
            }else{
                 municipis = Arrays.copyOf(municipis, codiComarca + 1);
                municipis[codiComarca] = m;
            }
        }
        
        for(Municipi m : municipis){
            System.out.println(m);
        } */   
}
}