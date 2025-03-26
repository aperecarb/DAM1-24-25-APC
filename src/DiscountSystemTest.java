import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/* Álvaro Pereira Carballo */
public class DiscountSystemTest {
    @Test
    void testApplyDiscount() {
        assertEquals(25, DiscountSystem.applyDiscount(25, false), 0.01);
    }

    @Test
    void testApplyDiscount2() {
        assertEquals(47.5, DiscountSystem.applyDiscount(50, false), 0.01);
    }

    @Test
    void testApplyDiscount3() {
        assertEquals(90, DiscountSystem.applyDiscount(100, true), 0.01);
    }

    @Test
    void testApplyDiscount4() {
        assertEquals(191.25, DiscountSystem.applyDiscount(225, true), 0.01);
    }
}