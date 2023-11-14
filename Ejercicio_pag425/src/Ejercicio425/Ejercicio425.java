package Ejercicio425;

public class Ejercicio425 {

	public static void main(String[] args) {
		CreditCard tarjeta = new CreditCard("Adrian", 57788, "NBank", 20300606);
		
		tarjeta.Pagar(100);
		
		tarjeta.setSaldo(50);
		tarjeta.Pagar(100);
		
		tarjeta.setSaldo(1000);
		tarjeta.Anular();
		tarjeta.Pagar(1);
	}
}
