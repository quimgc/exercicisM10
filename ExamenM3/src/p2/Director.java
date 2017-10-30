package p2;



public class Director extends Treballador implements mostrar {

    private boolean isDirector;

    private Treballador Director;

    public Director(long NIF, String nom, long tel, int cp) {
        super(NIF, nom, tel, cp);
    }

    
  
    public Treballador assignarDirector(Treballador t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
