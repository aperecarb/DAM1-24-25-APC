/* Álvaro Pereira Carballo */

package ud5.apcexamen;

import java.util.Arrays;

public class Host implements Comparable<Host> {
    // Definimos las variables
    public String nombre;
    public String mac;
    public String ip;
    public String mascara;
    public String puerta;
    public String servidores;

    // Definimos el constructor
    public Host (String nombre, String ip, String mac) {
        // En caso de ser inválido lanzamos excepción
        if (nombre == null || !validarMAC(mac)) {
            throw new IllegalArgumentException("Host inválido.");
        }

        // Permitimos introducir una IP con valor null
        if (ip == null || validarIP(ip)) {
            this.ip = ip;
        } else {
            throw new IllegalArgumentException("Dirección IP inválida");
        }

        this.nombre = nombre;
        this.mac = mac;
        // Todos los hosts de la red comparten los siguientes parámetros de red
        this.mascara = "255.255.0.0";
        this.puerta = "192.168.0.11";
        this.servidores = "192.168.0.9";
    }

    // Redefinimos el método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Host host = (Host) obj;

        // Hacemos que compare correctamente independientemente del formato que tengan mientras este sea válido
        return this.mac.replaceAll("[:-]", "").equalsIgnoreCase(host.mac.replaceAll("[:-]", ""));
    }

    // Redefinimos toString para que muestre los datos como queremos
    @Override
    public String toString() {
        return nombre + " (" + ip + " / " + mac + ")";
    }

    // Redefinimos el método compareTo
    @Override
    public int compareTo(Host bHost) {
        return this.nombre.compareTo(bHost.nombre);
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103};
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
