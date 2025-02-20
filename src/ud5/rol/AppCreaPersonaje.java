package ud5.rol;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppCreaPersonaje {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JSONArray personajesArray = new JSONArray();

        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (Scanner fileScanner = new Scanner(file)) {
                StringBuilder jsonStr = new StringBuilder();
                while (fileScanner.hasNextLine()) {
                    jsonStr.append(fileScanner.nextLine());
                }
                if (!jsonStr.toString().isEmpty()) {
                    personajesArray = new JSONArray(jsonStr.toString());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.print("Introduzca nombre del personaje: ");
            String nombre = sc.nextLine();

            Personaje personaje;
            System.out.print("¿Desea introducir una raza (rechazarlo creará un humano con stats aleatorias)? (S/N): ");
            char opcionRaza = sc.next().charAt(0);
            if (opcionRaza == 'S' || opcionRaza == 's') {
                System.out.print("Introduzca raza (HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL): ");
                String raza = sc.next().toUpperCase();

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

            personajesArray.put(personaje.toJSON());
            try (FileWriter fileWriter = new FileWriter(FILE_PATH)) {
                fileWriter.write(personajesArray.toString(4));
            } catch (IOException e) {
                e.printStackTrace();
            }

            personaje.mostrar();
            System.out.println("El personaje se ha guardado con éxito.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}