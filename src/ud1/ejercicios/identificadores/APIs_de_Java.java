package identificadores;

import java.time.LocalDateTime;
import java.util.Scanner; // Importamos la clase Scanner (scanf)
import java.time.format.DateTimeFormatter; //Cambiar el formato de la fecha

public class  APIs_de_Java{
            public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.print("\nIntroduce un número: ");
    int numero =scanner.nextInt();
    scanner.nextLine(); 
    System.out.print("\nIntroduce tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.printf("\nHas escrito el número %d y te llamas %s\n", numero, nombre);

    System.out.print("\n¿Cuántos años tienes? ");
    int edad = scanner.nextInt();
    System.out.printf("El año que viene tendrás " + (edad+1));

    scanner.close();

    System.out.print("\n¿En qué año naciste? ");
    int añoNacimiento = scanner.nextInt();

    // Obtener la fecha
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String formattedDate = now.format(formatter); // Formato de la fecha

    int año = now.getYear(); // Almacenar solamente el año
    System.out.printf("Tu edad es "+ (año-añoNacimiento));


    System.out.println("\n\nNúmero aleatorio: " + Math.random());
    System.out.printf("\n%d elevado a 3: %.0f\n", numero, Math.pow(numero, 3));

    System.out.println("\nHoy es día " + formattedDate);
    }
}