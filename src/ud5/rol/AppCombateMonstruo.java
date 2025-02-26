package ud5.rol;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class AppCombateMonstruo {
    private static final String FILE_PATH = "src/ud5/rol/personajes.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSONArray personajesArray = cargarPersonajes();
            if (personajesArray.length() < 1) {
                System.out.println("No hay personajes guardados para el combate.");
                return;
            }

            Personaje p1 = seleccionarPersonaje(scanner, personajesArray, "personaje");
            Monstruo m1 = Monstruo.generaMonstruoAleatorio();

            System.out.println("\nEstado inicial de los combatientes:");
            p1.mostrar();
            System.out.println(m1.toString());

            Random rand = new Random();
            boolean personajeAtacaPrimero = p1.getAgilidad() > m1.velocidad || (p1.getAgilidad() == m1.velocidad && rand.nextBoolean());
            
            while (p1.estaVivo() && m1.estaVivo()) {
                if (personajeAtacaPrimero) {
                    System.out.println("\n" + p1.getNombre() + " ataca a " + m1.toString());
                    int daño = p1.atacar(m1);
                    System.out.println("Inflige " + daño + " puntos de daño.");
                } else {
                    System.out.println("\n" + m1.toString() + " ataca a " + p1.getNombre());
                    int daño = m1.atacar(p1);
                    System.out.println("Inflige " + daño + " puntos de daño.");
                }

                personajeAtacaPrimero = !personajeAtacaPrimero;
            }

            System.out.println("\nEstado final de los combatientes:");
            p1.mostrar();
            System.out.println();
            System.out.println(m1.toString());
            System.out.println();

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

    private static Personaje seleccionarPersonaje(Scanner scanner, JSONArray personajesArray, String tipo) throws Exception {
        System.out.println("Seleccione un " + tipo + ":");
        for (int i = 0; i < personajesArray.length(); i++) {
            JSONObject obj = personajesArray.getJSONObject(i);
            System.out.println(i + 1 + ". " + obj.getString("nombre"));
        }
        int seleccion;
        do {
            System.out.print("Ingrese el número del " + tipo + ": ");
            seleccion = scanner.nextInt();
        } while (seleccion < 1 || seleccion > personajesArray.length());

        JSONObject elegido = personajesArray.getJSONObject(seleccion - 1);
        return new Personaje(elegido.getString("nombre"), elegido.getString("raza"),
                elegido.getInt("fuerza"), elegido.getInt("agilidad"), elegido.getInt("constitucion"));
    }
}