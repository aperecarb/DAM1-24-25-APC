import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class E1206b {

    public static void main(String[] args) {
        List<Double> positivos = new ArrayList<>();
        List<Double> negativos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            double numero = random.nextDouble() * 200 - 100; // Números entre -100 y 100
            if (numero > 0) {
                positivos.add(numero);
            } else {
                negativos.add(numero);
            }
        }

        System.out.println("Colección de positivos: " + positivos);
        System.out.println("Colección de negativos: " + negativos);

        double sumaPositivos = 0;
        for (double num : positivos) {
            sumaPositivos += num;
        }
        System.out.println("Suma de positivos: " + sumaPositivos);

        double sumaNegativos = 0;
        for (double num : negativos) {
            sumaNegativos += num;
        }
        System.out.println("Suma de negativos: " + sumaNegativos);

        Iterator<Double> iteratorPositivos = positivos.iterator();
        while (iteratorPositivos.hasNext()) {
            double num = iteratorPositivos.next();
            if (num > 10) {
                iteratorPositivos.remove();
            }
        }

        Iterator<Double> iteratorNegativos = negativos.iterator();
        while (iteratorNegativos.hasNext()) {
            double num = iteratorNegativos.next();
            if (num < -10) {
                iteratorNegativos.remove();
            }
        }

        System.out.println("Colección de positivos filtrada: " + positivos);
        System.out.println("Colección de negativos filtrada: " + negativos);
    }
}
