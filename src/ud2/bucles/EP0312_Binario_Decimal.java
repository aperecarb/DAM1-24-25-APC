/* Modifica el programa anterior (EP0311) para que el usuario pueda introducir un número en binario y 
el programa muestre su conversión a decimal */

package ud2.propuestos.bucles;
import java.util.Scanner;

public class EP0312_Binario_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero decimal: ");
        int decimal = scanner.nextInt();
        scanner.close();

        do{
            decimal = decimal / 2;
            
        } while (decimal > 1);
    }
}
