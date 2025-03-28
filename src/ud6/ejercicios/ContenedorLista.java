package ud6.ejercicios;

import java.util.Comparator;

public class ContenedorLista<T extends Comparable<T>> implements Pila<T>, Cola<T> {
    private T[] es;
    private int size;

    public ContenedorLista() {
        es = (T[]) new Comparable[0];
        size = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[size + 1];
        nuevaTabla[0] = nuevo;
        for (int i = 0; i < size; i++) {
            nuevaTabla[i + 1] = es[i];
        }
        es = nuevaTabla;
        size++;
    }

    public void insertarAlFinal(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[size + 1];
        for (int i = 0; i < size; i++) {
            nuevaTabla[i] = es[i];
        }
        nuevaTabla[size] = nuevo;
        es = nuevaTabla;
        size++;
    }

    public T extraerDelPrincipio() {
        if (size == 0) {
            return null;
        }
        T extraido = es[0];
        T[] nuevaTabla = (T[]) new Comparable[size - 1];
        for (int i = 1; i < size; i++) {
            nuevaTabla[i - 1] = es[i];
        }
        es = nuevaTabla;
        size--;
        return extraido;
    }

    public T extraerDelFinal() {
        if (size == 0) {
            return null;
        }
        T extraido = es[size - 1];
        T[] nuevaTabla = (T[]) new Comparable[size - 1];
        for (int i = 0; i < size - 1; i++) {
            nuevaTabla[i] = es[i];
        }
        es = nuevaTabla;
        size--;
        return extraido;
    }

    public void ordenar() {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (es[j].compareTo(es[j + 1]) > 0) {
                        T temp = es[j];
                        es[j] = es[j + 1];
                        es[j + 1] = temp;
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
            sb.append(es[i]).append(", ");
        }
        sb.append(es[size - 1]).append("]");
        return sb.toString();
    }

    @Override
    public void apilar(T e) {
        insertarAlPrincipio(e);
    }

    @Override
    public T desapilar() {
        return extraerDelPrincipio();
    }

    @Override
    public void encolar(T e) {
        insertarAlFinal(e);
    }

    @Override
    public T desencolar() {
        return extraerDelPrincipio();
    }

    T get (int indice) {
        return es[indice];
    }

    void ordenar (Comparator<T> c) {
        if (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    if (c.compare(es[j], es[j + 1]) > 0) {
                        T temp = es[j];
                        es[j] = es[j + 1];
                        es[j + 1] = temp;
                    }
                }
            }
        }
    }
}