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

    public Llibre(int codi, int isbn, String titol, Date anyPublicacio, String editorial, String llocPublicacio) {
        this.codi = codi;
        this.isbn = isbn;
        this.titol = titol;
        this.anyPublicacio = anyPublicacio;
        this.editorial = editorial;
        this.llocPublicacio = llocPublicacio;
    }
 
    
           
          
}
