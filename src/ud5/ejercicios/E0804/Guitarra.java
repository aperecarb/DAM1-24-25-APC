package ud5.ejercicios.E0804;

import java.util.Arrays;

public class Guitarra extends Instrumentos {
    @Override
    public void Interpretar() {
        System.out.println("Guitarra: " + Arrays.toString(melodia));
    }
}
