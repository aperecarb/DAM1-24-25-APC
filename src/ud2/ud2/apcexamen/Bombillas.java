/* Álvaro Pereira Carballo */

package ud2.apcexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Bombillas {
    public static String causaFinBombilla(int maxHoras, int maxEncendidos, int horasPorEncendido) {
        /* Primero se validan las entradas */
        if (maxHoras <= 0 || maxEncendidos <= 0 || horasPorEncendido <= 0 || horasPorEncendido > 10) {
            return "ERROR";
        }

        /* Ahora se calcula el total máximo de encendidos por horas */
        int totalHorasEncendido = maxEncendidos * horasPorEncendido;

        /* Asignamos los resultados */
        if (totalHorasEncendido > maxHoras) {
            return "HORAS";
        } else if (totalHorasEncendido < maxHoras) {
            return "ENCENDIDOS";
        } else {
            return "ENCENDIDOS + HORAS";
        }
    }

    @Test
public void causaFinBombillaTest() {
assertEquals("ERROR", causaFinBombilla(100, 100, 100));
assertEquals("ERROR", causaFinBombilla(1000, -10, 10)); 
assertEquals("ERROR", causaFinBombilla(0, 10, 10));
assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
}
}