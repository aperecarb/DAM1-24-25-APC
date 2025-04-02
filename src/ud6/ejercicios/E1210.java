import java.util.*;

public class E1210 {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        // Generar 20 números aleatorios entre 1 y 10
        for (int i = 0; i < 20; i++) {
            lista.add(random.nextInt(10) + 1);
        }

        System.out.println("Lista original: " + lista);

        // Conjunto sin repeticiones
        Set<Integer> sinRepetir = new HashSet<>(lista);
        System.out.println("Conjunto sin repeticiones: " + sinRepetir);

        // Conjunto con elementos repetidos
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> unicos = new HashSet<>();
        for (Integer num : lista) {
            if (!unicos.add(num)) {
                repetidos.add(num);
            }
        }
        System.out.println("Conjunto de repetidos: " + repetidos);

        // Conjunto con elementos únicos
        unicos.removeAll(repetidos);
        System.out.println("Conjunto de únicos: " + unicos);
    }
}
