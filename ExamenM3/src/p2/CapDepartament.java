package p2;



public class CapDepartament extends Treballador {

    private Treballador cap;

    public CapDepartament(long NIF, String nom, long tel, int cp) {
        super(NIF, nom, tel, cp);
    }

    public Treballador assignarCapDepartament(Treballador t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
