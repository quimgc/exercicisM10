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
public class Llibre {
    
    private int numLlibre;
    private String titol;
    private String autor;
    private int pagines;
    private String tematica;
    private String isbn;
    private String editorial;
    private boolean isPrestat;
    private Date dataDevolucio;
    private int estatLlibre=10;
    private boolean isArreglar;

    
    
    public Llibre(int numLlibre, String titol, String autor, int pagines, String tematica, String isbn, String editorial){
        
        this.setNumLlibre(numLlibre);
        this.setTitol(titol);
        this.setAutor(autor);
        this.setPagines(pagines);
        this.setTematica(tematica);
        this.setIsbn(isbn);
        this.setEditorial(editorial);
        this.setIsPrestat(false);
        this.setDataDevolucio(null);
        this.setEstatLlibre(10);
    }
    
    public boolean estatPrestat(){
        return this.isPrestat;
    }
    public void canviaDataDevolucio(Date d){
        this.setDataDevolucio(d);
    }
    
    public void millorEstat(int num){
        
        if(this.getEstatLlibre()<5){
            this.setEstatLlibre(this.getEstatLlibre()+1);
        }
    }
    
    public void pitjorEstat(){
        
        if(this.getEstatLlibre()<=5){
            this.setEstatLlibre(this.getEstatLlibre()-1);
            this.setIsArreglar(true);
        }
    }
    
    
    
    
    
    
    
    public void setNumLlibre(int numLlibre) {
        this.numLlibre = numLlibre;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPagines(int pagines) {
        this.pagines = pagines;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIsPrestat(boolean isPrestat) {
        this.isPrestat = isPrestat;
    }

    public void setDataDevolucio(Date dataDevolucio) {
        this.dataDevolucio = dataDevolucio;
    }

    public void setEstatLlibre(int estatLlibre) {
        if(estatLlibre>=1 && estatLlibre<=10){
            this.estatLlibre = estatLlibre;
        } else {
            System.out.println("Estat no correcte.");
        }
    }

    public void setIsArreglar(boolean isArreglar) {
        this.isArreglar = isArreglar;
    }

    public int getNumLlibre() {
        return numLlibre;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public int getPagines() {
        return pagines;
    }

    public String getTematica() {
        return tematica;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean isIsPrestat() {
        return isPrestat;
    }

    public Date getDataDevolucio() {
        return dataDevolucio;
    }

    public int getEstatLlibre() {
        return estatLlibre;
    }

    public boolean isIsArreglar() {
        return isArreglar;
    }
    
    
    
    
}
