/* Álvaro Pereira Carballo */

package ud2.apcexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Chicles {
    public static int totalChicles(int comprados, int envoltoriosAEntregar, int chiclesRegalados) {
        /* Primero se validan las entradas */
        if (comprados < 0 || envoltoriosAEntregar < 0 || chiclesRegalados < 0) {
            return -1;
        }

        if (envoltoriosAEntregar == 0) {
            return comprados;
        }

        if (chiclesRegalados >= envoltoriosAEntregar) {
            return -1;
        }        

        /* A continuación se definen variables */
        int total = comprados;
        int envoltorios = comprados;

        /* Ahora se calculan los chicles comprados más los conseguidos con envoltorios */
        while (envoltorios >= envoltoriosAEntregar) {
            int chiclesGratuitos = (envoltorios / envoltoriosAEntregar) * chiclesRegalados;

            total += chiclesGratuitos;

            envoltorios = (envoltorios % envoltoriosAEntregar) + chiclesGratuitos;
        }
        return total;
    }

    @Test
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(-1, 2, 1));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));
        assertEquals(-1, totalChicles(-5, 0, 1));
    }
}