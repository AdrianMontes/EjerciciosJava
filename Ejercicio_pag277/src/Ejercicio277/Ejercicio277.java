package Ejercicio277;

import java.util.Scanner;
import java.util.Vector;

public class Ejercicio277 {

	public static void main(String[] args) {
		Vector<String> banderasNombre = new Vector<String>(20);
		Vector<String> banderasFormato = new Vector<String>(20);
		Vector<String> coloresNombre = new Vector<String>(20);
		Vector<String> coloresFormato = new Vector<String>(20);
		
		coloresNombre.add("Rojo");
		coloresFormato.add("\033[41m");
		coloresNombre.add("Azul");
		coloresFormato.add("\033[44m");
		coloresNombre.add("Verde");
		coloresFormato.add("\033[42m");
		coloresNombre.add("Amarillo");
		coloresFormato.add("\033[43m");
		coloresNombre.add("Negro");
		coloresFormato.add("\033[40m");
		coloresNombre.add("Blanco");
		coloresFormato.add("\033[47m");
		
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int opcionMenu = 0;
		do {
			System.out.println("***Bienvenido a la creacion de banderas***");
			System.out.println("Elige una opcion:");
			System.out.println("1.- Crear bandera");
			System.out.println("2.- Mostrar banderas");
			System.out.println("3.- Crear un color");
			System.out.println("0.- Salir");
			opcionMenu = scInt.nextInt();
			System.out.println("");
			switch (opcionMenu) {
			case 1:
				String banderaActual = "";
				int opcionColor = 0;
				do {
					boolean colorExists = false;
					do {
						System.out.println("\nElige un color (0 = salir): ");
						for (int i = 0; i < coloresNombre.size(); i++) {
							System.out.println(coloresFormato.get(i) + (i + 1) + ".- " + coloresNombre.get(i) + "\033[0m");
						}
						
						opcionColor = scInt.nextInt();
						
						if (opcionColor > coloresNombre.size()) {
					        System.out.println("El color que has introducido no existe");
					    } else {
					    	opcionColor--;
					        colorExists = true;
					    }
					} while (!colorExists);
					int ancho = 0;
					System.out.print("Elige la cantidad de pixeles en ancho: ");
					ancho = scInt.nextInt();
					
					if (opcionColor != -1) {
						banderaActual += coloresFormato.get(opcionColor);
						for (int i = 0; i < ancho; i++) {
							banderaActual += "\s";
						}
						banderaActual += "\033[0m";
						
						System.out.println("\n" + banderaActual + "\n");
						
						int opcionSaltarLinea = 0;
						System.out.println("Quieres pasar a la siguiente linea? 1 = Si");
						opcionSaltarLinea = scInt.nextInt();
						if (opcionSaltarLinea == 1) {
							banderaActual += "\n";
						}
					}
					
					opcionColor++;
				} while (opcionColor > 0);
				
				String nombreActual = "";
				System.out.print("Dale un nombre a tu bandera: ");
				nombreActual = scString.nextLine();
				nombreActual = "\033[1m\033[4m" + nombreActual + "\033[0m";
				
				banderasNombre.add(nombreActual);
				banderasFormato.add(banderaActual);
				break;
				
			case 2:
				for (int i = 0; i < banderasNombre.size(); i++) {
					System.out.println((i + 1) + ".- " + banderasNombre.get(i));
					System.out.println(banderasFormato.get(i));
					System.out.println("\n");
				}
				break;
				
			case 3:
				String color = "";
				System.out.print("Escribe el codigo del nuevo color: ");
				color = scString.nextLine();
				color = "\033[" + color + "m";
				System.out.println("\n Así se ve tu nuevo color: \n");
				System.out.println(color + "      \033[0m");
				System.out.println(color + "      \033[0m");
				System.out.println(color + "      \033[0m");
				
				String nombre = "";
				System.out.print("Escribe un nombre para tu color: ");
				nombre = scString.nextLine();
				
				coloresNombre.add(nombre);
				coloresFormato.add(color);
				break;
				
			case 0:
				System.out.println("Saliendo del programa");
				break;
				
			default:
				System.out.println("No has elegido una opcion correcta");
				break;
			}
			System.out.println("\n");
		} while(opcionMenu != 0);
	}

}
