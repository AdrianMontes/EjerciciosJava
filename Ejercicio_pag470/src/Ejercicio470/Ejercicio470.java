package Ejercicio470;

import java.util.Scanner;

public class Ejercicio470 {
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		System.out.print("Introduce un int: ");
		int i = scInt.nextInt();
		scInt.nextLine();
		
		System.out.println("\nDato introducido: " + i + "\n\n");
		Scanner scFloat = new Scanner(System.in);
		System.out.print("Introduce un float: ");
		float f = scFloat.nextFloat();
		scFloat.nextLine();
		
		System.out.println("\nDato introducido: " + f + "\n\n");
		Scanner scString = new Scanner(System.in);
		System.out.print("Introduce un string: ");
		String s = scString.nextLine();
		
		System.out.println("\nDato introducido: " + s + "\n\n");
		Scanner scBool = new Scanner(System.in);
		System.out.print("Introduce un bool: ");
		boolean b = scBool.nextBoolean();
		
		System.out.println("\nDato introducido: " + b);
	}
}
