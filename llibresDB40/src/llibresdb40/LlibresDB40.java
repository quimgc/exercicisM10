/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llibresdb40;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class LlibresDB40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LlibresDB40 llibres = new LlibresDB40();
        llibres.run();

    }

    public static void run() {
        Scanner entrada = new Scanner(System.in);

//        Nom del fitxer de BBDD:
        String fitxer = "llibres.txt";

//         //Obrim la BBDD:
        ObjectContainer db = Db4o.openFile(fitxer);

//       
//        
//        //variables auxiliars:
        List<Llibre> llibres;
        List<Exemplar> exemplars;

        try {
            int opcio = 0;

            while (opcio != 7) {

                System.out.println("\n1 Crear un nou Llibre a la taula Llibres.");
                System.out.println("2 Eliminar un llibre de la taula llibres.");
                System.out.println("3 Crear un nou exemplar a la taula exemplars.");
                System.out.println("4 Eliminar un exemplar de la taula exemplars.");
                System.out.println("5 Mostrar llistat de tots els llibres.");
                System.out.println("6 Mostrar llistat de tots els exemplars.");
                System.out.println("7 Sortir.");
                opcio = entrada.nextInt();
                entrada.nextLine();
                
                switch (opcio) {
                        
                    case 1:
                        int codi;
                        int isbn;
                        String titol;
                        int anyPublicacio;
                        String editorial; 
                        String llocPublicacio;
                        try{
                            System.out.println("Introdueix un codi:");
                            codi = entrada.nextInt();
                            entrada.nextLine();
                            
                            System.out.println("Introdueix un ISBN: ");
                            isbn = entrada.nextInt();
                            entrada.nextLine();
                        
                            System.out.println("Introdueix un titol: ");
                            titol = entrada.nextLine();
                        
                            System.out.println("Introdueix un any de publicació (YYYY)");
                            anyPublicacio = entrada.nextInt();
                            entrada.nextLine();
                        
                            System.out.println("Introdueix una editorial:");
                            editorial = entrada.nextLine();
                            
                            System.out.println("Introdueix un lloc de publicació: ");
                            llocPublicacio = entrada.nextLine();

                            // 1 Crear un nou Llibre a la taula Llibres.
                            Llibre l1 = new Llibre(codi, isbn, titol, anyPublicacio, editorial, llocPublicacio);
                            //guardo llibre a la taula Llibres;
                            db.store(l1);
                            
                            
                        }catch(Exception e){
                            
                            System.out.println("Error");
                        
                        };

                        break;
                        
                        
                    case 2:
                        try{
                            System.out.println("Introdueix el titol:");
                            titol = entrada.nextLine();

                            //2.- Eliminar un Llibre de la taula Llibres.
                           List<Llibre> result = db.query(new Predicate<Llibre>() {

                               public boolean match(Llibre llibre) {

                                   return llibre.getTitol().equals(titol);

                               }

                           });

                           Llibre found = result.get(0);

                           db.delete(found);
                                
                        }catch(Exception e){
                            
                            System.out.println("Error");
                        }
                        
                        break;
                    case 3:
                        
                        int codiLlibre;
                        int nExemplar;
                        int nEdicio;
                        int codiLocalitzacio;
                        String tipusPrestec;
                        
                        try{
                            
                            System.out.println("Introdueix Codi llibre:");
                            codiLlibre = entrada.nextInt();
                            entrada.nextLine();
                            
                            System.out.println("Introdueix numero exemplar:");
                            nExemplar = entrada.nextInt();
                            entrada.nextLine();
                            
                            System.out.println("Introdueix numero edicio:");
                            nEdicio = entrada.nextInt();
                            entrada.nextLine();
                            
                            System.out.println("Introdueix codi localitzacio:");
                            codiLocalitzacio = entrada.nextInt();
                            entrada.nextLine();
                            
                            System.out.println("Introdueix tipus prestec:");
                            tipusPrestec = entrada.nextLine();
                            
                            Exemplar ex = new Exemplar(codiLlibre, nExemplar, nEdicio, codiLocalitzacio, tipusPrestec);
                            db.store(ex);
                            
                        }catch(Exception e){
                            
                            System.out.println("Error");
                            
                        }
                        
                        break;
                    case 4:
                        
                        try{
                            
                            System.out.println("Introdueix Codi llibre:");
                            codiLlibre = entrada.nextInt();
                            
                             //5.- Eliminar un Llibre de la taula Llibres.
                           List<Exemplar> result = db.query(new Predicate<Exemplar>() {

                               public boolean match(Exemplar exem) {

                                   return exem.getCodiLlibre() == codiLlibre;

                               }

                           });

                           Exemplar found = result.get(0);

                           db.delete(found);
                                
                        }catch(Exception e){
                            
                            System.out.println("Error");
                        }
                            
                        
                        break;
                    case 5:
                        
                        llibres = db.query(new Predicate<Llibre>() {

                            public boolean match(Llibre l) {

                            return l.getCodi() >= 0;

                            }
                        });

                        Llistat<Llibre> l2 = new Llistat<Llibre>(llibres);
                        l2.mostrar();
                        
                        break;
                    case 6:
                        
                        exemplars = db.query(new Predicate<Exemplar>() {

                        public boolean match(Exemplar ex) {

                        return ex.getCodiLlibre() >= 0;

                        }
                        });

                        Llistat<Exemplar> ex1 = new Llistat<Exemplar>(exemplars);
                        ex1.mostrar();

                        
                        break;
                    case 7:
                        System.out.println("Sortint...");
                        break;

                    default:
                        System.out.println("Opció incorrecta.");

                }
            };
  

        } finally {

            db.close();

        }

    }

}
