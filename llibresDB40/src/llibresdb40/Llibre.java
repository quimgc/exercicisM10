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
public class Llibre {
    
    private int codi;
    private int isbn;
    private String titol;
    private int anyPublicacio;
    private String editorial;
    private String llocPublicacio;

    public Llibre(int codi, int isbn, String titol, int anyPublicacio, String editorial, String llocPublicacio) {
        this.codi = codi;
        this.isbn = isbn;
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
        this.editorial = editorial;
        this.llocPublicacio = llocPublicacio;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getAnyPublicacio() {
        return anyPublicacio;
    }

    public void setAnyPublicacio(int anyPublicacio) {
        this.anyPublicacio = anyPublicacio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLlocPublicacio() {
        return llocPublicacio;
    }

    public void setLlocPublicacio(String llocPublicacio) {
        this.llocPublicacio = llocPublicacio;
    }


    @Override
    public String toString() {
        
        return "Codi: " + this.codi + " ISBN: " + this.isbn + " Titol: " + this.titol + " Any publicació: " + this.anyPublicacio + " Editorial: " + this.editorial + " Lloc Publicació: " + this.llocPublicacio;
        
    }
    
}
