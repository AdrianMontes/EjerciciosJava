package Ejercicio544;

import javax.swing.JOptionPane;

public class Ejercicio544 {
	public static void main(String[] args) {
		int opcion;
		boolean bucle = true;
		
		do {
			String input = JOptionPane.showInputDialog("Menu de operaciones:\n1.Insert\n2.Delete\n3Display\n4.Exit");
			
			opcion = Integer.parseInt(input);
			opcion--;
			
			switch(opcion) {
			case 0, 1, 2, 3:
				bucle = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Elige una opción correcta", "Error", JOptionPane.WARNING_MESSAGE);
			}
		} while(bucle);
		
		JOptionPane.showMessageDialog(null, "Opción escogida", "Opción escogida", opcion);
	}
}
