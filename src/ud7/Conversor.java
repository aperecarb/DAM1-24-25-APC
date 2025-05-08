package ud7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application {
    TextField txtNum = new TextField("Escribe un número:");
    Button btnKaM = new Button("Kilómetros a millas");
    Button btnMaK = new Button("Millas a kilómetros");
    Label lblRes = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        btnKaM.setOnAction(e -> kaM());
        btnMaK.setOnAction(e -> maK());

        VBox vbox = new VBox(txtNum, btnKaM, btnMaK, lblRes);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void kaM() {
        double resultado;

        try {
            double num = Double.parseDouble(txtNum.getText().replace(",", "."));
            resultado = num / 1.609344;
            lblRes.setText(String.valueOf(resultado));
        } catch (Exception ex) {
            lblRes.setText("ERROR: Alguna de las entradas no es un número.");
        }
    }

    private void maK() {
        double resultado;

        try {
            double num = Double.parseDouble(txtNum.getText().replace(",", "."));
            resultado = num * 1.609344;
            lblRes.setText(String.valueOf(resultado));
        } catch (Exception ex) {
            lblRes.setText("ERROR: Alguna de las entradas no es un número.");
        }
    }
}