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
public class Autor {
    
   public int codi;
   public String nom;
   public String nacionalitat;

    public Autor(int codi, String nom, String nacionalitat) {
        this.codi = codi;
        this.nom = nom;
        this.nacionalitat = nacionalitat;
    }
   
   
    
}
