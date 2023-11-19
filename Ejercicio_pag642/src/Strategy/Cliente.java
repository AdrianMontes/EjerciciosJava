package Strategy;

public class Cliente {
	
	/*
	 * Comportamiento
	 * Strategy define una familia de algoritmos, encapsula
	 * cada uno de ellos y los intercambia
	 */
	public static void main(String[] args) {
		PaymentStrategy creditCard = new CreditCardPayment("2234-9432-3324-6744");
        PaymentStrategy payPal = new PagoPayPal("adrianceroca@gmail.com");

        Carrito cart = new Carrito();
        cart.SetPaymentStrategy(creditCard);

        cart.Checkout(100);

        cart.SetPaymentStrategy(payPal);
        cart.Checkout(50);
	}

}
