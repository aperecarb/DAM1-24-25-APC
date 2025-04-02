package ud6.apuntes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class E1206 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1);
        }

        System.out.println("Colección inicial: " + numeros);

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 5) {
                iterator.remove();
            }
        }

        System.out.println("Colección sin el número 5: " + numeros);
    }
}
