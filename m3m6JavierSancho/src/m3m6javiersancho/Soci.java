/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

import java.util.Date;

/**
 *
 * @author quim
 */
public class Soci {
    
    private int numSoci;
    private String nom;
    private String cognom1;
    private String cognom2;
    private long dni;
    private String direccio;
    private long telefon;
    private boolean isSancionat;
    private Date dataSancio;

        public int getNumSoci() {
        return numSoci;
    }

    public void setNumSoci(int numSoci) {
        this.numSoci = numSoci;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public long getTelefon() {
        return telefon;
    }

    public void setTelefon(long telefon) {
        this.telefon = telefon;
    }

    public boolean isIsSancionat() {
        return isSancionat;
    }

    public void setIsSancionat(boolean isSancionat) {
        this.isSancionat = isSancionat;
    }

    public Date getDataSancio() {
        return dataSancio;
    }

    public void setDataSancio(Date dataSancio) {
        this.dataSancio = dataSancio;
    }
    
    public Soci(int numSoci){
        this.setNumSoci(numSoci);
    }
    
    
    public Soci(int numSoci, String nom, String cog, String cog2, long dni, String direccio, long telf, boolean sancionat, Date dataSancio){
    
        this.setNumSoci(numSoci);
        this.setNom(nom);
        this.setCognom1(cog);
        this.setCognom2(cog2);
        this.setDni(dni);
        this.setDireccio(direccio);
        this.setTelefon(telf);
        this.setIsSancionat(sancionat);
        this.setDataSancio(dataSancio);
        
        

    }
    
    public void setDades(String nom, String cog, String cog2, long dni, String direccio, long telf, boolean sancionat, Date dataSancio){
        
        this.setNom(nom);
        this.setCognom1(cog);
        this.setCognom2(cog2);
        this.setDni(dni);
        this.setDireccio(direccio);
        this.setTelefon(telf);
        this.setIsSancionat(sancionat);
        this.setDataSancio(dataSancio);
        
    }
    
    public boolean isSancionat(){
       return this.isSancionat;
    }
    
    public void Sancionar(Date dataSancio){
        this.setDataSancio(dataSancio);
    }
    
    
    
}
