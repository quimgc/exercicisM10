/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author quim
 */
public class Comarca {
    //Aquí tamb necessito un array normal de comarques? (normal per accedir per codiComarca)
    private int codiComarca;
    private String nom;
    
    private int numMunicipis;
    private double superficie;
    private int habitants;    

    public Comarca(int codiComarca, String nom) {
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

    public void setCodiComarca(int codiComarca) {
        this.codiComarca = codiComarca;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumMunicipis(int numMunicipis) {
        this.numMunicipis = numMunicipis;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setHabitants(int habitants) {
        this.habitants = habitants;
    }
    
    

    @Override
    public String toString() {
        return "Comarca{" + "codiComarca=" + codiComarca + ", nom=" + nom + ", numMunicipis=" + numMunicipis + ", superficie=" + superficie + ", habitants=" + habitants + '}';
    }
    
}
