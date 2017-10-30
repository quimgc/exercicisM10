package p2;

public class Empresa implements mostrar {

    private long CIF;

    private String raoSocial;

    private long telefon;

    private int codiPostal;

    public Empresa() {
    }

    public Empresa(long CIF, String raoSocial, long tel, int cp) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String mostrar() {
       return "CIF" + this.CIF + " raoSocial " + this.raoSocial + " telefon " + this.telefon + " codiPostal "+ this.codiPostal;
    }
}
