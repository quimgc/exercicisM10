/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.util.LinkedList;

/**
 *
 * @author quim
 */
public class ExemplePila {

    public static void push(LinkedList<Integer> l, int num) {
        l.add(num);
    }

    public static int tap(LinkedList<Integer> l) {
        return l.getLast();
    }

    public static void pop(LinkedList<Integer> l) {
        l.removeLast();
    }

    public static void mostrarPila(LinkedList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(" " + l.get(i));
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        //ExemplePila p = new ExemplePila();
        LinkedList<Integer> Pila = new LinkedList();

        for (int i = 0; i < 10; i++) {
            Pila.add(i);
        }
            //p.mostrarPila(Pila);
            //p.push(Pila,10);
            //p.mostrarPila(Pila);
        mostrarPila(Pila);
        push(Pila, 10);
        mostrarPila(Pila);
        System.out.println(tap(Pila));
        pop(Pila);
        mostrarPila(Pila);
        
    }


}
