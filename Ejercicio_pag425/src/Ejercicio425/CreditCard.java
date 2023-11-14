package Ejercicio425;

public class CreditCard {
	private String titular;
	private int numero;
	private String entidadEmisora;
	private int fechaCaducidad;
	private int saldo;
	private boolean activa;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String titular, int numero, String entidadEmisora, int fechaCaducidad) {
		this.titular = titular;
		this.numero = numero;
		this.entidadEmisora = entidadEmisora;
		this.fechaCaducidad = fechaCaducidad;
		this.saldo = 1000;
		this.activa = true;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEntidadEmisora() {
		return entidadEmisora;
	}

	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}

	public int getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(int fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	
	public void Activar() {
		this.activa = true;
	}
	
	public void Pagar(int precio) {
		if (this.activa) {
			if (this.saldo - precio >= 0) {
				this.saldo -= precio;
				System.out.println("Pago realizado con exito. Saldo actual: " + this.saldo);
			} else {
				System.out.println("No tienes suficiente saldo (" + this.saldo + ")");
			}
			
			if (this.saldo < 0) {
				this.saldo = 0;
			}
		} else {
			System.out.println("No tienes tu tarjeta activa");
		}
	}
	
	public void Anular() {
		this.activa = false;
	}
}
