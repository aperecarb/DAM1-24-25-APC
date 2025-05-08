package ud7;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class App extends Application {
    private Button mainButton;
    private Random random = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JavaFX!");
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Crear el botón principal
        mainButton = new Button("Generar gatete");

        // Ruta a la imagen del gato
        String catImagePath = "D:\\aperecarb\\images.jpg"; // Reemplaza con la ruta real de tu imagen de gato

        // Obtener los límites de la pantalla principal
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double screenWidth = screenBounds.getWidth();
        double screenHeight = screenBounds.getHeight();

        // Acción al pulsar el botón principal
        mainButton.setOnAction(e -> {
            try {
                // Cargar la imagen del gato
                FileInputStream input = new FileInputStream(catImagePath);
                Image catImage = new Image(input);
                ImageView catImageView = new ImageView(catImage);

                // Crear un nuevo Stage
                Stage catStage = new Stage();
                StackPane catPane = new StackPane(catImageView);
                Scene catScene = new Scene(catPane);
                catStage.setTitle("Gatete");
                catStage.setScene(catScene);

                // Calcular una posición aleatoria para la nueva ventana
                double catWindowWidth = 200; // Ancho estimado de la ventana del gato
                double catWindowHeight = 200; // Alto estimado de la ventana del gato
                double randomX = screenWidth * random.nextDouble() - catWindowWidth / 2;
                double randomY = screenHeight * random.nextDouble() - catWindowHeight / 2;

                // Asegurarse de que la ventana no se salga de los bordes de la pantalla
                randomX = Math.max(0, Math.min(randomX, screenWidth - catWindowWidth));
                randomY = Math.max(0, Math.min(randomY, screenHeight - catWindowHeight));

                // Establecer la posición de la nueva ventana
                catStage.setX(randomX);
                catStage.setY(randomY);

                catStage.show();
                mainButton.requestFocus();

            } catch (FileNotFoundException ex) {
                System.err.println("Error: No se encontró la imagen del gato en la ruta: " + catImagePath);
            }
        });

        // Escena principal con el botón
        StackPane root = new StackPane(mainButton);
        Scene scene = new Scene(root, 250, 100);

        primaryStage.setTitle("Gatetes");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

        mainButton.requestFocus();
    }
}