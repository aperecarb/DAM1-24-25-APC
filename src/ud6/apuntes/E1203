// Interfaz Pila
public interface Pila<T> {
    void apilar(T elemento);
    T desapilar();
}

// Interfaz Cola
public interface Cola<T> {
    void encolar(T elemento);
    T desencolar();
}

// ContenedorLista implementando Pila y Cola
public class ContenedorLista<T extends Comparable<T>> implements Pila<T>, Cola<T> {
    // ... (Código de E1202) ...

    @Override
    public void apilar(T elemento) {
        insertarAlPrincipio(elemento);
    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }

    @Override
    public void encolar(T elemento) {
        insertarAlFinal(elemento);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }
}

// Programa de prueba para Pila
import java.util.Scanner;

public class PruebaPila {
    public static void main(String[] args) {
        ContenedorLista<Integer> pila = new ContenedorLista<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros positivos (-1 para terminar):");
        while ((numero = scanner.nextInt()) != -1) {
            pila.apilar(numero);
        }

        System.out.println("\nNúmeros desapilados:");
        while (pila.desapilar() != null) {
            System.out.println(pila.desapilar());
        }
    }
}

// Programa de prueba para Cola
import java.util.Scanner;

public class PruebaCola {
    public static void main(String[] args) {
        ContenedorLista<Integer> cola = new ContenedorLista<>();
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros positivos (-1 para terminar):");
        while ((numero = scanner.nextInt()) != -1) {
            cola.encolar(numero);
        }

        System.out.println("\nNúmeros desencolados:");
        while (cola.desencolar() != null) {
            System.out.println(cola.desencolar());
        }
    }
}
