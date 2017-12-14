/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3m6javiersancho;

/**
 *
 * @author quim
 */
public class M3m6JavierSancho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cadena1 = {"Mario", "Sonic", "Crash Bandicoot"};
        String[] cadena2 = new String[3];

        cadena2[0] = "Nintendo";
        cadena2[1] = "Sega";
        cadena2[2] = "Playstation";
        try {
            for (int i = 0; i <= cadena1.length; i++) {

                System.out.println(cadena1[i] + " és la mascota de " + cadena2[i]);

            }

            //if(i==cadena1.length){
            System.out.println("Final cadena");
            //}
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final cadena");
        }

        System.out.println("Final del programa");

    }

}
