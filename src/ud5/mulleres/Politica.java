package ud5.mulleres;

class Politica extends MullerTraballadora implements IActivista {
    private String causa;

    public Politica(String nome, String apelidos, int anoNacemento, String causa) {
        super(nome, apelidos, anoNacemento);
        this.causa = causa;
    }

    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha política e activista destacada por: " + causa;
    }

    public String getCausaDefendida() {
        return causa;
    }
}