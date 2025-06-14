package ud7_2.ejemplousuarios.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ud7_2.ejemplousuarios.AppUsuario;
import ud7_2.ejemplousuarios.modelo.Usuario;
import ud7_2.ejemplousuarios.modelo.UsuarioDAO;

public class LoginController {

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsuario;

    @FXML
    void login(ActionEvent event) {
        Usuario usuario = UsuarioDAO.login(txtUsuario.getText(), txtPassword.getText());
        if (usuario != null) {
            // Si el usuario existe, se carga la escena de perfil
            System.out.println("Login correcto");
            AppUsuario.usuario = usuario;
            AppUsuario.cargarEscena("Perfil");
 
        } else {
            System.out.println("Login incorrecto");
            AppUsuario.mostrarError("Error de login", "Usuario o contraseña incorrectos");
            // Limpiar las contraseña
            txtPassword.clear();
        }
    }

    @FXML
    void registro(ActionEvent event) {
        AppUsuario.cargarEscena("Registro");
    }    

}
