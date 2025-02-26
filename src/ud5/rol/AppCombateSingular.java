package ud5.rol;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class AppCombateSingular {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSONArray personajesArray = cargarPersonajes();
            if (personajesArray.length() < 2) {
                System.out.println("No hay suficientes personajes guardados para el combate.");
                return;
            }

            Personaje p1 = seleccionarPersonaje(scanner, personajesArray, "primer");
            Personaje p2 = seleccionarPersonaje(scanner, personajesArray, "segundo");

            System.out.println("\nEstado inicial de los personajes:");
            p1.mostrar();
            p2.mostrar();

            Random rand = new Random();
            Personaje atacante = (p1.agilidad > p2.agilidad) ? p1 : (p2.agilidad > p1.agilidad) ? p2 : (rand.nextBoolean() ? p1 : p2);
            Personaje defensor = (atacante == p1) ? p2 : p1;

            while (p1.estaVivo() && p2.estaVivo()) {
                System.out.println("\n" + atacante.getNombre() + "(" + atacante.getPuntosVida() + ") ataca a " + defensor.getNombre() + "(" + defensor.getPuntosVida() + ")");
                int daño = atacante.atacar(defensor);
                if (daño > 0) {
                    System.out.println("El ataque acierta e inflige " + daño + " puntos de daño.");
                } else {
                    System.out.println("El ataque falla o es esquivado.");
                }

                if (!defensor.estaVivo()) {
                    System.out.println(defensor.getNombre() + " ha muerto. ¡Fin del combate!");
                    break;
                }

                Personaje temp = atacante;
                atacante = defensor;
                defensor = temp;
            }

            System.out.println("\nEstado final de los personajes:");
            p1.mostrar();
            p2.mostrar();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static JSONArray cargarPersonajes() throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            return new JSONArray();
        }
        String content = new String(Files.readAllBytes(Paths.get(FILE_PATH)));
        return new JSONArray(content);
    }

    private static Personaje seleccionarPersonaje(Scanner scanner, JSONArray personajesArray, String orden) throws Exception {
        System.out.println("Seleccione el " + orden + " personaje:");
        for (int i = 0; i < personajesArray.length(); i++) {
            JSONObject obj = personajesArray.getJSONObject(i);
            System.out.println(i + 1 + ". " + obj.getString("nombre"));
        }
        int seleccion;
        do {
            System.out.print("Ingrese el número del personaje: ");
            seleccion = scanner.nextInt();
        } while (seleccion < 1 || seleccion > personajesArray.length());

        JSONObject elegido = personajesArray.getJSONObject(seleccion - 1);
        return new Personaje(elegido.getString("nombre"), elegido.getString("raza"),
                elegido.getInt("fuerza"), elegido.getInt("agilidad"), elegido.getInt("constitucion"));
    }
}