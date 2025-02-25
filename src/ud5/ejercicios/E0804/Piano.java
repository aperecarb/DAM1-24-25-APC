package ud5.ejercicios.E0804;

import java.util.Arrays;

public class Piano extends Instrumentos {
    @Override
    public void Interpretar() {
        System.out.println("Piano: " + Arrays.toString(melodia));
    }
}
