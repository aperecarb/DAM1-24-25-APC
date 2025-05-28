/* Álvaro Pereira Carballo */

package ud7.apcexamen.web;

import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeneraWebFX extends Application {
    public static void main(String[] args) {
        launch();
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

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Ponemos título a la ventana
        primaryStage.setTitle("Generador HTML");

        // Pedimos el título
        Label titleLabel = new Label("Introduzca el título:");
        TextField titleField = new TextField();

        // Pedimos la descripción
        Label descLabel = new Label("Introduzca una descripción:");
        TextField descField = new TextField();

        // Pedimos el texto de la URL
        Label textLabel = new Label("Introduzca el texto del enlace:");
        TextField textField = new TextField();

        // Pedimos la URL
        Label urlLabel = new Label("Introduzca la URL:");
        TextField urlField = new TextField();

        // Creamos el botón para generar el HTML
        Button btnGen = new Button("Generar HTML");

        // Hacemos que cuando se pulse el botón ocurra lo siguiente
        btnGen.setOnAction(e -> {
            // Cogemos el texto de cada campo
            String title = titleField.getText().trim();
            String desc = descField.getText().trim();
            String text = textField.getText().trim();
            String url = urlField.getText().trim();

            String html = genHTML(title, desc, text, url);

            // Asginamos un nombre al archivo
            String fileName = "HTML_generado.html";

            // Lo generamos y comprobamos que se genere correctamente
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(html);
                // En caso de ir todo bien, el texto del botón cambiará a un mensaje de confirmación
                btnGen.setText("La página fue generada correctamente.");
            } catch (IOException j) {
                // En caso de haber algún fallo, el texto del botón cambiará a un mensaje de error
                btnGen.setText("La página HTML no se pudo generar.");
            }
        });

        // Creamos la ventana
        VBox layout = new VBox(15, titleLabel, titleField, descLabel, descField, textLabel, textField, urlLabel, urlField, btnGen);
        layout.setAlignment(Pos.CENTER);

        // Mostramos la ventana
        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
