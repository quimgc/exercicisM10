/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitat;

/**
 *
 * @author quim
 */
public class Unitat {

    private int id;
    private String nom;
    private Double força;
    private Double resistencia;
    private Double moviment;

    public Unitat(){
        
    }
    public Unitat(int id, String nom, Double força, Double resistencia, Double moviment) {
        this.id = id;
        this.nom = nom;
        this.força = força;
        this.resistencia = resistencia;
        this.moviment = moviment;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
        return "Unitat{" + "id=" + id + ", nom=" + nom + ", for\u00e7a=" + força + ", resistencia=" + resistencia + ", moviment=" + moviment + '}';
    }
    
    
    
    
}
