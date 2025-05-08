package ud7;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField txtNum1 = new TextField("Escribe un número:");
        TextField txtNum2 = new TextField("Escribe otro número:");
        Button btnSum = new Button("Sumar");
        Label lblRes = new Label();

        btnSum.setOnAction(e -> {
            int resultado;
            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());
            resultado = n1 + n2;
            lblRes.setText(String.valueOf(resultado));
        });

        VBox vbox = new VBox(txtNum1, txtNum2, btnSum, lblRes);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}