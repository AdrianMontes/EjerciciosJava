package Ejercicio454;

public interface IPersona {
	public static final String NOMBRE = "Adrian";
	public default String GetNombre() {
		return NOMBRE;
	}
	
	public default void SetNombre(String nombre) {
		
	}
}
