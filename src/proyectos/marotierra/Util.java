package proyectos.marotierra;

/**
 * Clase de utilidades.
 */
public class Util {
    /**
     * Lee el contenido de una URL.
     * @param url URL a leer.
     * @return Contenido de la URL.
     */
    public static String leerUrl(String url) {
        String contenido = "";

        // Configuración del proxy del sistema
        System.setProperty("java.net.useSystemProxies", "true");        

        try {
            @SuppressWarnings("deprecation")
            java.net.URL urlObjeto = new java.net.URL(url);
            java.net.URLConnection conexion = urlObjeto.openConnection();
            conexion.setRequestProperty("Accept-Language", "es");
            java.io.BufferedReader lector = new java.io.BufferedReader(
                    new java.io.InputStreamReader(conexion.getInputStream()));

            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido += linea + "\n";
            }
            lector.close();
        } catch (java.net.MalformedURLException e) {
            System.out.println("URL mal formada: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
        return contenido;
    }

}
