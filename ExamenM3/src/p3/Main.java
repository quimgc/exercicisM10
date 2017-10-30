/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author quim
 */
public class Main {
        public static void main(String[] args) {
            Vehicle v = new Vehicle("roig", 4, "gasoil");
            Moto m = new Moto("verd", 2, "gasolina", "verd i roig");
            System.out.println(m.toString());
            System.out.println(v.toString());
        }
    
}
