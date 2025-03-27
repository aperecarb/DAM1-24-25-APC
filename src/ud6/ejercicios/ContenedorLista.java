package ud6.ejercicios;

public class ContenedorLista<T extends Comparable<T>> implements Pila<T>, Cola<T> {
    private T[] elementos;
    private int tamanio;

    public ContenedorLista() {
        elementos = (T[]) new Comparable[0];
        tamanio = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[tamanio + 1];
        nuevaTabla[0] = nuevo;
        for (int i = 0; i < tamanio; i++) {
            nuevaTabla[i + 1] = elementos[i];
        }
        elementos = nuevaTabla;
        tamanio++;
    }

    public void insertarAlFinal(T nuevo) {
        T[] nuevaTabla = (T[]) new Comparable[tamanio + 1];
        for (int i = 0; i < tamanio; i++) {
            nuevaTabla[i] = elementos[i];
        }
        nuevaTabla[tamanio] = nuevo;
        elementos = nuevaTabla;
        tamanio++;
    }

    public T extraerDelPrincipio() {
        if (tamanio == 0) {
            return null;
        }
        T elementoExtraido = elementos[0];
        T[] nuevaTabla = (T[]) new Comparable[tamanio - 1];
        for (int i = 1; i < tamanio; i++) {
            nuevaTabla[i - 1] = elementos[i];
        }
        elementos = nuevaTabla;
        tamanio--;
        return elementoExtraido;
    }

    public T extraerDelFinal() {
        if (tamanio == 0) {
            return null;
        }
        T elementoExtraido = elementos[tamanio - 1];
        T[] nuevaTabla = (T[]) new Comparable[tamanio - 1];
        for (int i = 0; i < tamanio - 1; i++) {
            nuevaTabla[i] = elementos[i];
        }
        elementos = nuevaTabla;
        tamanio--;
        return elementoExtraido;
    }

    public void ordenar() {
        if (tamanio > 1) {
            for (int i = 0; i < tamanio - 1; i++) {
                for (int j = 0; j < tamanio - i - 1; j++) {
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
        if (tamanio == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tamanio - 1; i++) {
            sb.append(elementos[i]).append(", ");
        }
        sb.append(elementos[tamanio - 1]).append("]");
        return sb.toString();
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