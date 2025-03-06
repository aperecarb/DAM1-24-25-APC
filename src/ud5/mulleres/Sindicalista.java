package ud5.mulleres;

class Sindicalista extends MullerTraballadora implements IActivista {
    private String movementoDefendido;

    public Sindicalista(String nome, String apelidos, int anoNacemento, String movementoDefendido) {
        super(nome, apelidos, anoNacemento);
        this.movementoDefendido = movementoDefendido;
    }

    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha sindicalista que defendeu o movemento: " + movementoDefendido;
    }

    public String getCausaDefendida() {
        return movementoDefendido;
    }
}