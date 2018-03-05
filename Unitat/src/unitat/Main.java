/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author quim
 */
public class Main {
    
    static File fitxerExercit1 = new File("exercit1.txt");
    static File fitxerExercit2 = new File("exercit2.txt");

//    static ArrayList<Unitat> exercit = new ArrayList<Unitat>();

    
    public static ArrayList<Unitat> generarUnitats(){
        ArrayList<Unitat> exercit = new ArrayList<Unitat>();
        int numUnitats = 500;
        String[] noms = {"Infanteria", "Cavalleria", "Artilleria", "Arquers"};
        Random rnd = new Random();
        
        Unitat[] unitats = new Unitat[numUnitats];
        for (int i = 0; i < numUnitats; i++) {
            
            String nom = noms[rnd.nextInt(noms.length)];
            int minForça=0;
            int maxForça=0;
            int minResistencia = 0;
            int maxResistencia = 0;
            Double moviment = 0.0;
            switch(nom){
                case "Infanteria": 
                    minForça = 5;
                    maxForça = 15;
                    minResistencia = 10;
                    maxResistencia = 20;
                    moviment = 2.0;
                    break;
                case "Cavalleria":
                    minForça = 10;
                    maxForça = 20;
                    minResistencia = 20;
                    maxResistencia = 30;
                    moviment = 4.0;
                    break;
                case "Artilleria": 
                    minForça = 50;
                    maxForça = 100;
                    minResistencia = 100;
                    maxResistencia = 200;
                    moviment = 1.0;
                    break;
                case "Arquers": 
                    minForça = 5;
                    maxForça = 10;
                    minResistencia = 5;
                    maxResistencia = 10;
                    moviment = 2.0;
                    break;
            }
            Double força = ThreadLocalRandom.current().nextDouble(minForça, maxForça + 1);
            Double resistencia = ThreadLocalRandom.current().nextDouble(minResistencia, maxResistencia + 1);

            unitats[i] = new Unitat(i,nom, força, resistencia, moviment);
            exercit.add(unitats[i]);
        }
        
        return exercit;
        
    }
    
    public static void mostrarExercit(ArrayList<Unitat> e){
        
        Iterator<Unitat> it = e.iterator();
        Unitat tmp;
        while(it.hasNext()){
            tmp = it.next();
            System.out.println(tmp.toString());
        }
    }
    
    public static void writeExercit(ArrayList<Unitat> e, File f){
    
            Exercit exercitComplet = new Exercit(1, e);
            StringBuffer buffer = null;
            Unitat tmp;
            Iterator<Unitat> it = e.iterator();
   
        try{
            RandomAccessFile randomExercit = new RandomAccessFile(f,"rw");

            
            randomExercit.writeInt(exercitComplet.getId());
            randomExercit.writeDouble(exercitComplet.getMoral());
            randomExercit.writeDouble(exercitComplet.getForça());
            randomExercit.writeDouble(exercitComplet.getResistencia());
            randomExercit.writeDouble(exercitComplet.getMoviment());

            
            while(it.hasNext()){
                tmp = it.next();
                
                randomExercit.writeInt(tmp.getId());
                
                buffer = new StringBuffer(tmp.getNom());
                buffer.setLength(20);
                randomExercit.writeChars(buffer.toString());
                
                randomExercit.writeDouble(tmp.getForça());
                randomExercit.writeDouble(tmp.getResistencia());
                randomExercit.writeDouble(tmp.getMoviment());

            }
            
        }catch(Exception a){
            
            System.out.println(a.getMessage());
        }
    
    }

    public static void readExercit(File file){
        try{
            //Primer agafo fitxer
            //Llegeixo int
            //He de guardar tots els valors fent for's dins de la nova Unitat buida.
            
            
           RandomAccessFile f = new RandomAccessFile(file,"r");
           ArrayList<Unitat> aux = new ArrayList<Unitat>();
            
            
           Exercit e = new Exercit();
           e.setId(f.readInt());
           e.setMoral(f.readDouble());
           e.setForça(f.readDouble());
           e.setResistencia(f.readDouble());
           e.setMoviment(f.readDouble());
           
            for (int i = 0; i < 500; i++) {
                Unitat unitatAux = new Unitat();

                unitatAux.setId(f.readInt());
                String cadenaAux="";
                for (int j = 0; j < 20; j++) {
                    cadenaAux+=f.readChar();
                }
                unitatAux.setNom(cadenaAux);
                
                unitatAux.setForça(f.readDouble());
                unitatAux.setResistencia(f.readDouble());
                unitatAux.setMoviment(f.readDouble());
                
                aux.add(unitatAux);

            }
            
            mostrarExercit(aux);
           
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

public static void iniciarBatalla(Exercit ex1, Exercit ex2){
    System.out.println("Iniciant batalla...");
    
    try {
        System.out.println("Exercit 1:");
        System.out.println("Força: " + ex1.getForça());
        System.out.println("Resistència: " + ex1.getResistencia());
        
        System.out.println("\nExercit 2:");
        System.out.println("Força: " + ex2.getForça());
        System.out.println("Resistència: " + ex2.getResistencia());
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}    
    
    
    
    public static void main(String[] args) {
        
        Exercit exercit1 = new Exercit(1, generarUnitats());
        Exercit exercit2 = new Exercit(2, generarUnitats());
        
        writeExercit(exercit1.getExercit(), fitxerExercit1);
        writeExercit(exercit2.getExercit(), fitxerExercit2);
        
        iniciarBatalla(exercit1, exercit2);
        
        
    }
}
