package ud3.apuntes;

public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0;
    }

    public boolean sacarDinero(double importe) {
        if (saldo > 0 && saldo >= importe) {
            saldo -= importe;
            return true;
        }
        return false;
    }

    public boolean ingresarDinero(double importe) {
        if (importe > 0) {
            saldo += importe;
            return true;
        }
        return false;
    }

    public void mostrarInfo() {
        System.out.println("Información de la cuenta: ");
        System.out.println("Nombre :" + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}