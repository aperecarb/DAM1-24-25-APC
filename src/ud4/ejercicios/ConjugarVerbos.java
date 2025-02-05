package ud4.ejercicios;

public class ConjugarVerbos {
    public static String[] conjugarPresente(String verbo) {
        if (verbo == null || verbo.length() == 0) {
            return null;
        }

        String raiz;
        String terminacion = verbo.substring(verbo.length() - 2);

        if (terminacion.equals("ar")) {
            raiz = verbo.substring(0, verbo.length() - 2);
            return new String[]{
                "Yo " + raiz + "o",
                "Tú " + raiz + "as",
                "Él/Ella " + raiz + "a",
                "Nosotros/-as " + raiz + "amos",
                "Vosotros/-as " + raiz + "áis",
                "Ellos/Ellas " + raiz + "an"
            };
        } else if (terminacion.equals("er")) {
            raiz = verbo.substring(0, verbo.length() - 2);
            return new String[]{
                "Yo " + raiz + "o",
                "Tú " + raiz + "es",
                "Él/Ella " + raiz + "e",
                "Nosotros/-as " + raiz + "emos",
                "Vosotros/-as " + raiz + "éis",
                "Ellos/Ellas " + raiz + "en"
            };
        } else if (terminacion.equals("ir")) {
            raiz = verbo.substring(0, verbo.length() - 2);
            return new String[]{
                "Yo " + raiz + "o",
                "Tú " + raiz + "es",
                "Él/Ella " + raiz + "e",
                "Nosotros/-as " + raiz + "imos",
                "Vosotros/-as " + raiz + "ís",
                "Ellos/Ellas " + raiz + "en"
            };
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        String[] conjugacion = conjugarPresente("vivir");
        if (conjugacion != null) {
            for (String forma : conjugacion) {
                System.out.println(forma);
            }
        } else {
            System.out.println("Verbo no válido");
        }
    }
}