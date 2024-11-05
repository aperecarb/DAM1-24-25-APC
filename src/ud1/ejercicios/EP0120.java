/*  Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el 
importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido 
por el usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €.
En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento 
del 5%. */

import java.util.Scanner;

public class EP0120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double precioinfant= 15.50;
        final double precioadult = 20;
        final double descuento = 0.05;

        System.out.print("Introduzca el numero de entradas infantiles: ");
        int infant = scanner.nextInt(); 
        System.out.print("Introduzca el numero de entradas de adultos: ");
        int adult = scanner.nextInt(); 

        double preciototal = (precioinfant*infant) + (precioadult*adult);

        if(preciototal >= 100){
            System.out.println("El precio total es: " + preciototal*(preciototal*descuento));
        }else{
            System.out.println("El precio total es: " + preciototal);
        }

        scanner.close();
    }
}
