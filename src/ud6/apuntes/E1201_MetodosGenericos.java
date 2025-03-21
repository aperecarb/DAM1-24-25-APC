package ud6.apuntes;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    public static <U> U[] add(U e, U[] t) {
        U[] newArr = Arrays.copyOf(t, t.length + 1);
        newArr[t.length] = e;
        return newArr;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (U element : t) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        U[] newArr = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, newArr, t1.length, t2.length);
        return newArr;
    }
}
