package ud5.ejercicios.E0804;

import java.util.Arrays;

public class Trompeta extends Instrumentos {
    @Override
    public void Interpretar() {
        System.out.println("Piano: " + Arrays.toString(melodia));
    }
}
