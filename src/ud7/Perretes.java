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

public class Perretes extends Application {
    private Button mainButton;
    private Random random = new Random();

    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Crear el botón principal
        mainButton = new Button("Generar perrete");

        // Ruta a la imagen del perrete
        String dogImagePath = "D:\\aperecarb\\perrete.jpg";

        // Obtener los límites de la pantalla principal
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        double screenWidth = screenBounds.getWidth();
        double screenHeight = screenBounds.getHeight();

        // Acción al pulsar el botón principal
        mainButton.setOnAction(e -> {
            try {
                // Cargar la imagen del perrete
                FileInputStream input = new FileInputStream(dogImagePath);
                Image dogImage = new Image(input);
                ImageView dogImageView = new ImageView(dogImage);

                // Crear un nuevo Stage
                Stage dogStage = new Stage();
                StackPane dogPane = new StackPane(dogImageView);
                Scene dogScene = new Scene(dogPane);
                dogStage.setTitle("Perrete");
                dogStage.setScene(dogScene);

                // Calcular una posición aleatoria para la nueva ventana
                double dogWindowWidth = 200;
                double dogWindowHeight = 200;
                double randomX = screenWidth * random.nextDouble() - dogWindowWidth / 2;
                double randomY = screenHeight * random.nextDouble() - dogWindowHeight / 2;

                // Asegurarse de que la ventana no se salga de los bordes de la pantalla
                randomX = Math.max(0, Math.min(randomX, screenWidth - dogWindowWidth));
                randomY = Math.max(0, Math.min(randomY, screenHeight - dogWindowHeight));

                // Establecer la posición de la nueva ventana
                dogStage.setX(randomX);
                dogStage.setY(randomY);

                dogStage.show();
                mainButton.requestFocus();

            } catch (FileNotFoundException ex) {
                System.err.println("Error: No se encontró la imagen del perro en la ruta: " + dogImagePath);
            }
        });

        StackPane root = new StackPane(mainButton);
        Scene scene = new Scene(root, 250, 100);

        primaryStage.setTitle("Perretes");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

        mainButton.requestFocus();
    }
}