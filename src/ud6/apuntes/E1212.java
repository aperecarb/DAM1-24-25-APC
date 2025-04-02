package ud6.apuntes;

import java.util.Set;
import java.util.TreeSet;

public class E1212 {
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new TreeSet<>(conjunto1);
        union.addAll(conjunto2);
        return union;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> interseccion = new TreeSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        return interseccion;
    }

    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> except = new TreeSet<>(conjunto2);
        except.removeAll(conjunto1);
        return except;
    }
}