/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.util.*;
import static java.util.Collections.reverseOrder;

/**
 *
 * @author quim
 */
public class MapIngredients {

    public static void addIngredient(Map<Integer, String> m, int k, String s) {
        m.put(k, s);
    }

    public static boolean valorLliure(Map<Integer, String> m, int k) {
        if (m.get(k) == null) {
            return true;
        }
        return false;
    }

    public static void mostrarIngredients(Map<Integer, String> m) {
        Iterator it = m.keySet().iterator();

        while (it.hasNext()) {
            System.out.println("");
            Integer key = (Integer) it.next();
            System.out.println("Preu: " + key + " -> Ingredient: " + m.get(key));

        }

    }

    public static Map<Integer, String> pressupost(Map<Integer, String> m, int k) {
        Map<Integer, String> map = new TreeMap<Integer, String>(reverseOrder());
        if (!valorLliure(m, k)) {
            map.put(k, m.get(k));
            return map;
        }
        int pressupost = k;
        int contProductes = 0;
        k = k - 1;
        
        while(pressupost > 0){
            if(!valorLliure(m,k)){
                map.put(k, m.get(k));
                System.out.println("1 de " + m.get(k)+  " que té un preu de: " + k);
                pressupost-=k;
                if(pressupost<k){
                    k=pressupost;
                }
                
            }else {
                k--;
            }
        }
       

        return map;
    }

    public static void deleteIngredient(Map<Integer, String> m, int k) {
        m.remove(k);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);

        boolean sortir = false;
        int resposta = 0;
        Map<Integer, String> ingredients = new TreeMap<Integer, String>();

        while (!sortir) {
            System.out.println("1. Introduïr un ingredient.");
            System.out.println("2. Eliminar un ingredient.");
            System.out.println("3. Llistar ingredients.");
            System.out.println("4. Pressupost.");
            System.out.println("5. Exit.");
            resposta = entrada.nextInt();
            switch (resposta) {
                case 1:
                    System.out.println("Introdueix un preu: ");
                    int valor = entrada.nextInt();
                    System.out.println("Introdueix el nom de l'ingredient: ");
                    String clau = entradaText.nextLine();
                    if (valorLliure(ingredients, valor)) {
                        ingredients.put(valor, clau);
                        System.out.println("Ingredient afegit!");
                    } else {
                        System.out.println("Aquest preu ja està utilitzat: " + ingredients.get(valor));
                    }
                    break;
                case 2:
                    if (ingredients.size() == 0) {
                        System.out.println("No hi ha ingredients");

                    } else {
                        mostrarIngredients(ingredients);
                        System.out.println("Introdueix el preu per eliminar l'ingredient: ");
                        int k = entrada.nextInt();
                        while (valorLliure(ingredients, k) == true) {
                            System.out.println("Introdueix el preu per eliminar l'ingredient: ");
                            k = entrada.nextInt();
                        }
                        deleteIngredient(ingredients, k);
                    }
                    break;

                case 3:
                    if (ingredients.size() == 0) {
                        System.out.println("No hi ha ingredients");

                    } else {
                        mostrarIngredients(ingredients);
                    }
                    break;
                case 4:
                    if (ingredients.size() == 0) {
                        System.out.println("No hi ha ingredients.");

                    } else {
                        System.out.println("Digues un pressupost: ");
                        int p = entrada.nextInt();
                       pressupost(ingredients,p);
                    }
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("resposta no correcta");
            }

        }

    }
}
