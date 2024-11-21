/* Álvaro Pereira Carballo */

package ud2.apcexamen;

public class Bombillas {
    public static String causaFinBombilla(int maxHoras, int maxEncendidos, int horasPorEncendido) {
        /* Primero se validan las entradas */
        if (maxHoras <= 0 || maxEncendidos <= 0 || horasPorEncendido <= 0 || horasPorEncendido > 10) {
            return "ERROR";
        }

        /* Ahora se calcula el total máximo de encendidos por horas */
        int totalHorasEncendido = maxEncendidos * horasPorEncendido;

        /* Asignamos los resultados */
        if (totalHorasEncendido >= maxHoras && maxEncendidos >= maxHoras % totalHorasEncendido) {
            return "ENCENDIDOS + HORAS";
        } else if (totalHorasEncendido >= maxHoras) {
            return "HORAS";
        } else if (maxEncendidos >= maxHoras % horasPorEncendido) {
            return "ENCENDIDOS";
        } else {
            return "HORAS";
        }
    }
}