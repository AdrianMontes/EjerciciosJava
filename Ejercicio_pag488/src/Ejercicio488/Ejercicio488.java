package Ejercicio488;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio488 {

	public static void main(String[] args) {
		System.out.println("***Ejercicio 1***");
		try {
			Scanner scInt = new Scanner(System.in);
			System.out.print("Introduce un int: ");
			int i = scInt.nextInt();
			System.out.println("\nDato introducido: " + i + "\n\n");
			scInt.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("No has introducido un numero entero\n");
		}
		
		try {
			Scanner scFloat = new Scanner(System.in);
			System.out.print("Introduce un float: ");
			float f = scFloat.nextFloat();
			scFloat.nextLine();
			System.out.println("\nDato introducido: " + f + "\n\n");
		} catch (InputMismatchException e) {
			System.out.println("No has introducido un numero real\n");
		}
		
		try {
			Scanner scString = new Scanner(System.in);
			System.out.print("Introduce un string: ");
			String s = scString.nextLine();
			System.out.println("\nDato introducido: " + s + "\n\n");
		} catch (InputMismatchException e) {
			System.out.println("No has introducido una cadena\n");
		}
		
		try {
			Scanner scBool = new Scanner(System.in);
			System.out.print("Introduce un bool: ");
			boolean b = scBool.nextBoolean();
			System.out.println("\nDato introducido: " + b);
		} catch (InputMismatchException e) {
			System.out.println("No has introducido ni true ni false\n");
		}
		
		System.out.println("***Ejercicio 2***");
		try {
			int[] datos = {1, 2, 3};
			//datos[6] = 6;
			throw new ArrayIndexOutOfBoundsException("Desbordamiento de datos");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n***Ejercicio 3***");
		float input = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Introduce un float: ");
			input = sc.nextFloat();
		} catch (InputMismatchException e) {
			sc.useLocale(Locale.ENGLISH);
			input = sc.nextFloat();
		} finally {
			System.out.println("Real introducido: " + input);
			sc.close();
		}
	}
}
