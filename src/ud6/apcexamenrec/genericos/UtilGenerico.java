/* Álvaro Pereira Carballo */

package ud6.apcexamenrec.genericos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UtilGenerico {
    // Creamos el método contarCoincidencias
    public static <T> int contarCoincidencias(Collection<T> coleccion1, Collection<T> coleccion2) {
        Set<T> elementosUnicos = new HashSet<>();

        // Metemos ambas colecciones en elementosUnicos para que se eliminen los
        // elementos que coincidan
        elementosUnicos.addAll(coleccion1);
        elementosUnicos.addAll(coleccion2);

        return elementosUnicos.size();
    }

    // Creamos el método invertirOrden
    public static <K, V> Map<V, List<K>> invertirOrden(Map<K, V> mainMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        // La verdad es que no sé si podemos hacer así este método, a lo mejor me metí en documentaciones que no hemos dado
        for (Map.Entry<K, V> entrada : mainMap.entrySet()) {
            K claveOriginal = entrada.getKey();
            V valorOriginal = entrada.getValue();

            invertedMap.computeIfAbsent(valorOriginal, k -> new ArrayList<>()).add(claveOriginal);
        }

        return invertedMap;
    }

    // Creamos un pequeño programa principal para probar los métodos
    public static void main(String[] args) {
        // Método contarCoincidencias
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(4, 5, 6, 7, 8);

        int coincidencias = contarCoincidencias(lista1, lista2);

        System.out.println("Lista 1: " + lista1 + ", Lista 2: " + lista2);
        System.out.println("Elementos únicos: " + coincidencias);

        // Método invertirOrden
        Map<String, String> mapaEjemplo = new HashMap<>();

        mapaEjemplo.put("1", "a");
        mapaEjemplo.put("2", "b");
        mapaEjemplo.put("3", "a");

        Map<String, List<String>> mapaInvertidoEjemplo = invertirOrden(mapaEjemplo);

        System.out.println("Mapa original: " + mapaEjemplo);
        System.out.println("Mapa invertido: " + mapaInvertidoEjemplo);
    }
}
