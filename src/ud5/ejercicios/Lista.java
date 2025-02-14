package ud5.ejercicios;

public class Lista {
    private int[] numeros;
    private int tamaño;

    public Lista() {
        this.numeros = new int[0];
        this.tamaño = 0;
    }

    public int obtenerNumeroElementos() {
        return tamaño;
    }

    private void redimensionar(int nuevoTamaño) {
        int[] nuevoArray = new int[nuevoTamaño];
        for (int i = 0; i < Math.min(tamaño, nuevoTamaño); i++) {
            nuevoArray[i] = numeros[i];
        }
        numeros = nuevoArray;
        tamaño = nuevoTamaño;
    }

    public void insertarAlFinal(int numero) {
        redimensionar(tamaño + 1);
        numeros[tamaño - 1] = numero;
    }

    public void insertarAlPrincipio(int numero) {
        redimensionar(tamaño + 1);
        for (int i = tamaño - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = numero;
    }

    public void insertarEnIndice(int indice, int numero) {
        if (indice < 0 || indice > tamaño) {
            System.out.println("Índice fuera de rango");
            return;
        }
        redimensionar(tamaño + 1);
        for (int i = tamaño - 1; i > indice; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[indice] = numero;
    }

    public Integer obtenerPorIndice(int indice) {
        if (indice >= 0 && indice < tamaño) {
            return numeros[indice];
        }
        return null;
    }

    public void eliminarPorIndice(int indice) {
        if (indice < 0 || indice >= tamaño) {
            System.out.println("Índice fuera de rango");
            return;
        }
        for (int i = indice; i < tamaño - 1; i++) {
            numeros[i] = numeros[i + 1];
        }
        redimensionar(tamaño - 1);
    }

    public void borrarElemento(int indice) {
        eliminarPorIndice(indice);
    }

    public int buscarNumero(int numero) {
        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarLista() {
        System.out.print("[");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(numeros[i]);
            if (i < tamaño - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarAlFinal(5);
        lista.insertarAlFinal(10);
        lista.insertarAlPrincipio(3);
        lista.insertarEnIndice(1, 7);
        lista.mostrarLista();

        System.out.println("Número de elementos: " + lista.obtenerNumeroElementos());
        System.out.println("Elemento en índice 2: " + lista.obtenerPorIndice(2));
        lista.eliminarPorIndice(1);
        lista.mostrarLista();

        int indice = lista.buscarNumero(10);
        System.out.println("Índice del número 10: " + indice);
    }
}
