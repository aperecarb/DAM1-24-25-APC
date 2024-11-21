/* Álvaro Pereira Carballo */

package ud2.apcexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Chicles {
    public static int totalChicles(int comprados, int envoltoriosAEntregar, int chiclesRegalados) {
        /* Primero se validan las entradas */
        if (comprados < 0 || envoltoriosAEntregar < 0 || chiclesRegalados < 0 || chiclesRegalados >= envoltoriosAEntregar) {
            return -1;
        }

        /* A continuación se definen variables */
        int total = comprados;
        int envoltorios = comprados;

        /* Ahora se calculan los chicles comprados más los conseguidos con envoltorios */
        if (chiclesRegalados == 0 && envoltoriosAEntregar == 0) {
            int chiclesGratuitos = 0;
        } else {
            while (envoltorios >= envoltoriosAEntregar) {
                int chiclesGratuitos = (envoltorios / envoltoriosAEntregar) * chiclesRegalados;
                
                total += chiclesGratuitos;
    
                envoltorios = (envoltorios % envoltoriosAEntregar) + chiclesGratuitos;
            }
        }
        return total;
    }
}