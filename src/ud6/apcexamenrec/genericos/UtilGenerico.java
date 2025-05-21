/* Álvaro Pereira Carballo */

package ud6.apcexamenrec.genericos;

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

        // Metemos ambas colecciones en elementosUnicos para que se eliminen los elementos que coincidan
        elementosUnicos.addAll(coleccion1);
        elementosUnicos.addAll(coleccion2);

        return elementosUnicos.size();
    }

    // Creamos el método invertirOrden
    public static <K, V> Map<V, List<K>> invertirOrden(Map<K, V> mainMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.entry(K, V) entrada : ) {
            
        }

        return ;
    }

    // Creamos un pequeño programa principal para probar los métodos
    public static void main(String[] args) {
        // Método contarCoincidencias


        // Método invertirOrden

    }
}
