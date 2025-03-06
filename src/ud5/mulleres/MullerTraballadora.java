package ud5.mulleres;

abstract class MullerTraballadora {
    protected String nome;
    protected String apelidos;
    protected int anoNacemento;

    public MullerTraballadora(String nome, String apelidos, int anoNacemento) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.anoNacemento = anoNacemento;
    }

    public int getIdade(int anoActual) {
        return anoActual - anoNacemento;
    }

    public abstract String descricionContribucion();
}

interface IPioneira {
    String getDescubrimentoOuAporte();
}

interface IActivista {
    String getCausaDefendida();
}