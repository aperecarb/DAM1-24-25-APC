public class Lista {
    private int[] numeros;
    private int tamaño;

    // 1. Constructor que inicializa la tabla con tamaño 0
    public Lista() {
        this.numeros = new int[0];
        this.tamaño = 0;
    }

    // 2. Obtener el número de elementos insertados en la lista
    public int obtenerNumeroElementos() {
        return tamaño;
    }

    // Método para redimensionar el arreglo
    private void redimensionar(int nuevoTamaño) {
        int[] nuevoArray = new int[nuevoTamaño];
        for (int i = 0; i < Math.min(tamaño, nuevoTamaño); i++) {
            nuevoArray[i] = numeros[i];
        }
        numeros = nuevoArray;
        tamaño = nuevoTamaño;
    }

    // 3. Insertar un número al final de la lista
    public void insertarAlFinal(int numero) {
        redimensionar(tamaño + 1);
        numeros[tamaño - 1] = numero;
    }

    // 4. Insertar un número al principio de la lista
    public void insertarAlPrincipio(int numero) {
        redimensionar(tamaño + 1);
        for (int i = tamaño - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = numero;
    }

    // 5. Insertar un número en un índice dado
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

    // 6. Obtener el valor en un índice
    public Integer obtenerPorIndice(int indice) {
        if (indice >= 0 && indice < tamaño) {
            return numeros[indice];
        }
        return null;
    }

    // 7. Eliminar un elemento por índice
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

    // 8. Borrar elemento (mismo que eliminarPorIndice)
    public void borrarElemento(int indice) {
        eliminarPorIndice(indice);
    }

    // 9. Buscar un número y devolver su índice
    public int buscarNumero(int numero) {
        for (int i = 0; i < tamaño; i++) {
            if (numeros[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    // 10. Mostrar los elementos de la lista
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

    // Método principal para probar la clase
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