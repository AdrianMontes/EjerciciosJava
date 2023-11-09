package Ejercicio378;

public class Ejercicio378 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		String[] technologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
		Ejercicio1(technologies, 0);
		
		System.out.println("\n***Ejercicio 2***");
		Ejercicio2(technologies, 0);
		
		System.out.println("\n***Ejercicio 3***");
		Ejercicio3(0);
		
		System.out.println("\n***Ejercicio 4***");
		String texto = "supercalifragilisticoespialidoso";
		Ejercicio4(texto, texto.length() - 1);
		
		System.out.println("\n***Ejercicio5***");
		Ejercicio5(5, 7);
	}
	
	private static void Ejercicio1(String[] tech, int i) {
		System.out.println(tech[i]);
		
		if (i < tech.length - 1) {
			Ejercicio1(tech, i+1);
		}
	}
	
	private static void Ejercicio2(String[] tech, int i) {
		System.out.println(tech[i]);
		
		if (tech[i] != "HTML") {
			Ejercicio2(tech, i+1);
		}
	}
	
	private static void Ejercicio3(int num) {
		if (Fibonacci(num) < 50) {
			System.out.println(Fibonacci(num));
			Ejercicio3(num + 1);
		} else {
			System.out.println(Fibonacci(num));
		}
	}
	
	private static int Fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return Fibonacci(num - 2) + Fibonacci(num - 1);
		}
	}
	
	private static void Ejercicio4(String texto, int caracterActual) {
		System.out.print(texto.charAt(caracterActual));
		if (caracterActual > 0) {
			Ejercicio4(texto, caracterActual - 1);
		}
	}
	
	private static void Ejercicio5(int num1, int num2) {
		System.out.println(num1 + num2);
		if ((num1 + num2) < 100) {
			Ejercicio5(num1 + 3, num2 + 1);
		}
	}
}
