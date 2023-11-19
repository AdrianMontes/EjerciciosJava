package Ejercicio639;

public class CocheConcretoBuilder implements CocheBuilder {
	private Coche coche = new Coche();

	@Override
	public void ConstruirMarca(String marca) {
		coche.setMarca(marca);
	}

	@Override
	public void ConstruirModelo(String modelo) {
		coche.setModelo(modelo);
	}

	@Override
	public void ConstruirCaballos(int caballos) {
		coche.setCaballos(caballos);
	}

	@Override
	public void ConstruirMotor(int motor) {
		coche.setMotor(motor);
	}

	@Override
	public Coche ObtenerCoche() {
		return coche;
	}
}
