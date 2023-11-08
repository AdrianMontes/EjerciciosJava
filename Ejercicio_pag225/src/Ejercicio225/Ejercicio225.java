package Ejercicio225;

import java.util.Scanner;

public class Ejercicio225 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero:");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		boolean resultado1 = ((numero % 2 == 0)) ? true : false;
		if (resultado1 == true) {
			System.out.println("El numero que has introducido es par");
		} else {
			System.out.println("El numero que has introducido es impar");
		}
		
		int random = (int) (Math.random() * 2);
		boolean resultado = random == 0;
		if (resultado == true) {
			System.out.println("blanco");
		} else {
			System.out.println("negro");
		}
	}
}
