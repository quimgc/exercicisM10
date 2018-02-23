/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class Main {
    
    static Llibre book;
    List <Exemplar> exemplars;
    static List <Llibre> llibres;
    
    
    public static int getLastCodi(List<Llibre> l){
        try{
            int codi = l.get(l.size()).getCodi();
            if(codi!= 0){
                return codi; 
            }
                        
        }catch(Exception e){
            
            e.getMessage();
        }
        
            return 0;

    }
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        Scanner entradaText = new Scanner(System.in);
        
        String resposta = "";
        
        
        
        while(resposta != "7"){
            
            System.out.println("\n1. Afegir llibre.");
            System.out.println("2. Afegir Exemplar.");
            System.out.println("3. Esborrar llibre.");
            System.out.println("4. Esborrar exemplar.");
            System.out.println("5. Mostrar llibres.");
            System.out.println("6. Mostrar Exemplars.");
            System.out.println("7. Sortir.");
            
            resposta = entradaText.nextLine();
            
        

            switch(resposta){

                case "1": 
                    int codi = getLastCodi(llibres);
                    int isbn;
                    String titol = "";
                    String any = "";
                    Date anyPublicacio = new Date();
                    String editorial = "";
                    String llocPublicacio = "";
                    boolean infoCorrecta = false;

                    //afegir llibre
                    System.out.format("Codi (auto increment): %d\n", codi); //ha de ser únic, recorrer llista de libres per mirar si ja està el codi.


                    while(infoCorrecta != true){        

                        try{
                                System.out.print("ISBN (10 digits): ");
                                String aux = entradaText.nextLine();
                                isbn = Integer.parseInt(aux);
                                if(Integer.toString(isbn).length() == 10){
                                    infoCorrecta = true;
                                }
                        }catch(Exception e){
                            
                            System.out.println("Tipus de dades incorrecte");
                        } 
                    }

                    infoCorrecta = false;
                    
                    while(infoCorrecta != true){
                        try{
                            
                            System.out.print("Titol: ");
                            String aux = entrada.nextLine();
                                titol = aux;
                            
                                if(titol.length() > 0){
                                    infoCorrecta = true;
                                }
                            
                        }catch(Exception e){
                            
                            System.out.println("Titol erroni");
                            
                        }
                        
                    }
                    
                    infoCorrecta = false;

                    while(infoCorrecta != true){
                        try{
                            

                            System.out.print("Any Publicació (yyyy): ");

                            any = entrada.nextLine();

                            anyPublicacio.setYear(Integer.parseInt(any));
                            
                            infoCorrecta = true;
                            
                        }catch(Exception e){

                                System.out.println("Any erroni");

                        }

                    }
                    
                    infoCorrecta = false;
                    
                    
                    while(infoCorrecta != true){
                        try{
                            
                            System.out.print("Editorial: ");
                            
                            editorial = entradaText.nextLine();
                            
                            infoCorrecta = true;
                            
                        }catch(Exception e){

                                System.out.println("Editorial erroni");

                        }

                    }
                    
                 
                    infoCorrecta = false;
                    
                    
                    while(infoCorrecta != true){
                        try{
                            
                            System.out.print("Lloc Publicació: ");

                            llocPublicacio = entrada.nextLine();

                            infoCorrecta = true;
                            
                        }catch(Exception e){

                                System.out.println("Lloc publicació erroni");

                        }

                    }
                    
                    break;

                case "2": 

                    //afegir exemplar PREGUNTANT PER UN LLIBRE, I SI NO N'HI HA CREAR-LO (?)

                    break;

                case "3": 

                    //Esborrar llibre -> esborrar també els exemplars

                    break;

                case "4":

                    //esborrar exemplars d'un llibre -> comprovar si existeix el llibre

                    break;

                case "5": 

                    //mostrar llibres

                    break;

                case "6": 

                    // mostrar exemplars -> de cada llibre

                    break;


                case "7": 

                    System.out.println("Sortint...");
                    resposta = "7";

                    break;

                default: System.out.println("Opció incorrecta!");
            }
        
            
        }
    }
    
}
