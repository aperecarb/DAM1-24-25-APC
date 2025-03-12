package ud5;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    @Test
    void testIsValid1() {
        assertTrue(PasswordValidator.isValid("Manolo123"));
    }

    @Test
    void testIsValid2() {
        assertFalse(PasswordValidator.isValid("hola"));
    }

    @Test
    void testIsValid3() {
        assertFalse(PasswordValidator.isValid("12345678"));
    }

    @Test
    void testIsValid4() {
        assertFalse(PasswordValidator.isValid("abcdefgh"));
    }

    @Test
    void testIsValid5() {
        assertFalse(PasswordValidator.isValid("abcdefg1"));
    }

    @Test
    void testIsValid6() {
        assertFalse(PasswordValidator.isValid("Abcdefgh"));
    }
}
