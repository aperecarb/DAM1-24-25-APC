package ud5.ejercicios.E0804;

import java.util.Arrays;

public abstract class Instrumentos {
    enum Nota {Do, Re, Mi, Fa, Sol, La, Si}
    Nota[] melodia;

    public Instrumentos() {
        this.melodia = new Nota[0];
    }

    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    public void copiarMelodia(Instrumentos instrumentos) {
        melodia = Arrays.copyOf(instrumentos.melodia, instrumentos.melodia.length);
    }

    public abstract void Interpretar();

    public static void main(String[] args) {
        Instrumentos piano = new Piano();
        piano.add(Nota.Do);
        piano.add(Nota.Re);
        piano.add(Nota.Mi);
        piano.Interpretar();
        
        Instrumentos guitarra = new Guitarra();
        guitarra.add(Nota.Fa);
        guitarra.add(Nota.Sol);
        guitarra.add(Nota.La);
        guitarra.Interpretar();

        Instrumentos trompeta = new Trompeta();
        trompeta.copiarMelodia(piano);
        trompeta.Interpretar();

        Instrumentos[] orquesta = {piano, guitarra, trompeta};
        for (Instrumentos instrumentos : orquesta) {
            instrumentos.Interpretar();
        }
    }
}
