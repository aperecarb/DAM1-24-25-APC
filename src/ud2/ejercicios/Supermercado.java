/* Implementa un programa que simule el proceso de cobro en la caja de un supermercado.

    1. Para calcular el importe total que debe pagar cada cliente el programa solicitará
introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y
la cantidad de unidades del mismo, expresado como un número entero.

    2. El programa deberá controlar los posibles errores o excepciones en la entrada de
datos por teclado, informando al usuario y permitiendo repetir la entrada.

    3. La condición para finalizar la introducción de productos queda a criterio del
programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.

    4. Una vez terminado de introducir los productos, el programa mostrará el importe total
de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con
tarjeta” o “en efectivo”.

    5. Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de
ese cliente.

    6. Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe
pagado por el cliente y se calculará el cambio a devolver, desglosando dicha
cantidad en billetes y monedas de € y de 1 céntimos de euro.

    7. Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir
el proceso para un nuevo cliente.

Implementa el programa utilizando programación modular para descomponer el problema
en subproblemas más sencillos implementados con funciones. */

package ud2.practicas;
import java.util.Scanner;

public class Supermercado {

    public static double calcularImporteTotal (double precio, double precioTotal, int cantidadProductos) {
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Introduzca el precio del producto: ");
            precio = scanner.nextDouble();

            precioTotal =+ precio;

            if(precio > 0){
                cantidadProductos++;
            }

        } while (precio >= 0);

        scanner.close();

        return precioTotal;
    }
    
    public static int metodoPago (int eleccion) {
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Elige el método de pago: ");
            System.out.println("Efectivo (1)");
            System.out.println("Tarjeta (2)");
            eleccion = scanner.nextInt();

            if(eleccion != 1 || eleccion != 2){
                System.out.println("No has introducido un método correcto");
            }

        }while (eleccion != 1 || eleccion != 2);

        scanner.close();

        return eleccion; 
    }

    public static void pagoTarjeta (int eleccion) {
        System.out.println("Pago realizado correctamente.");
    }

    public static void pagoEfectivo (double efectivo, double precioTotal, 
    int billetes50, int billetes20, int billetes10, int billetes5, int billetes2, int billetes1,
    int monedas50, int monedas20, int monedas10, int monedas5, int monedas2, int monedas1) {

        billetes50 = (int)efectivo / 50;
        efectivo %= 50; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 50
        billetes20 = (int)efectivo / 20;
        efectivo %= 20; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 20
        billetes10 = (int)efectivo / 10;
        efectivo %= 10; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 10
        billetes5 = (int)efectivo / 5;
        efectivo %= 5; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 5
        billetes2 = (int)efectivo / 2;
        efectivo %= 2; // Actualiza efectivo para calcular cuánto dinero queda después de sacar las monedas de 2
        billetes1 = (int)efectivo / 1;
        efectivo %= 1; // Actualiza efectivo para calcular cuánto dinero queda después de sacar las monedas de 1

        precioTotal = precioTotal * 100; // Pasar a céntimos

        monedas50 = (int)efectivo / 50;
        efectivo %= 50; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 50
        monedas20 = (int)efectivo / 20;
        efectivo %= 20; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 20
        monedas10 = (int)efectivo / 10;
        efectivo %= 10; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 10
        monedas5 = (int)efectivo / 5;
        efectivo %= 5; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 5
        monedas2 = (int)efectivo / 2;
        efectivo %= 2; // Actualiza efectivo para calcular cuánto dinero queda después de sacar las monedas de 2
        monedas1 = (int)efectivo / 1;
    }

    public static void main(String[] args) {
        int eleccion = 0;
         
        calcularImporteTotal(0, 0, 0);
        metodoPago(eleccion);

    }
}
