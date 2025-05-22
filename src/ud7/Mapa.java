package ud7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * Crea un programa que represente el mapa en una interfaz gráfica JavaFX y que permita mover un robot desde la casilla A hasta la Z con las teclas
 * de los cursores o AWSD. 
 * Si se pisa una mina deberá mostrar un cuadro de diálogo de error
 * Si se llega a la meta un cuadro de diálogo de éxito.
 */

public class Mapa extends Application {

    String[] mapa = {
            "  Z       ",
            " *        ",
            "  *  *    ",
            "          ",
            " A        "
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length(); j++) {
                Label lbl = new Label(String.valueOf(mapa[i].charAt(j)));
                lbl.setPrefSize(50, 50);
                lbl.setAlignment(Pos.CENTER);
                lbl.setStyle("-fx-background-color: #151515; -fx-text-fill: white; -fx-border-color: white;");
                gridPane.add(lbl, j, i);
            }
        }

        primaryStage.setTitle("Mapa");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }
}
