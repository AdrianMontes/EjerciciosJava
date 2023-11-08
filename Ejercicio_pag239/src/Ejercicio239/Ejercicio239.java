package Ejercicio239;

public class Ejercicio239 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i + 1);
		}
		System.out.println("Fuera del bucle");
		System.out.println("\n***Ejercicio 2***");
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			} else {
				System.out.println((i + 1) + " iteracion");
			}
		}
	}

}
