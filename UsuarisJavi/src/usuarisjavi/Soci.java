/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarisjavi;

/**
 *
 * @author quim
 */
public class Soci {
    
    private int codi;
    private String nom;

    public Soci(){
    
    }
    public Soci(int codi, String nom) {
        this.codi = codi;
        this.nom = nom;
    }

    
    
    public int getCodi() {
        return codi;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return  "codi: " + codi + " nom: " + nom;
    }
    
    
    
    
}
