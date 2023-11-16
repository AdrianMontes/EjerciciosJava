package Ejercicio545;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio545 {

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		ImageIcon lobo = new ImageIcon("lobo.jpg");
		ImageIcon tigre = new ImageIcon("tigre.jpg");
		ImageIcon aguila = new ImageIcon("aguila.jpg");
		Image imagenEscalada = lobo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);;
		JLabel etiqueta = new JLabel(lobo);
		String[] opciones = {"Lobo", "Tigre", "Águila"};

        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Selección",
                "Selecciona a un animal",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);  
        
        if (seleccion != null) {
            String opcionSeleccionada = seleccion.toString();
            switch(opcionSeleccionada) {
            case "Lobo":
            	imagenEscalada = lobo.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            	break;
            case "Tigre":
            	imagenEscalada = tigre.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            	break;
            case "Águila":
            	imagenEscalada = aguila.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
            	System.out.println("IT'S FUTILE 🦅🦅🦅");
            	break;
            }
            
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            etiqueta = new JLabel(iconoEscalado);
            panel.add(etiqueta);
            JOptionPane.showMessageDialog(null, panel, opcionSeleccionada, JOptionPane.INFORMATION_MESSAGE);
        }
	}

}
