/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llibresdb40;

/**
 *
 * @author quim
 */
public class Exemplar {
    
    private int codiLlibre;
    private int n_exemplar;
    private int n_edicio;
    private int codiLocalitzacio;
    private String tipusPrestec;

    public Exemplar(int codiLlibre, int n_exemplar, int n_edicio, int codiLocalitzacio, String tipusPrestec) {
        this.codiLlibre = codiLlibre;
        this.n_exemplar = n_exemplar;
        this.n_edicio = n_edicio;
        this.codiLocalitzacio = codiLocalitzacio;
        this.tipusPrestec = tipusPrestec;
    }

    public int getCodiLlibre() {
        return codiLlibre;
    }

    public void setCodiLlibre(int codiLlibre) {
        this.codiLlibre = codiLlibre;
    }

    public int getN_exemplar() {
        return n_exemplar;
    }

    public void setN_exemplar(int n_exemplar) {
        this.n_exemplar = n_exemplar;
    }

    public int getN_edicio() {
        return n_edicio;
    }

    public void setN_edicio(int n_edicio) {
        this.n_edicio = n_edicio;
    }

    public int getCodiLocalitzacio() {
        return codiLocalitzacio;
    }

    public void setCodiLocalitzacio(int codiLocalitzacio) {
        this.codiLocalitzacio = codiLocalitzacio;
    }

    public String getTipusPrestec() {
        return tipusPrestec;
    }

    public void setTipusPrestec(String tipusPrestec) {
        this.tipusPrestec = tipusPrestec;
    }

    @Override
    public String toString() {
        
        return "Codi llibre: " + this.codiLlibre + " Numero exemplar: " + this.n_exemplar + " Numero edicio: " + this.n_edicio + " Codi Localització: " + this.codiLocalitzacio + " Tipus Prestec: " + this.tipusPrestec;
    
    }
    
    
    
    
   
    
}
