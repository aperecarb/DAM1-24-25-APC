package ud5.herenciaejercicios;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(50, 30, 20, Caja.Unidad.cm);
        caja.setEtiqueta("Envío frágil");
        System.out.println(caja);

        CajaCarton cajaCarton = new CajaCarton(50, 30, 20);
        cajaCarton.setEtiqueta("Documentos");
        System.out.println(cajaCarton);
    }
}
