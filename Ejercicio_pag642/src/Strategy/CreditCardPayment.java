package Strategy;

public class CreditCardPayment implements PaymentStrategy {
	private String numeroCuenta;

    public CreditCardPayment(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public void Pagar(int cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta de crédito " + numeroCuenta);
    }
}
