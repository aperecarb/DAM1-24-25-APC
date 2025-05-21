package ud6.repasoexamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*. (1) Método genérico repetidos() que reciba una lista de elementos y devuelva
una copia de la lista original pero eliminando los elementos que aparecen sólo una
vez.
 */

public class chuiletasGenericos<T> {

    static <T> List<T> repetidos(List<T> t) {
        List<T> sinRep = new ArrayList<>();
        for (T t3 : t) {
            int contador = 0;
            for (T t5 : t) {
                if (t5.equals(t3)) {
                    contador++;
                }
            }
            if (contador > 1) {
                sinRep.add(t3);
            }

        }

        return sinRep;

    }

    /*
     * (2) Método genérico filtrarMayores() que recibe como parámetros de entrada
     * unha colección de elementos de un tipo T, un elemento del mismo tipo y un
     * comparator y devuelve una subcolección con los elementos de la colección
     * original
     * que sean mayores o iguales que el recibido según el criterio del comparator
     */

    static <T> Collection<T> filtrarMayores(Collection<T> colecion1, T cosa, Comparator<T> comparator) {
        Collection<T> devolver = new ArrayList<>();
        for (T t : colecion1) {
            if (comparator.compare(t, cosa) >= 0) {
                devolver.add(t);
            }

        }
        return devolver;

    }

    public static void main(String[] args) {
        Integer[] t = { 1, 3, 3, 3, 4, 5, 5, 3, 6 };
        System.out.println(repetidos(Arrays.asList(t)));

        Comparator<Integer> comp = Comparator.naturalOrder();
        System.out.println(filtrarMayores(Arrays.asList(t), 4, comp));
    }
}