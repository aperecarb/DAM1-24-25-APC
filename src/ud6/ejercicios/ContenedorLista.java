package ud6.ejercicios;

public class ContenedorLista<T extends Comparable<T>> {
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

    }

    T extraerDelPrincipio() {

    }

    T extraerDelFinal() {

    }

    public void ordenar() {

    }
}
