package ud6.ejercicios;

import ud6.apuntes.Cola;
import ud6.apuntes.Pila;

public class ContenedorLista<T extends Comparable<T>> implements Pila<T>, Cola<T> {
    private T[] elementos;
    private int size;

    public ContenedorLista() {
        elementos = (T[]) new Comparable[0];
        size = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[size + 1];
        nuevaTabla[0] = nuevo;
        for (int i = 0; i < size; i++) {
            nuevaTabla[i + 1] = elementos[i];
        }
        elementos = nuevaTabla;
        size++;
    }

    public void insertarAlFinal(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[size + 1];
        nuevaTabla[0] = nuevo;
        for (int i = 0; i < size; i++) {
            nuevaTabla[i] = elementos[i];
        }
        nuevaTabla[size] = nuevo;
        elementos = nuevaTabla;
        size++;
    }

    T extraerDelPrincipio() {
        if (size == 0) {
            return null;
        }
        T extraido = elementos[0];
        T[] nuevaTabla = (T[]) new Comparable[size - 1];
        for (int i = 1; i < size; i++) {
            nuevaTabla[i - 1] = elementos[i];
        }
        elementos = nuevaTabla;
        size--;
        return extraido;
    }

    T extraerDelFinal() {
        if (size == 0) {
            return null;
        }
        T extraido = elementos[size - 1];
        T[] nuevaTabla = (T[]) new Comparable[size - 1];
        for (int i = 0; i < size - 1; i++) {
            nuevaTabla[i] = elementos[i];
        }
        elementos = nuevaTabla;
        size--;
        return extraido;
    }

    public void ordenar() {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (elementos[j].compareTo(elementos[j + 1]) > 0) {
                        T temp = elementos[j];
                        elementos[j] = elementos[j + 1];
                        elementos[j + 1] = temp;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elementos[i]).append(", ");
        }
        sb.append(elementos[size - 1]).append("]");
        return sb.toString();
    }

    public interface Pila<T> {
        void apilar(T elemento);

        T desapilar();
    }

    public interface Cola<T> {
        void encolar(T elemento);

        T desencolar();
    }

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
