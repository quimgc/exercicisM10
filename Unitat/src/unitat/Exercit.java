/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitat;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author quim
 */
public class Exercit {
    
    private int id;
    private ArrayList<Unitat> exercit;
    private Double moral;
    private Double força;
    private Double resistencia;
    private Double moviment;

    //moral sempre serà 100
    //força serà la suma de la força de totes les unitats.
    // resistencia (suma de la resistencia de les unitats).
    // moviment mitjana de moviment

    public Exercit(int id, ArrayList<Unitat> exercit) {
        
        this.exercit = exercit;
        calcularExercit();
        this.id = id;
        this.moral = 100.0;
    
    }
    
    public Exercit(){
        
    }
    
    
    
    public void calcularExercit(){
        
        Iterator<Unitat> it = this.exercit.iterator();
        Unitat tmp;
        
        força=0.0;
        resistencia=0.0;
        Double movimentAux=0.0;
        
        while(it.hasNext()){
            tmp = it.next();
            this.força += tmp.getForça();
            this.resistencia += tmp.getResistencia();
            movimentAux += tmp.getMoviment();
        }
        if(exercit.size()>0){
            this.moviment = movimentAux / exercit.size();
        } else {
            this.moviment = 0.0;
        }
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Unitat> getExercit() {
        return exercit;
    }

    public void setExercit(ArrayList<Unitat> exercit) {
        this.exercit = exercit;
    }

    public Double getMoral() {
        return moral;
    }

    public void setMoral(Double moral) {
        this.moral = moral;
    }

    public Double getForça() {
        return força;
    }

    public void setForça(Double força) {
        this.força = força;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }

    public Double getMoviment() {
        return moviment;
    }

    public void setMoviment(Double moviment) {
        this.moviment = moviment;
    }

    @Override
    public String toString() {
        return "Exercit{" + "id=" + id + ", exercit=" + exercit + ", moral=" + moral + ", for\u00e7a=" + força + ", resistencia=" + resistencia + ", moviment=" + moviment + '}';
    }


}
