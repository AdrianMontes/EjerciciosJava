package Ejercicio543;

import javax.swing.JOptionPane;

public class Ejercicio543 {

	public static void main(String[] args) {
		//Ejercicio 1
		System.out.println(JOptionPane.showInputDialog("Escribe un mensaje"));
		
		//Ejercicio 2
		boolean bucle = true;
		do {
			String input = JOptionPane.showInputDialog("Introduce un número para calcular su potencia al cuadrado");
				
			if (input != null) {
				try {
					int numero = Integer.parseInt(input);
					System.out.println(numero + " al cuadrado es " + (numero * numero));
					JOptionPane.showMessageDialog(null,
							numero + " al cuadrado es " + (numero * numero),
							"Resultado",
							JOptionPane.INFORMATION_MESSAGE);
					
					bucle = false;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,
							"Tienes que escribir un número",
							"Error",
							JOptionPane.WARNING_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null,
					"No has introducido un formato correcto",
					"Error",
					JOptionPane.ERROR_MESSAGE);
			}
		} while(bucle);
		
		
	}
}
