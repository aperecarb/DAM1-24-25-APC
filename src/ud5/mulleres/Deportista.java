package ud5.mulleres;

class Deportista extends MullerTraballadora implements IPioneira {
    private String fitoHistorico;

    public Deportista(String nome, String apelidos, int anoNacemento, String fitoHistorico) {
        super(nome, apelidos, anoNacemento);
        this.fitoHistorico = fitoHistorico;
    }

    public String descricionContribucion() {
        return nome + " " + apelidos + " foi unha deportista pioneira co fito histórico de: " + fitoHistorico;
    }

    public String getDescubrimentoOuAporte() {
        return fitoHistorico;
    }
}