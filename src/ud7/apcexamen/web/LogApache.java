/* Álvaro Pereira Carballo */

package ud7.apcexamen.web;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogApache {
    public static final String LOG_FILE_NAME = "bacharelato_access.log";

    public static void main(String[] args) {
        // Contamos el total de accesos y el total de incorrectos
        int totalAccesos = 0;
        int totalIncorrectos = 0;

        // Creamos un mapa para contar cuantas veces sale cada IP
        Map<String, Integer> contadorIP = new HashMap();

        // Creamos el patrón
        Pattern logPattern = Pattern.compile("^(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}).*?\"\\s(\\d{3})\\s");

        // Leemos el log
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                totalAccesos++;

                Matcher matcher = logPattern.matcher(line);
                if (matcher.find()) {
                    String ipAddress = matcher.group(1);
                    String statusCode = matcher.group(2);

                    // Contamos e incrementamos
                    if ("404".equals(statusCode)) {
                        totalIncorrectos++;
                    }

                    // Contamos las ocurrencias de cada IP
                    contadorIP.put(ipAddress, contadorIP.getOrDefault(ipAddress, 0) + 1);
                } else {
                    System.err.println("Advertencia: Línea no reconocida o con formato inesperado: " + line);
                }
            }
        }

        
    }
}