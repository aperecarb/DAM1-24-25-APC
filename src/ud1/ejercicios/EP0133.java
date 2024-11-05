/* Desarrolla un programa que convierta unidades de almacenamiento entre bytes, KB, MB y GB. 
Solicita al usuario la cantidad de datos y la unidad de origen y destino. */

import java.util.Scanner;

public class EP0133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KB = 1024;
        final double MB = 1024 * KB;
        final double GB = 1024 * MB;

        System.out.print("Introduzca la cantidad de datos: ");
        double datos = scanner.nextDouble();
    
        System.out.println("Introduzca la unidad de origen de los datos\nB = 0\tKB = 1\tMB = 2\tGB = 3");
        int unidadOrigen = scanner.nextInt();
        String unidadOrigenStr = (unidadOrigen == 0) ? "B" :
                                 (unidadOrigen == 1) ? "KB" :
                                 (unidadOrigen == 2) ? "MB" :
                                                       "GB" ;

        System.out.println("Introduzca la unidad de destino de los datos\nB = 0\tKB = 1\tMB = 2\tGB = 3");
        int unidadDestino = scanner.nextInt();
        String unidadDestinoStr = (unidadDestino == 0) ? "B" :
                                  (unidadDestino == 1) ? "KB" :
                                  (unidadDestino == 2) ? "MB" :
                                                         "GB" ;

        scanner.close();

        // Conversión de datos
        double datosFinal = (unidadOrigen == 0) ? 
                                (unidadDestino == 0) ? (datos): // bytes a bytes
                                (unidadDestino == 1) ? (datos / KB): // bytes a KB
                                (unidadDestino == 2) ? (datos / MB): // bytes a MB
                                (datos / GB): // bytes a GB

                            (unidadOrigen == 1) ? 
                                (unidadDestino == 0) ? (datos * KB): // KB a bytes
                                (unidadDestino == 1) ? (datos): // KB a KB
                                (unidadDestino == 2) ? (datos / KB): // KB a MB
                                (datos / MB): // KB a GB

                            (unidadOrigen == 2) ? 
                                (unidadDestino == 0) ? (datos * MB): // MB a bytes
                                (unidadDestino == 1) ? (datos * KB): // MB a KB
                                (unidadDestino == 2) ? (datos): // MB a MB
                                (datos / KB): // MB a GB

                                (unidadDestino == 0) ? (datos * GB): // GB a bytes
                                (unidadDestino == 1) ? (datos * MB): // GB a KB
                                (unidadDestino == 2) ? (datos * KB): // GB a MB
                                (datos); // GB a GB

        System.out.printf("%.2f %s son %.2f %s", datos, unidadOrigenStr, datosFinal, unidadDestinoStr);
    }
    
}