package ud7;

import javafx.application.Application;
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
        
    }
}
