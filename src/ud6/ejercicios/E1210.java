package ud6.ejercicios;

import java.util.*;

public class E1210 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(10) + 1);
        }

        System.out.println("Lista original: " + lista);

        // Set<Integer> sinRepetir = new HashSet<>(lista);
        Set<Integer> sinRepetir = new HashSet<>();
        sinRepetir.addAll(lista);
        System.out.println("Conjunto sin repeticiones: " + sinRepetir);

        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> unicos = new HashSet<>();
        for (Integer num : lista) {
            if (!unicos.add(num)) {
                repetidos.add(num);
            }
        }
        System.out.println("Conjunto de repetidos: " + repetidos);

        unicos.removeAll(repetidos);
        System.out.println("Conjunto de únicos: " + unicos);
    }
}
