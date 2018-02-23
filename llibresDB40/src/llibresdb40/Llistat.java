package llibresdb40;

import java.util.*;
import com.db4o.*;

/**
 *
 * @author DAM
 */
public class Llistat<T> implements Iterable<T>{
 
    private ArrayList<T> llista= new ArrayList<T>();

 
 
    public Llistat(List<T> l) 
    {
        llista.addAll(l);
    }

    public void mostrar()
    {
         Iterator<T> it = llista.iterator();
                int i = 0;
                while (it.hasNext()) {
                    System.out.println(it.next());
                    i++;
                }

    }
    
    public boolean comprovarCodi(int codi){
        
         Iterator<T> it = llista.iterator();
         Llibre l;
                int i = 0;
                while (it.hasNext()) {
                  l = (Llibre) it.next();
                  if(l.getCodi() == codi){
                      return false;
                  }
                   
                    i++;
                }
                
        return true;

    }
 
    @Override
    public Iterator<T> iterator() {
        return llista.iterator();
    }
 
}