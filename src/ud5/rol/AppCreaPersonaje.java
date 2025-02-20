package ud5.rol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppCreaPersonaje {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introduzca nombre del personaje: ");
            String nombre = sc.nextLine();

            Personaje personaje;
            System.out.print("¿Desea introducir una raza (rechazarlo creará un humano con stats aleatorias)? (S/N): ");
            char opcionRaza = sc.next().charAt(0);
            if (opcionRaza == 'S' || opcionRaza == 's') {
                System.out.print("Introduzca raza (HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL): ");
                String raza = sc.nextLine().toUpperCase();

                System.out.print("¿Desea introducir atributos manualmente? (S/N): ");
                char opcion = sc.next().charAt(0);

                if (opcion == 'S' || opcion == 's') {
                    System.out.print("Introduzca la fuerza: ");
                    int fuerza = sc.nextInt();
                    System.out.print("Introduzca la agilidad: ");
                    int agilidad = sc.nextInt();
                    System.out.print("Introduzca la constitución: ");
                    int constitucion = sc.nextInt();
                    personaje = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
                } else {
                    personaje = new Personaje(nombre, raza);
                }
            } else {
                personaje = new Personaje(nombre);
            }
            personaje.mostrar();
            guardarPersonaje(personaje);
            System.out.println("Personaje guardado con éxito.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void guardarPersonaje(Personaje personaje) {
        try (FileWriter file = new FileWriter(FILE_PATH, true)) {
            file.write(personaje.toJSON().toString() + "\n");
        } catch (IOException e) {
            System.err.println("Error al guardar el personaje: " + e.getMessage());
        }
    }
}