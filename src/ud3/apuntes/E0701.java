package ud3.apuntes;

public class E0701 {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("12345678Ñ", "Manolo");

        System.out.println(cc.ingresarDinero(300));

        cc.mostrarInfo();

        System.out.println(cc.sacarDinero(200));

        cc.mostrarInfo();
    }
}
