/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

/**
 *
 * @author quim
 */
public class Municipi {
    //Necessito un arrayList per emmagatzemar municipis?
    
    private String nom;
    private int codiComarca;
    private int codiMunicipi;
    private int numHabitants;
    private double superficieKm;
    
    public Municipi(int codiComarca, int codiMunicipi, String nom, int numHabitants, double superficie){
        this.codiComarca = codiComarca;
        this.codiMunicipi = codiMunicipi;
        this.nom = nom;
        this.numHabitants = numHabitants;
        this.superficieKm = superficie;
        
    }

    public String getNom() {
        return nom;
    }

    public int getCodiComarca() {
        return codiComarca;
    }

    public int getCodiMunicipi() {
        return codiMunicipi;
    }

    public int getNumHabitants() {
        return numHabitants;
    }

    public double getSuperficieKm() {
        return superficieKm;
    }
    

    @Override
    public String toString() {
        return "Municipi{" + "nom=" + nom + ", codiComarca=" + codiComarca + ", codiMunicipi=" + codiMunicipi + ", numHabitants=" + numHabitants + ", superficieKm=" + superficieKm + '}';
    }
    
    
    
    
}
