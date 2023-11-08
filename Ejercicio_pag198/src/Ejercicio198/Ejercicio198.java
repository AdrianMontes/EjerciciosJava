package Ejercicio198;

public class Ejercicio198 {
	
	static int numero = 0;

	public static void main(String[] args) {
		System.out.println(numero);
		incrementar();
		System.out.println(numero);
		decrementar();
		System.out.println(numero);
	}
	
	private static void incrementar() {
		numero++;
	}
	
	private static void decrementar() {
		numero--;
		numero--;
	}
}
