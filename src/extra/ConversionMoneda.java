/* Escribe un programa que reciba un número que represente una moneda (1: Dólar, 2: Euro, 3: Yen, 4: Libra) y convierta una cantidad en otra moneda. */

package extra;
import java.util.Scanner;

public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double DOLAR = 0.920; // euros = 1 dolar   
        double LIBRA = 1.201; // euros = 1 libra   
        double YEN = 0.006; // euros = 1 yen   

        System.out.print("Introduzca la cantidad a convertir en euros: ");
        double euro = scanner.nextDouble();
        scanner.nextLine(); // Eliminar buffer creado por leer números y después texto
        
        System.out.print("Escriba la moneda a convertir en minúscula (dolar, libra, yen): ");
        String moneda = scanner.nextLine();
        scanner.close();

        // Inicializar las variables para evitar fallos
        double conversion = 0;
        String monedaStr = " ";

        switch (moneda) {
            case "dolar":
                conversion = euro / DOLAR;
                monedaStr = "dólares";
                break;
            case "libra":
                conversion = euro / LIBRA;
                monedaStr = "libras";
                break;
            case "yen":
                conversion = euro / YEN;
                monedaStr = "yenes";
                break;
            default:
                System.out.println("Moneda no válida");
                return; // Para que no lea el print de abajo. El programa se corta aquí
        }

        System.out.printf("%.2f euros son %.2f %s", euro, conversion, monedaStr);
    }
}
