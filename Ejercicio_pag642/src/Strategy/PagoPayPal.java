package Strategy;

public class PagoPayPal implements PaymentStrategy {
	private String email;
	
	public PagoPayPal(String email) {
		this.email = email;
	}
	
	public void Pagar(int cantidad) {
        System.out.println("Pagando " + cantidad + " a " + email);
	}
}
