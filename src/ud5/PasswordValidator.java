package ud5;

public class PasswordValidator {
    public static boolean isValid(String password) {
        if (password.length() <= 8) { // Para que acepte contraseñas de 8 caracteres habría que quitar el =
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) { // Esto debería ser isUpperCase, no isLowerCase
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = false; // Esto debería ser true, no false
            }
        }
        return hasUpperCase || hasDigit; // Esto debería ser un AND, no un OR
    }
}