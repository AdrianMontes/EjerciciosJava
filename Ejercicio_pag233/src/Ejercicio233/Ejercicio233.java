package Ejercicio233;

import java.util.Scanner;

public class Ejercicio233 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		boolean random = ((int) (Math.random() * 2)) == 0;
		
		if (random) {
			System.out.println("rojo");
		}
		if (!random) {
			System.out.println("negro");
		}
		
		if (random) {
			System.out.println("rojo");
		} else {
			System.out.println("negro");
		}
		
		System.out.println(random ? "rojo" : "negro");
		
		System.out.println("\n***Ejercicio 2***");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una temperatura");
		float grados = sc.nextFloat();
		
		if (grados < 10) {
			System.out.print("Clima frio: ");
			
			if (grados < 5) {
				System.out.print("Polar");
			} else {
				System.out.print("Alta montaña");
			}
		} else if (grados >= 10 && grados < 20) {
			System.out.print("Clima templado: ");
			
			if (grados < 13.5) {
				System.out.print("Oceanico");
			} else if (grados >= 13.5 && grados < 16.5) {
				System.out.print("Mediterraneo");
			} else if (grados >= 16.5) {
				System.out.print("Continental");
			}
		} else if (grados >= 20) {
			System.out.print("Clima calido: ");
			
			if (grados < 23.5) {
				System.out.print("Ecuatorial");
			} else if (grados >= 23.5 && grados < 26.5) {
				System.out.print("Tropical");
			} else if (grados >= 26.5) {
				System.out.print("Desertico");
			}
		}
	}

}
