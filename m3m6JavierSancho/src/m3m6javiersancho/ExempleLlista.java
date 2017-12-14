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
public class ExempleLlista {

    public static void main(String args[]) {

        //aquest array és dinamic, quan s'afegeix un element, s'amplia
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();

        //afegim un element a l'ArrayList (se li passa per paràmetre el valor, la posició és automàtica):
        //        ArrayList.add(10);
        //     System.out.println(ArrayList.get(0));
//bucle per afegir a l'array de 0-9.
        for (int i = 0; i < 10; i++) {
            ArrayList.add(i);
            //System.out.print(ArrayList.get(i) + " ");

        }
        //System.out.println("");

        for (int i = 0; i < ArrayList.size(); i++) {
            if (ArrayList.get(i) % 2 != 0) {
                ArrayList.remove(i);
            }
        }
        for (int i = 0; i < ArrayList.size(); i++) {
            // System.out.format("%d ", ArrayList.get(i));
        }

        ArrayList<Integer> AL = new ArrayList(100000000);
        int hora0 = 0;
        int hora1 = 0;
        hora0 = (int) System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            AL.add(i);
        }
        hora1 = (int) System.currentTimeMillis();

        System.out.println("El temps emprat per instanciar un AL és: " + (hora1 - hora0));

        LinkedList<Integer> LK = new LinkedList();

        hora0 = (int) System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            LK.add(i);
        }
        
        hora1 = (int) System.currentTimeMillis();

        System.out.println("El temps emprat per instanciar un AL és: " + (hora1 - hora0));

        
        //METODES per treballar
        //ARRAYLIST -> mes facil arribar als elements del mig.
        //LINKEDLIST -> mes facil per arribar al primer elment i a l'ultim.
        
        /*
        Add-> afegeix un element a la posició
        Get -> agafar l'element a partir d'una posició.
        Set -> per actualitzar un valor
        Remove -> tambe retorna l'objecte que hi ha a la posició.
        Add -> tambe es pot fer: ADD(pos, element); afegir a partir d'una pos, un element, i els objectes que hi hagin despres de pos+1 correran un lloc.
        
        
        
        
        CUA / PILA
        
        CUA: llista ordenada d'elements.
                QUEUE -> afegir element al final de la cua. -> add();
                DEQUEUE-> treure el primer element de la llista. remove(0);
        
        
        PILA: 
            PUSH -> afegir un element. add();
            POP -> treure element -> remove();
        
        
         */
    }

}
