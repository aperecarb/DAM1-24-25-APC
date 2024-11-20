/*  */

package ud2.propuestos.bucles;

public class EP0323_NumerosEnTexto {
    public static void main(String[] args) {
        for(int numero = 1; numero < 100; numero++){
        System.out.printf("\n%d. %s", numero, convertirNumeroATexto(numero));
        }
    }

    public static String convertirNumeroATexto(int numero) {
        String[] unidades = { "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve" };
        String[] decenas = { "", "", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
                "noventa" };

        if (numero < 20) {
            return unidades[numero];
        } else if (numero < 30) {
            if (numero == 20) {
                return "veinte";
            } else {
                return "veinti" + unidades[numero - 20];
            }
        } else {
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad == 0) {
                return decenas[decena];
            } else {
                return decenas[decena] + " y " + unidades[unidad];
            }
        }
    }
}
