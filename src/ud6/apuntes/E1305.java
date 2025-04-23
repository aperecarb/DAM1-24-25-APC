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
        List<Integer> numerosL = new ArrayList<>();
        int rnd;
        for (int i = 0; i < 10; i++) {
            rnd = (int) (Math.random() * 100 + 1);
            numerosL.add(rnd);
        }
        System.out.println(numerosL);
        List<Double> raicesCuadradas = transformar(numerosL, x -> Math.sqrt(x));
        System.out.println(raicesCuadradas);
    }
}