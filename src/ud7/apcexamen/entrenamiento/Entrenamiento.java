package ud7.apcexamen.entrenamiento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Entrenamiento extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Ponemos título a la ventana
        primaryStage.setTitle("App entrenamiento");

        // Pedimos el nombre del/la atleta
        Label nameLabel = new Label("Introduce el nombre:");
        TextField nameField = new TextField();

        // Pedimos la fecha
        Label dateLabel = new Label("Introduce la fecha y hora:");
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());

        // Pedimos la distancia recorrida por el/la atleta
        Label distanceLabel = new Label("Introduce los kilómetros recorridos:");
        TextField distanceField = new TextField();

        // Creamos un boton para añadir registro y otro para ver registros
        Button btnAdd = new Button("Añadir registro");
        Button btnHistory = new Button("Ver registros");

        btnAdd.setPrefWidth(200);
        btnHistory.setPrefWidth(200);

        // Hacemos que el botón guarde el registro al ser pulsado
        btnAdd.setOnAction(e -> {
            String nombre = nameField.getText().trim();
            LocalDate fecha = datePicker.getValue();
        });

        // Hacemos que el botón muestre los registros al ser pulsado
        btnHistory.setOnAction(e -> {

        });

        // Creamos la ventana
        VBox layout = new VBox(15, nameLabel, nameField, dateLabel, datePicker, distanceLabel, distanceField, btnAdd, btnHistory);
        layout.setAlignment(Pos.CENTER);

        // Mostramos la ventana
        Scene scene = new Scene(layout, 350, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
