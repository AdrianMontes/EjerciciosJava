package Ejercicio639;

public class Ejercicio639 {

	public static void main(String[] args) {
		CocheBuilder builder = new CocheConcretoBuilder();
		Concesionario concesionario = new Concesionario(builder);
		
		concesionario.ConstruirCoche();
		Coche coche1 = concesionario.ObtenerCoche();
		coche1.setCaballos(20);
		System.out.println(coche1.toString());
		
		concesionario.ConstruirCoche();
		Coche coche2 = concesionario.ObtenerCoche();
		coche2.setCaballos(30);
		coche2.setMotor(40);
		System.out.println(coche2.toString());

		concesionario.ConstruirCoche();
		Coche coche3 = concesionario.ObtenerCoche();
		coche3.setCaballos(80);
		coche3.setMotor(70);
		coche3.setModelo("Nissan");
		System.out.println(coche3.toString());
	}

}
