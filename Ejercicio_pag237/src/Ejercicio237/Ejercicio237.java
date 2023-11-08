package Ejercicio237;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio237 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		System.out.println("Introduce un limite: ");
		Scanner sc = new Scanner(System.in);
		int ejercicio1 = sc.nextInt();
		for (int i = 0; i < ejercicio1 + 1; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n***Ejercicio 2***");
		System.out.println("Introduce un limite: ");
		int ejercicio2 = sc.nextInt();
		int[] ejercicio2Array = new int[ejercicio2];
		for (int i = 0; i < ejercicio2; i++) {
			ejercicio2Array[i] = i + 1;
			
			if (ejercicio2Array[i] % 3 == 0) {
				System.out.print(ejercicio2Array[i] + " ");
			}
		}
		
		System.out.println("\n***Ejercicio 3***");
		System.out.println("Introduce la cantidad de saludos: ");
		int ejercicio3 = sc.nextInt();
		int ind = 0;
		do {
			System.out.println(DevolverSaludo());
			ind++;
		} while (ind < ejercicio3 + 1);
		
		System.out.println("\n***Ejercicio 4***");
		String abecedarioInverso = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		String copiaAbecedario = "";
		String abecedario = "";
		//Quitando el abecedario inverso
		for (int i = 0; i < abecedarioInverso.length(); i++) {
			System.out.println(abecedarioInverso.substring(i));
			copiaAbecedario += abecedarioInverso.charAt(i);
		}
		//Ordenando el abecedario
		for (int i = abecedarioInverso.length() - 1; i >= 0; i--) {
			abecedario += copiaAbecedario.charAt(i);
		}
		//Mostrando el abecedario correctamente
		for (int i = 0; i < abecedario.length(); i++) {
			System.out.println(abecedario.substring(0, i));
		}
	}

	private static String DevolverSaludo() {
		String mensaje = "";
		Random generarRandom = new Random();
		int random = generarRandom.nextInt(5) + 1;
		switch (random) {
			case 1:
				mensaje = "Hola!";
				break;
			case 2:
				mensaje = "Buenos dias!";
				break;
			case 3:
				mensaje = "Heyyy!";
				break;
			case 4:
				mensaje = "Saludos!";
				break;
			case 5:
				mensaje = "Konichiwa!";
				break;
			default:
				mensaje = "Hola!";
				break;
		}
		
		return mensaje;
	}
}
