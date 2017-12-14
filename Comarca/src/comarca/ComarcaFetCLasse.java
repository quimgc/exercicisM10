/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class ComarcaFetCLasse  {
    private int codiComarca;
    private String nom;
    
    private int numMunicipis;
    private double superficie;
    private int habitants;    

    public ComarcaFetCLasse(int codiComarca, String nom) {
        this.codiComarca = codiComarca;
        this.nom = nom;
    }

    public int getCodiComarca() {
        return codiComarca;
    }

    public String getNom() {
        return nom;
    }

    public int getNumMunicipis() {
        return numMunicipis;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getHabitants() {
        return habitants;
    }

    @Override
    public String toString() {
        return "ComarcaFetClasse{" + "codiComarca=" + codiComarca + ", nom=" + nom + ", numMunicipis=" + numMunicipis + ", superficie=" + superficie + ", habitants=" + habitants + '}';
    }
    
    
    
    
    
}
