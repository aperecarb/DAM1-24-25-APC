package ud6.apuntes;

import java.util.Arrays;
import ud5.apuntesherencia.Persona;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null) {
                cont++;
            }
        return cont;
    }

    public static <U> U[] add(U e, U[] t) {
        U[] t2 = Arrays.copyOf(t, t.length + 1);
        t2[t.length] = e;
        return t2;
    }

    public static <U> boolean buscar(U e, U[] t) {
        if (t == null) {
            return false;
        }
        for (U elem : t) {
            if (elem != null && elem.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null) {
            return Arrays.copyOf(t2, t2.length);
        }
        if (t2 == null) {
            return Arrays.copyOf(t1, t1.length);
        }

        U[] t3 = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, t3, t1.length, t2.length);
        return t3;
    }

    public static void main(String[] args) {
        Integer[] numeros = { 3, 5, 8, null, 2, null };
        Persona[] personas = { new Persona("Pepe"), null, new Persona("María") };

        System.out.println(numeroDeNulos(numeros));
        System.out.println(numeroDeNulos(personas));

        numeros = add(7, numeros);
        System.out.println(Arrays.toString(numeros));
        personas = add(new Persona("Juancho"), personas);
        System.out.println(Arrays.toString(personas));

        System.out.println("Hay un 8 en números? " + buscar(8, numeros));
        System.out.println("Hay un 6 en números? " + buscar(6, numeros));

        System.out.println("Está Pepe? " + buscar(new Persona("Pepe"), personas));

        Integer[] numeros2 = { 23, 45, 78, 23 };
        Integer[] masNumeros = concatenar(numeros, numeros2);
        System.out.println(Arrays.toString(masNumeros));
    }
}
