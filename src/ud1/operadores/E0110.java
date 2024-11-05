/* Diseña un algoritmo que indique si podemos o no salir a la calle, lo que se 
determinará en función de ciertas condiciones, y que lo muestre mediante un 
literal booleano (true o false). En principio, podremos salir a la calle siempre 
que no llueva y que hayamos terminado nuestras tareas. Además de lo anterior 
podremos salir a la calle si tenemos que hacer algún recado, como ir al supermercado. 
Para obtener el resultado, el programa debe preguntar por consola y mediante valores 
booleanos si está lloviendo, si hemos terminado nuestras tareas y si tenemos que hacer 
algún recado. */

package operadores;
import java.util.Scanner;

public class E0110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Está lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();
        System.out.print("¿Tengo tareas? (true/false): ");
        boolean tareas = scanner.nextBoolean();
        System.out.print("¿Tengo recados? (true/false): ");
        boolean recados = scanner.nextBoolean();

        boolean podemosSalir = (!llueve && tareas) || recados;

        System.out.println("¿Podemos salir a la calle? " + podemosSalir);

        scanner.close();
    }

}
