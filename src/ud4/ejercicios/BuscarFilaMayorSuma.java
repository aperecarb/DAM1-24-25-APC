package ud4.ejercicios;

public class BuscarFilaMayorSuma {
    public static int buscarFilaMayorSuma(int[][] matriz) {
        int filaMayorSuma = 0;
        int sumaMayor = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            int sumaActual = 0;

            // Calculamos la suma de la fila actual
            for (int j = 0; j < matriz[i].length; j++) {
                sumaActual += matriz[i][j];
            }

            if (sumaActual > sumaMayor) {
                sumaMayor = sumaActual;
                filaMayorSuma = i;
            }
        }

        return filaMayorSuma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int fila = buscarFilaMayorSuma(matriz);
        System.out.println("La fila con mayor suma es: " + fila);
    }
}
