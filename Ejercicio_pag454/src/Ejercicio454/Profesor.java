package Ejercicio454;

public class Profesor implements IPersona {
	private String nombre;
	private int salario;
	
	public Profesor() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
