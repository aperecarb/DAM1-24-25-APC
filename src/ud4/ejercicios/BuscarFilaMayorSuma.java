package ud4.ejercicios;

public class BuscarFilaMayorSuma {
    public static int[] buscarFilaMayorSuma(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return new int[0];
        }

        int filaMayorSuma = 0;
        int mayorSuma = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            if (suma > mayorSuma) {
                mayorSuma = suma;
                filaMayorSuma = i;
            }
        }
        return matriz[filaMayorSuma];
    }

    public static void main(String[] args) {
        int[][] matriz = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int[] filaResultado = buscarFilaMayorSuma(matriz);

        if (filaResultado.length == 0) {
            System.out.println("La matriz está vacía o es nula.");
        } else {
            System.out.print("Fila con mayor suma: ");
            for (int num : filaResultado) {
                System.out.print(num + " ");
            }
        }
    }
}
