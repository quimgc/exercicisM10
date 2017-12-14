
package comarca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pais {

    private List<Municipi> municipis = new ArrayList();
    private Comarca[] comarques = new Comarca[0];
    
    private int poblacioTotal=0;
    private double superficieTotal=0;

    public List<Municipi> getMunicipis() {
        return municipis;
    }

    public void afegirMunicipi(Municipi m) {
        municipis.add(m);
        this.poblacioTotal+=(m.getNumHabitants());
        this.superficieTotal+=(m.getSuperficieKm());
        
    }

    public Comarca[] getComarques() {
        return comarques;
    }

    public void afegirComarca(Comarca c) {
        if(c.getCodiComarca() < this.comarques.length){
            this.comarques[c.getCodiComarca()] = c;
        } else {
               comarques = Arrays.copyOf(comarques, c.getCodiComarca() + 1);
                comarques[c.getCodiComarca()] = c;
            }
    }

    public int getPoblacioTotal() {
        return poblacioTotal;
    }


    public double getSuperficieTotal() {
        return superficieTotal;
    }

    
    

    @Override
    public String toString() {
        return "Pais{poblacioTotal=" + poblacioTotal + ", superficieTotal=" + superficieTotal + '}';
    }
    
    
    
}
