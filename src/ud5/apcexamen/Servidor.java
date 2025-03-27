/* Álvaro Pereira Carballo */

package ud5.apcexamen;

import ud5.apcexamen.Cliente.SO;

public class Servidor extends Host {
    public String servicio;
    public int puerto;
    public String protocolo;

    // Definimos el constructor
    public Servidor(String nombre, String ip, String mac) {
        // Invocamos al constructor de la clase Host
        super(nombre, ip, mac);
    }

    

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");        

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

    }
}
