package ud5.mulleres;

class Artista extends MullerTraballadora {
    private String estilo;

    public Artista(String nome, String apelidos, int anoNacemento, String estilo) {
        super(nome, apelidos, anoNacemento);
        this.estilo = estilo;
    }

    public String descricionContribucion() {
        return nome + " " + apelidos + " destacou na arte co estilo: " + estilo;
    }
}