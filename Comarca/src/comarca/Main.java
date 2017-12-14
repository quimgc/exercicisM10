/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comarca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author quim
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("Comarques.txt"));
        Comarca[] comarques = new Comarca[0];

        while (in.hasNext()) {
            //llegim el numero
            int codiComarca = Integer.parseInt(in.nextLine());
            //llegim el nom de la següent linia
            String nom = in.nextLine();

            //creo una comarca amb el constructor de la classe. 
            Comarca c = new Comarca(codiComarca, nom);

            //miro si el codi és més petit que la longitud, si és aixi el guardo
            if (codiComarca < comarques.length) {
                comarques[codiComarca] = c;

                // sino faig una cp del vector amb la longitud codiComarca +1 
            } else {
                //amb això es fa una còpia del vector però amb un length diferent, en aquest cas el codiComarca +1 
                comarques = Arrays.copyOf(comarques, codiComarca + 1);
                comarques[codiComarca] = c;
            }

        }
       
        
        
        
        
//        for (ComarcaFetCLasse c : comarques) {
//            System.out.println(c);
//        }

        class ComparadorInvers implements Comparator<Comarca> {

            @Override
            public int compare(Comarca o1, Comarca o2) {
                if (o1 != null && o2 != null) {
                    String o1Invers = new StringBuilder(o1.getNom()).reverse().toString();
                    String o2Invers = new StringBuilder(o2.getNom()).reverse().toString();

                    //Això és perque a l'hora de comparar tingui en compte els accents, ç trencada, etc... L'idioma francès ja ho incorpora tot
                    Collator catalan = Collator.getInstance(Locale.FRENCH);
                    return catalan.compare(o1Invers, o2Invers);
                } else {
                    return 0;
                }

            }

        }
        
        Arrays.sort(comarques, new ComparadorInvers());
        
            for (Comarca c : comarques){
                System.out.println(c);
            }
            
            
            
        //Municipis
        
        //List municipis = new ArrayList();
        
        Scanner mun = new Scanner(new FileReader("Municipis.txt"));
        Pais p = new Pais();
        
        while (mun.hasNext()) {
            //llegim el numero
            int codiComarca = Integer.parseInt(mun.nextLine());
            int codiMunicipi = Integer.parseInt(mun.nextLine());
            //llegim el nom de la següent linia
            String nom = mun.nextLine();
            int numHab = Integer.parseInt(mun.nextLine());
            double superficie = Double.parseDouble(mun.nextLine());
        
            Municipi m = new Municipi(codiComarca, codiMunicipi, nom, numHab, superficie);
            
            //actualitzo la poblacio i superficie del pais
            p.afegirMunicipi(m);
            
            //municipis.add(m);
        }            
            
            
            
    }
}
