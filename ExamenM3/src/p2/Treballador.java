package p2;


public class Treballador implements mostrar {

    private long NIF;

    private String nom;

    private long telefon;

    private int codiPostal;

    private Treballador capEmpleat;

    private boolean isCap;

    public Treballador(long NIF, String nom, long tel, int cp) {
        this.NIF = NIF;
        this.nom = nom;
        this.telefon = tel;
        this.codiPostal = cp;
    }

    public Treballador(long NIF, String nom, long tel, int cp, Treballador cap) {
       this.NIF = NIF;
        this.nom = nom;
        this.telefon = tel;
        this.codiPostal = cp;   
        this.capEmpleat = cap;
    }

    Treballador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String mostrar() {
        return "NIF " + this.NIF + " nom "+ this.nom + " telefon " + this.telefon + "codiPostal" + this.codiPostal + "capEmpleat" + this.capEmpleat;
    }
}
