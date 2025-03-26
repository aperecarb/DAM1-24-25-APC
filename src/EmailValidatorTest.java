import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/* Álvaro Pereira Carballo */
public class EmailValidatorTest {
    @Test
    void testIsValid1() {
        assertTrue(EmailValidator.isValid("ManoloPerez@gmail.com"));
    }

    @Test
    void testIsValid2() {
        assertFalse(EmailValidator.isValid(null));
    }

    @Test
    void testIsValid3() {
        assertFalse(EmailValidator.isValid("ManoloPerezgmail.com"));
    }

    @Test
    void testIsValid4() {
        assertFalse(EmailValidator.isValid("Manolo@Perez@gmail.com"));
    }

    @Test
    void testIsValid5() {
        assertFalse(EmailValidator.isValid("@gmail.com"));
    }
}