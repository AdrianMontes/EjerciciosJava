package Ejercicio437;

public class Empleado extends Persona {
	private String tipoContrado;
	private int sueldo;
	
	public void CalcularSueldo(int pago) {
		this.sueldo += pago;
	}
}
