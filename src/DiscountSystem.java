public class DiscountSystem {
    public static double applyDiscount(double amount, boolean isLoyalCustomer) {
        if (amount < 0) {
            throw new IllegalArgumentException("O importe non pode ser negativo");
        }

        double discount = 0.0;

        if (amount >= 50 && amount < 100) { // Cambiado el "<= 100" por "< 100" para que no aplique el 5% de descuento cuando el importe sea 100
            discount = 0.05;
        } else if (amount >= 100) { // Cambiado el "< 100" por "<= 100" para que el 10% de descuento se aplique cuando el importe sea 100
            discount = 0.10;
        }

        if (isLoyalCustomer && amount >= 200) {
            discount += 0.05; // Cambiado el "-=" por "+=" para añadir el descuento en vez de restarlo
        }

        double finalAmount = amount - (amount * discount);

        return finalAmount;
    }
}