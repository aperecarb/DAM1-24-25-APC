/* Implementar una aplicación para calcular datos estadísticos de las edades de los
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
de alumnos y cuántos son mayores de edad. */

package bucles;
import java.util.Scanner;

public class E0302{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int suma = 0; 
        int nAlumnos = 0;
        int nMayores = 0;
        int edad = 0; 

        while (edad >= 0) {
            System.out.print("Introduzca la edad de un alumno: ");
            edad = scanner.nextInt();

            if(edad > 0){
            suma = suma + edad;
            nAlumnos++;
            }

            if(edad >= 18 && edad > 0){
                nMayores++;
            }
            
        }
        scanner.close();
        System.out.println("Suma edades: " + suma);
        System.out.println("Media edades: " + suma/nAlumnos);
        System.out.println("Número de alumnos: " + nAlumnos);
        System.out.println("Número de alumnos mayores de edad: " + nMayores);
    }
}
