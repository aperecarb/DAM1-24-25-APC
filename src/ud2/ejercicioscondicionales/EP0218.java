/* Modifica la actividad anterior (EP0217) para que, además de los dos números aleatorios, también 
aparezca aleatoriamente la operación que debe realizar el jugador: suma, resta o multiplicación. 

Amplía el programa anterior para que muestre el número de segundos que el usuario ha tardado en responder. 
Utiliza la clase LocalTime.*/

package ejerciciosU2.propuestos.condicionales;

import java.util.Scanner;
import java.util.Random;

public class EP0218 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        final int MAX = 100;

        int num1 = random.nextInt(MAX);
        int num2 = random.nextInt(MAX);

        System.out.printf("\nNúmero 1 = %d", num1);
        System.out.printf("\nNúmero 2 = %d", num2);

        String operacionStr;
        int resultado;

        int operacion = random.nextInt(3);
        switch (operacion) {
            case 0:
                operacionStr = "suma";
                resultado = num1 + num2;
                break;
            case 1:
                operacionStr = "resta";
                resultado = num1 - num2;
                break;
            default:
                operacionStr = "multiplicación";
                resultado = num1 * num2;
                break;
        }

        long tiempoInicio = System.currentTimeMillis();
        System.out.printf("\nIntroduzca la %s de los números anteriores: ", operacionStr);
        int respuesta = scanner.nextInt();
        scanner.close();
        long tiempoFin = System.currentTimeMillis();
        
        long tiempoTotal = (tiempoFin-tiempoInicio) / 1000;

        System.out.printf("Has tardado %d segundos en responder\n", tiempoTotal);

        if (respuesta == resultado){
            System.out.println("La respuesta es correcta");
        }else{
            System.out.println("La respuesta es incorrecta");
            System.out.println("Resultado: " + resultado);
        }
    } 
}
