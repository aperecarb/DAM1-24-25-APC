package ud5.rol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppCreaPersonaje {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese nombre del personaje: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese raza (HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL): ");
            String raza = sc.nextLine().toUpperCase();

            System.out.print("¿Desea ingresar atributos manualmente? (S/N): ");
            char opcion = sc.next().charAt(0);

            Personaje personaje;
            if (opcion == 'S' || opcion == 's') {
                System.out.print("Ingrese fuerza: ");
                int fuerza = sc.nextInt();
                System.out.print("Ingrese agilidad: ");
                int agilidad = sc.nextInt();
                System.out.print("Ingrese constitución: ");
                int constitucion = sc.nextInt();
                personaje = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
            } else {
                personaje = new Personaje(nombre, raza);
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