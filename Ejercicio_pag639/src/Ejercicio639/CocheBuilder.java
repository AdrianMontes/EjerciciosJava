package Ejercicio639;

public interface CocheBuilder {
	void ConstruirMarca(String marca);
	void ConstruirModelo(String modelo);
	void ConstruirCaballos(int caballos);
	void ConstruirMotor(int motor);
	Coche ObtenerCoche();
}
