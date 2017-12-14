/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.util.*;

/**
 *
 * @author quim
 */
public class ExempleMap {
    
    public static void main(String[] args) {
        
        /*
        Amb TreeMap, les dades s'imprimeixen ordenades.
        Amb HashMap, les dades surten de la mateixa forma que s'insereixen.
        */
        //Map<Integer, String> map = new HashMap<Integer, String>();
       //Map<Integer, String> map = new TreeMap<Integer, String>();
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();


        //add elements
        map.put(13, "bravo");
        map.put(18, "Jordi Alba");
        map.put(24, "Mathieu");
        map.put(15, "Bartra");
        map.put(22, "Alves");
        map.put(5, "Busquets");
        map.put(6, "Xavi");
        map.put(4, "Rakitic");
        map.put(7, "Pedro");
        map.put(10, "Messi");
        map.put(31, "Munir");

        
        //Print Last Map

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
                Integer key = (Integer) it.next();
                System.out.println("Clau: " + key + " -> valor: " + map.get(key));
        }
        
    }
}
