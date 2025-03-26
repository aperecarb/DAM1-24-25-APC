/* Álvaro Pereira carballo */

package ud5.apcexamen;

import java.util.Arrays;
import java.util.Comparator;

enum SO {WINDOWS, LINUX, MAC, ANDROID, IOS}

public class Cliente extends Host {
    // Definimos las variables
    public SO sistemaOperativo;
    public String resolucion;

    // Definimos el constructor
    public Cliente(String nombre, String ip, String mac, SO sistemaOperativo, String resolucion) {
        // Invocamos al constructor de la clase Host
        super(nombre, ip, mac);
        this.sistemaOperativo = sistemaOperativo;
        this.resolucion = resolucion;
    }

    // Definimos getters para ordenar
    public SO getSistemaOperativo() {
        return sistemaOperativo;
    }

    // Definimos un método que calcule los píxeles totales de la pantalla en base a su resolución
    public int pixelesTotales() {
        String[] dimensiones = resolucion.split("x");
        
        return Integer.parseInt(dimensiones[0]) * Integer.parseInt(dimensiones[1]);
    }

    // Redefinimos toString para que muestre los datos como queremos
    @Override
    public String toString() {
        return nombre + " (" + sistemaOperativo + " " + resolucion + ")";
    }

    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");        
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        // Ordenamos alfabéticamente por SO
        Arrays.sort(clientes, Comparator.comparing(Cliente::getSistemaOperativo));
        // Mostramos el array ordenado
        System.out.println("\nClientes ordenados por SO");
        System.out.println("=========================\n");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Ordenamos por tamaño de píxeles totales en orden invertido
        Arrays.sort(clientes, Comparator.comparing(Cliente::pixelesTotales).reversed());
        // Mostramos el array ordenado
        System.out.println("\nClientes ordenados por Resolución");
        System.out.println("===================================\n");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
