/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class exempleCua {

    public static void queue(LinkedList<String> l, String s) {
        l.add("Element " + s);
    }
    public static void afegirLinkedList(LinkedList<String> l, LinkedList<String> s) {
        l.add("LinkedList " + s);
    }

    public static void imprimirBucle(LinkedList l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");

        }
    }

    public static String dequeue(LinkedList<String> l) {
        return l.remove(0);
    }

    public static boolean esBuida(LinkedList<String> l) {

        return l.isEmpty();

    }

    public static long tamany(LinkedList<String> l) {
        return l.size();
    }

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList();
        LinkedList<String> ll = new LinkedList();
        LinkedList<String> ll2 = new LinkedList();

        for (int i = 0; i < 10; i++) {

            linkedList.add("Element " + i);
        }

    
        String resposta = "";
        boolean esCorrecte = false;
        while (!esCorrecte) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.print("Llista 1: ");
            imprimirBucle(linkedList);

            System.out.println("");

            System.out.println("Llista 2: ");
            imprimirBucle(ll);

            System.out.println("");

            System.out.print("Llista 3: ");
            imprimirBucle(ll2);

            System.out.println("");
            
            
            
            System.out.println("Introdueix QUE, DEQUE, EXIT, TAMANY,  ESBUIDA, NOVA");
            resposta = entrada.nextLine();

            switch (resposta) {

                case "QUE":
                    String cua = "";
                    String cadena = "";
                    String cua2 = "";
                    System.out.println("Introdueix una cadena: ");
                    cadena = entrada2.nextLine();
                    boolean isCorrecte = false;
                    while (!isCorrecte) {
                        System.out.println("Introdueix una llista: CUA1, CUA2, CUA3 ");
                        cua = entrada2.nextLine();
                        switch (cua) {
                            case "CUA1":
                                queue(linkedList, cadena);
                                isCorrecte = true;
                                break;
                            case "CUA2":
                                queue(ll, cadena);
                                isCorrecte = true;
                                break;
                            case "CUA3":
                                queue(ll2, cadena);
                                isCorrecte = true;
                                break;
                            default:
                                System.out.println("No has introduït una llista correcta.");
                        }
                    }

                    break;

                case "DEQUE":
                    
                    isCorrecte = false;
                    
                    while(!isCorrecte){
                        System.out.println("Introdueix la llista d'entrada: linkedList, ll, ll2");
                        cua = entrada2.nextLine();
                        
                        System.out.println("Introdueix la llista de sortida: linkedList, ll, ll2");
                        cua2 = entrada2.nextLine();
                        switch(cua){
                            case "linkedList": break;
                            case "ll": break;
                            case "ll2": break;
                            default: System.out.println("No existeix aquesta linkedList");
                        }
                    }

                    if (esBuida(linkedList)) {
                        ll.add(dequeue(linkedList));
                    } else {
                        System.out.println("Està buid!!");
                    }
                    break;
                    
                    

                case "TAMANY":
                    tamany(linkedList);
                    break;

                case "ESBUIDA":
                    esBuida(linkedList);
                    break;

                case "EXIT":
                    esCorrecte = true;
                    break;
                case "NOVA":
                    isCorrecte = false;
                      while (!isCorrecte) {
                        System.out.println("Introdueix una llista: CUA1, CUA2, CUA3 ");
                        cua = entrada2.nextLine();
                     
                        switch (cua) {
                            case "CUA1":
                                afegirLinkedList(linkedList, new LinkedList());
                                isCorrecte = true;
                                break;
                            case "CUA2":
                                afegirLinkedList(ll, new LinkedList());
                                isCorrecte = true;
                                break;
                            case "CUA3":
                                afegirLinkedList(ll2, new LinkedList());
                                isCorrecte = true;
                                break;
                            default:
                                System.out.println("No has introduït una llista correcta.");
                        }
                    }
                    esCorrecte = true;
                    break;
                default:

                    System.out.println("Resposta no correcta");
            }

        }
        System.out.print("Llista 1: ");
        imprimirBucle(linkedList);
        System.out.println("");
        System.out.print("Llista 2: ");
        imprimirBucle(ll);
        System.out.print("Llista 3: ");
        imprimirBucle(ll2);
        System.out.println("");

    }

}
