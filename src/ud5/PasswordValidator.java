package ud5;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() < 8) { // Para que acepte contraseñas de 8 caracteres hay que quitar el =
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) { // Para que detecte correctamente las mayúsculas hay que cambiar el isLowerCase por isUpperCase
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true; // Para que detecte los dígitos hay que cambiar false por true
            }
        }
        return hasUpperCase && hasDigit; // Para comprobar que cumple ambas condiciones hay que poner un AND en vez de un OR
    }
}