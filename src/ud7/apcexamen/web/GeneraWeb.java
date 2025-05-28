/* Álvaro Pereira Carballo */

package ud7.apcexamen.web;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GeneraWeb {
    public static void main(String[] args) {
        // Iniciamos la lectura de teclado
        Scanner sc = new Scanner(System.in);

        // Leemos el título
        System.out.println("Introduzca el título:");
        String title = sc.nextLine();

        // Leemos la descripción
        System.out.println("Introduzca una descripción:");
        String desc = sc.nextLine();

        // Leemos el texto de enlace
        System.out.println("Introduzca el texto del enlace:");
        String text = sc.nextLine();

        // Leemos la URL
        System.out.println("Introduzca la URL:");
        String url = sc.nextLine();

        // Cerramos el scanner
        sc.close();

        String html = genHTML(title, desc, text, url);

        // Asginamos un nombre al archivo
        String fileName = "HTML_generado.html";

        // Lo generamos y comprobamos que se genere correctamente
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(html);
            System.out.println("La página fue generada correctamente.");
        } catch (IOException e) {
            System.err.println("La página HTML no se pudo generar: " + e.getMessage());
        }
    }

    // Creamos el método para generar el HTML
    public static String genHTML(String title, String desc, String text, String url) {
        String plantilla = """
                    <html>
                        <head>
                            <title>Título</title>
                            <meta charset="utf-8">
                        </head>
                        <body>
                            <h1>Título</h1>
                            <p>Descripción. <br>
                            <a href="URL Enlace">Texto Enlace</a>
                            </p>
                        </body>
                    </html>
                """;

        // Reemplazamos los elementos "placeholder" con los que introdujo el usuario
        plantilla = plantilla.replace("Título", title);
        plantilla = plantilla.replace("Descripción", desc);
        plantilla = plantilla.replace("URL Enlace", url);
        plantilla = plantilla.replace("Texto Enlace", text);

        return plantilla;
    }
}