package ud5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid1() {
        assertTrue(PasswordValidator.isValid("Passw0rd"));
    }

    @Test
    void testIsValid2() {
        assertFalse(PasswordValidator.isValid("Passw0"));
    }

    @Test
    void testIsValid3() {
        assertFalse(PasswordValidator.isValid("passw0rd"));
    }

    @Test
    void testIsValid4() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    void testIsValid5() {
        assertFalse(PasswordValidator.isValid("password"));
    }
}
