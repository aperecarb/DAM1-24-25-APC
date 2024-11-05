/* La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo 
en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se 
mide en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centimetros (sin 
decimales). Por ejemplo, para un lanzamiento de 12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm. 

Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.*/

import java.util.Scanner;

public class EP0131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MACM = 100;

        System.out.print("Introduzca la longitud (en metros) del lanzamiento: ");
        float metros = scanner.nextFloat();
        scanner.close();

        // Pasar de metros a centímetros
        float centimetros = metros*MACM;

        // Si no ponemos esto, el valor se redondea
        int truncado = (int) centimetros;

        System.out.printf("La longitud del lanzamiento (%f m) es %d cm", metros, truncado);
    }
}
