package Strategy;

public class Carrito {
	PaymentStrategy paymentStrategy;
	
	public void SetPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void Checkout(int cantidad) {
        paymentStrategy.Pagar(cantidad);
    }
}
