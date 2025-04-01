import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class E1205 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(10) + 1);
        }

        System.out.println("Colección con repeticiones: " + numeros);

        Set<Integer> numerosSinRepetir = new HashSet<>(numeros);
        List<Integer> listaSinRepetir = new ArrayList<>(numerosSinRepetir);

        System.out.println("Colección sin repeticiones: " + listaSinRepetir);
    }
}
