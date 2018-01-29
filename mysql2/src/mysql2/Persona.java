/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql2;

/**
 *
 * @author quim
 */
public class Persona {

    public int dni;
    public String nom;
    public String cognom;
    public String adreca;
    public int telefon;
    public String poblacio;
    public int codiPostal;

    public Persona(int dni, String nom, String cognom, String adreca, int telefon, String poblacio, int codiPostal) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
        this.telefon = telefon;
        this.poblacio = poblacio;
        this.codiPostal = codiPostal;
    }

    
    
}
