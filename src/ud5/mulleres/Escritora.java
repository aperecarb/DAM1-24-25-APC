package ud5.mulleres;

class Escritora extends MullerTraballadora implements IPioneira {
    private String obraMestra;

    public Escritora(String nome, String apelidos, int anoNacemento, String obraMestra) {
        super(nome, apelidos, anoNacemento);
        this.obraMestra = obraMestra;
    }

    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha escritora pioneira coa obra mestra: " + obraMestra;
    }

    public String getDescubrimentoOuAporte() {
        return obraMestra;
    }
}