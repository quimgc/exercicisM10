/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql2;

import java.util.Date;

/**
 *
 * @author quim
 */
public class Llibre {
    
    public int codi;
    public int isbn;
    public String titol;
    public Date anyPublicacio;
    public String editorial;
    public String llocPublicacio;
    
    public Llibre(){
        
    }

    public Llibre(int codi, int isbn, String titol, Date anyPublicacio, String editorial, String llocPublicacio) {
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

    public Date getAnyPublicacio() {
        return anyPublicacio;
    }

    public void setAnyPublicacio(Date anyPublicacio) {
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
    
    
 
    
           
          
}
