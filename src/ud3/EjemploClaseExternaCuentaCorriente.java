package ud3;

import ud3.apuntes.CuentaCorriente;

public class EjemploClaseExternaCuentaCorriente {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente("55555555Z", "Pepe");
        CuentaCorriente cc2 = new CuentaCorriente("33333333R", "María");

        cc.mostrarInfo();
        cc2.mostrarInfo();
        cc.ingresarDinero(3000);
        cc2.ingresarDinero(4000);
        cc.mostrarInfo();
        cc2.mostrarInfo();
    }
}
