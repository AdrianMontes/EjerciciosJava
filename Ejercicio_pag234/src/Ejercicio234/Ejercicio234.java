package Ejercicio234;

import java.util.Scanner;

public class Ejercicio234 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 3***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		
		switch(numero) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			default:
				System.out.println("No has introducido un numero del 1 al 9.");
				break;
		}
		
		System.out.println("\n***Ejercicio 4***");
		System.out.println("Introduce otro numero: ");
		int number = sc.nextInt();
		
		System.out.println((number > 0) ? "¡Es positivo!" : (number < 0) ? "¡Es negativo!" : "¡Es cero, na de ná!");
	}

}
