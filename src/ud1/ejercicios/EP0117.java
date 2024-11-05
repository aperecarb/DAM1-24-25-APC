/* Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación 
que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante 
una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:

El número de hormigas capturadas (6 patas).
El número de arañas capturadas (8 patas).
El número de cochinillas capturadas (14 patas).

La aplicación debe mostrar el número total de patas. */

import java.util.Scanner;

public class EP0117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        final int npatashormiga = 6;
        final int npatasaraña = 8;
        final int npatascochinilla = 14;

        System.out.print("Introduzca el numero de hormigas captadas: ");
        int nhormigas = scanner.nextInt();
        System.out.print("Introduzca el numero de arañas captadas: ");
        int narañas = scanner.nextInt();
        System.out.print("Introduzca el numero de cochinillas captadas: ");
        int ncochinillas = scanner.nextInt();

        int total = nhormigas*npatashormiga + narañas*npatasaraña + ncochinillas*npatascochinilla;
        System.out.println("\nEl numero de patas total es de " + total);

        scanner.close();
    }
    
}
