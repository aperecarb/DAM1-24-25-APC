package ud6.apuntes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class E1305 {
    public static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V> resultado = new ArrayList<>();
        for (T elemento : t) {
            resultado.add(f.apply(elemento));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Double> numeros = List.of(1.0, 4.0, 9.0, 16.0);

        List<Double> raicesCuadradas = transformar(numeros, Math::sqrt);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista de raíces cuadradas: " + raicesCuadradas);
    }
}
