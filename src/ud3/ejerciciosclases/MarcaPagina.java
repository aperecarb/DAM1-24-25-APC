package ud3.ejerciciosclases;

public class MarcaPagina {
    int pagina;

    public void incrementarPagina() {
        pagina++;
    }

    public int getPagina() {
        return this.pagina;
    }

    public void reiniciarLibro() {
        pagina = 0;
    }

    public void irAPagina(int pagina) {
        if (pagina >= 0) {
            this.pagina = pagina;
        }
    }

    public static void main(String[] args) {
        MarcaPagina mp = new MarcaPagina();

        System.out.println(mp.getPagina());
        mp.incrementarPagina();
        System.out.println(mp.getPagina());
        mp.reiniciarLibro();
        System.out.println(mp.getPagina());
    }
}
