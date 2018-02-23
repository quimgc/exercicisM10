/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llibresdb40;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class LlibresDB40Millorat {
    static List<Llibre> llibres;
    static List<Exemplar> exemplars;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                    

        LlibresDB40Millorat llibres = new LlibresDB40Millorat();
        llibres.run();

    }
       private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
       
      
       

    public static void run() {
        String codi = "";
        String isbn;
        String titol;
        String anyPublicacio = "";
        String editorial; 
        String llocPublicacio;
        boolean dadaCorrecta = false;
        
        Scanner entrada = new Scanner(System.in);

//        Nom del fitxer de BBDD:
        String fitxer = "llibres.txt";

//         //Obrim la BBDD:
        ObjectContainer db = Db4o.openFile(fitxer);

//       
//        
//        //variables auxiliars:
   

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

                    //agafo l'ultim llibre, miro el codi, i l'incremento, si no hi ha últim llibre, li poso 1.
                 
                    try {
                        System.out.println("Introdueix un codi: ");
                                codi = entrada.nextLine();
                        while (dadaCorrecta == false) {
                            try {
                                

                                if (isNumeric(codi)) {

                                    llibres = db.query(new Predicate<Llibre>() {

                                        public boolean match(Llibre l) {

                                            return l.getCodi() >= 0;

                                        }
                                    });

                                    Llistat<Llibre> l2 = new Llistat<Llibre>(llibres);

                                    if(l2.comprovarCodi(Integer.parseInt(codi))){

                                        dadaCorrecta = true;
                                    } else {
                                        System.out.println("Auest codi ja existeix, introdueix un codi:");
                                        codi = entrada.nextLine();
                                    }
                                } else {

                                    System.out.println("Codi erroni. Introdueix un codi:");
                                    codi = entrada.nextLine();
                                }

                            } catch (Exception e) {

                                System.out.println("Error " + e.getMessage());
                            }
                        }
                        
                        dadaCorrecta = false;
                        
                        System.out.println("Introdueix un ISBN: ");
                        isbn = entrada.nextLine();
                        while (dadaCorrecta == false) {

                            try {

                                if (isNumeric(isbn)) {

                                    dadaCorrecta = true;

                                } else {

                                    System.out.println("Introdueix un ISBN:");
                                    isbn = entrada.nextLine();
                                }

                            } catch (Exception e) {

                                System.out.println("Error " + e.getMessage());
                            }
                        }

                        System.out.println("Introdueix un titol: ");
                        titol = entrada.nextLine();

                        dadaCorrecta = false;

                        while (dadaCorrecta == false) {

                            try {

                                if (isNumeric(anyPublicacio)) {

                                    dadaCorrecta = true;
                                } else {

                                    System.out.println("Introdueix un any de publicació (YYYY)");
                                    anyPublicacio = entrada.nextLine();

                                }

                            } catch (Exception e) {

                                System.out.println("Error " + e.getMessage());
                            }
                        }

                        System.out.println("Introdueix una editorial:");
                        editorial = entrada.nextLine();

                        System.out.println("Introdueix un lloc de publicació: ");
                        llocPublicacio = entrada.nextLine();

                        Llibre l1 = new Llibre(Integer.parseInt(codi), Integer.parseInt(isbn), titol, Integer.parseInt(anyPublicacio), editorial, llocPublicacio);
                         
                        db.store(l1);
                        
                    } catch (Exception e) {

                        System.out.println("Error");

                    };

                    break;

                        
                    case 2:
                        try{
                            System.out.println("Introdueix el titol:");
                            String t = entrada.nextLine();

                            //2.- Eliminar un Llibre de la taula Llibres.
                           List<Llibre> result = db.query(new Predicate<Llibre>() {

                        
                               public boolean match(Llibre llibre) {

                                   return llibre.getTitol().equals(t);

                               }

                           });

                           Llibre found = result.get(0);

                           db.delete(found);
                                
                        }catch(Exception e){
                            
                            System.out.println("Error");
                        }
                        
                        break;
                    case 3:
                        
                        String codiLlibre;
                        String nExemplar;
                        String nEdicio;
                        String codiLocalitzacio;
                        String tipusPrestec;
                        
                        try{
                            
                            System.out.println("Introdueix Codi llibre:");
                            codiLlibre =entrada.nextLine();
                            
                            while(dadaCorrecta == false){
                                
                                try{
                                    if(isNumeric(codiLlibre)){
                                        
                                        llibres = db.query(new Predicate<Llibre>() {

                                            public boolean match(Llibre l) {

                                                return l.getCodi() >= 0;

                                            }
                                        });

                                        Llistat<Llibre> l2 = new Llistat<Llibre>(llibres);

                                        if(!l2.comprovarCodi(Integer.parseInt(codiLlibre))){

                                            dadaCorrecta = true;
                                        
                                        } else {
                                            System.out.println("Aquest llibre no existeix, introdueix un codi:");
                                            codiLlibre = entrada.nextLine();
                                        }
                                        
                                    } else {
                                        System.out.println("Introdueix Codi llibre:");
                                        codiLlibre = entrada.nextLine();
                                    }
                                    
                                    
                                }catch(Exception e){
                                    System.out.println("Error " + e.getMessage());                                    
                                }
                                
                            }
                            
                            dadaCorrecta = false;
                            System.out.println("Introdueix numero exemplar:");
                            nExemplar = entrada.nextLine();
                            
                            while(dadaCorrecta == false) {
                                
                                try{
                                
                                    if(isNumeric(nExemplar)){
                                        dadaCorrecta = true;
                                        
                                    } else {
                                        System.out.println("Introdueix numero exemplar:");
                                        nExemplar = entrada.nextLine();
                                    }
                                    
                                }catch(Exception e){
                                    System.out.println("Error " + e.getMessage());
                                }
                            }
                            
                            dadaCorrecta = true;
                            
                      
                            
                            System.out.println("Introdueix numero edicio:");
                            nEdicio = entrada.nextLine();
                            
                            while(dadaCorrecta == false) {
                                
                                try{
                                
                                    if(isNumeric(nEdicio)){
                                        dadaCorrecta = true;
                                        
                                    } else {
                                        System.out.println("Introdueix numero edicio:");
                                        nEdicio = entrada.nextLine();
                                    }
                                    
                                }catch(Exception e){
                                    System.out.println("Error " + e.getMessage());
                                }
                            }
                            
                            dadaCorrecta = true;
                            
                            System.out.println("Introdueix codi localitzacio:");
                            codiLocalitzacio = entrada.nextLine();
                            
                            while(dadaCorrecta == false) {
                                
                                try{
                                
                                    if(isNumeric(codiLocalitzacio)){
                                        dadaCorrecta = true;
                                        
                                    } else {
                                        System.out.println("Introdueix codi localitzacio:");
                                        codiLocalitzacio = entrada.nextLine();
                                    }
                                    
                                }catch(Exception e){
                                    System.out.println("Error " + e.getMessage());
                                }
                            }
                            
                            dadaCorrecta = true;
                            
                            System.out.println("Introdueix tipus prestec:");
                            tipusPrestec = entrada.nextLine();
                            
                            Exemplar ex = new Exemplar(Integer.parseInt(codiLlibre), Integer.parseInt(nExemplar), Integer.parseInt(nEdicio), Integer.parseInt(codiLocalitzacio), tipusPrestec);
                            db.store(ex);
                            
                        }catch(Exception e){
                            
                            System.out.println("Error");
                            
                        }
                        
                        break;
                    case 4:
                        
                        try{
                            
                          System.out.println("Introdueix Codi llibre:");
                            int codiLlib = entrada.nextInt();
                            entrada.nextLine();
                            
                            while(dadaCorrecta == false){
                                
                                try{
                                    if(isNumeric(Integer.toString(codiLlib))){
                                        
                                        llibres = db.query(new Predicate<Llibre>() {

                                            public boolean match(Llibre l) {

                                                return l.getCodi() >= 0;

                                            }
                                        });

                                        Llistat<Llibre> l2 = new Llistat<Llibre>(llibres);

                                        if(!l2.comprovarCodi(codiLlib)){

                                            dadaCorrecta = true;
                                        
                                        } else {
                                            System.out.println("Aquest llibre no existeix, introdueix un altre codi:");
                                            codiLlib = entrada.nextInt();
                                            entrada.nextLine();
                                        }
                                        
                                    } else {
                                        System.out.println("Introdueix Codi llibre:");
                                        codiLlib = entrada.nextInt();
                                        entrada.nextLine();
                                    }
                                    
                                    
                                }catch(Exception e){
                                    System.out.println("Error " + e.getMessage());                                    
                                }
                                
                            }
                            int codiDefinitiu = codiLlib;
                            
                             //5.- Eliminar un Llibre de la taula Llibres.
                             
                           List<Exemplar> result = db.query(new Predicate<Exemplar>() {

                               public boolean match(Exemplar exem) {

                                   return exem.getCodiLlibre()== codiDefinitiu;
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
