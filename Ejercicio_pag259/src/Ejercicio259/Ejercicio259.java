package Ejercicio259;

import java.util.Random;

public class Ejercicio259 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		System.out.println(JavaOrNull("java"));
		System.out.println(JavaOrNull("hola"));
		
		System.out.println("\n***Ejercicio 2***");
		System.out.println(Login("adrian", "8888"));
		System.out.println(Login("admin", "8888"));
		System.out.println(Login("adrian", "1234"));
		System.out.println(Login("admin", "1234"));
		
		System.out.println("\n***Ejercicio 3***");
		System.out.println(NumeroPar());
	}
	
	private static String JavaOrNull(String texto) {
		String resultado;
		
		if (texto.toLowerCase() == "java") {
			resultado = "java";
		} else {
			resultado = "null";
		}
		
		return resultado;
	}
	
	private static String Login(String usuario, String contrasena) {
		if (usuario == "admin" && contrasena == "1234") {
			return "Login true";
		}
		
		return "Login false";
	}
	
	private static boolean NumeroPar() {
		Random generadorAleatorio = new Random();
        int numeroAleatorio = generadorAleatorio.nextInt(100) + 1;
		
		if (numeroAleatorio % 2 == 0) {
			return true;
		}
		return false;
	}
}
