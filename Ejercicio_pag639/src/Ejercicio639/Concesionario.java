package Ejercicio639;

public class Concesionario {
	private CocheBuilder cocheBuilder;
	
	public Concesionario(CocheBuilder builder) {
		this.cocheBuilder = builder;
	}
	
	public void ConstruirCoche() {
		cocheBuilder.ConstruirMarca(null);
		cocheBuilder.ConstruirModelo(null);
		cocheBuilder.ConstruirCaballos(0);
		cocheBuilder.ConstruirMotor(0);
	}
	
	public Coche ObtenerCoche() {
		return cocheBuilder.ObtenerCoche();
	}
}
