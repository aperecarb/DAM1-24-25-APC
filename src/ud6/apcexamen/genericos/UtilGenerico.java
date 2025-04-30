/* Álvaro Pereira Carballo */
package ud6.apcexamen.genericos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class UtilGenerico {
    // Creamos el método repetidos
    public static <T> List<T> repetidos(List<T> lista) {
        // Creamos las listas
        List<T> unicos = new ArrayList<>();
        List<T> repetidos = new ArrayList<>();

        for (T elemento : lista) {
            if (unicos.contains(elemento)) {
                if (!repetidos.contains(elemento)) {
                    repetidos.add(elemento);
                }
            } else {
                unicos.add(elemento);
            }
        }
        return repetidos;
    }

    // Creamos el método genérico filtrarMayores
    public static <T> List<T> filtrarMayores(List<T> lista, T elemento, Comparator<? super T> comparador) {
        List<T> resultado = new ArrayList<>();
        for (T item : lista) {
            if (comparador.compare(item, elemento) >= 0) {
                resultado.add(item);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo repetidos
        List<String> consumiciones = List.of("Tosta", "Vino", "Refresco", "Tosta", "Tortilla", "Refresco", "Vino");
        List<String> consuRepetidas = UtilGenerico.repetidos(consumiciones);
        System.out.println("Elementos repetidos: " + consuRepetidas);

        // Ejemplo filtrarMayores
        List<Integer> edades = List.of(5, 15, 30, 18, 25, 54, 3, 17, 15, 55, 82);
        Integer mayoriaEdad = 18;
        List<Integer> mayoresEdad = UtilGenerico.filtrarMayores(edades, mayoriaEdad, Integer::compareTo);
        System.out.println("Mayores de edad: " + mayoresEdad);
    }
}