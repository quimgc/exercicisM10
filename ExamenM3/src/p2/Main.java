package p2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author quim
 */
public class Main {
        public static void main(String[] args) {
            Empresa e = new Empresa(4785651, "RaoSocial", 977458574, 47854);
            System.out.println(e.mostrar());
            
            Treballador t = new Treballador();
            Director d = new Director(784521, "Quim", 74854, 74874);
            
        }
}
