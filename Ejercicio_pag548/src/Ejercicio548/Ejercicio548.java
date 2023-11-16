package Ejercicio548;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio548 {

	public static void main(String[] args) {
		//Ejercicio 1
		int opcion1 = JOptionPane.showConfirmDialog(
				null, 
				"¿Java?", 
				"Ejercicio 1", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE);
	
		switch(opcion1) {
		case JOptionPane.YES_OPTION:
			System.out.println("Has seleccionado Yes");
			JOptionPane.showMessageDialog(null, "Has seleccionado Yes", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
			break;
		case JOptionPane.NO_OPTION:
			System.out.println("Has seleccionado No");
			JOptionPane.showMessageDialog(null, "Has seleccionado No", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
			break;
		case JOptionPane.CANCEL_OPTION:
			System.out.println("Has seleccionado Cancel");
			JOptionPane.showMessageDialog(null, "Has seleccionado Cancel", "Ejercicio 1", JOptionPane.INFORMATION_MESSAGE);
			break;
		}
		
		//Ejercicio 2
		Object[] opciones = {"Yes, please", "No way!"};
		int opcion2 = JOptionPane.showOptionDialog(
				null, 
				"¿Te gustarían huevos verdes con jamón?", 
				"Ejercicio 2", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				opciones, 
				opciones[0]);
		
		if (opcion2 == 0) {
			ImageIcon imagen = new ImageIcon("huevos_y_jamon.jpg");
			JLabel etiqueta = new JLabel(imagen);
			JPanel panel = new JPanel();
			panel.add(etiqueta);
            JOptionPane.showMessageDialog(null, panel, "¡Para ti!", JOptionPane.WARNING_MESSAGE);
		}
		
		//Ejercicio 3
		Icon p1Icono = new ImageIcon(new ImageIcon("java.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		Pregunta p1 = new Pregunta(
				"¿Te gusta Java?",
				p1Icono,
				"¡Y tanto!",
				"No, para nada",
				"Nunca lo he probado"
				);
		Icon p2Icono = new ImageIcon(new ImageIcon("c.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		Pregunta p2 = new Pregunta(
				"¿Te gusta C?",
				p2Icono,
				"Por supuesto",
				"Ni en pintura",
				"No he oido hablar de él"
				);
		Icon p3Icono = new ImageIcon(new ImageIcon("html_css.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		Pregunta p3 = new Pregunta(
				"¿Te gusta HTML / CSS?",
				p3Icono,
				"¡Me encanta!",
				"Lo detesto",
				"¿Qué es eso?"
				);
		Icon p4Icono = new ImageIcon(new ImageIcon("sql.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		Pregunta p4 = new Pregunta(
				"¿Te gusta SQL?",
				p4Icono,
				"Sí",
				"Horrible. Peor lenguaje de la historia",
				"No sé de qué me hablas"
				);
		Icon p5Icono = new ImageIcon(new ImageIcon("xml.png").getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		Pregunta p5 = new Pregunta(
				"¿Te gusta XML?",
				p5Icono,
				"Está simpático",
				"No me gusta",
				"¿El qué?"
				);
		
		ArrayList<Pregunta> preguntas = new ArrayList<>();
		preguntas.add(p1);
		preguntas.add(p2);
		preguntas.add(p3);
		preguntas.add(p4);
		preguntas.add(p5);
		
		int opcion = 0;
		boolean bucle = true;
		Random generadorAleatorio = new Random();
		int random = 0;
		
		do {
			//Se escoge una pregunta aleatoriamente y comprobamos que no haya sido escogida
			do {
				random = generadorAleatorio.nextInt(preguntas.size());
			} while(preguntas.get(random).getEscogida());
			Pregunta preguntaActual = preguntas.get(random);
			
			Object[] respuestas = {preguntaActual.getAfirmacion(), preguntaActual.getNegacion(), preguntaActual.getNeutro(), "Siguiente", "Salir"};
			opcion = JOptionPane.showOptionDialog(
					null,
					preguntaActual.getPregunta(),
					"Ejercicio 3",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					preguntaActual.getIcono(),
					respuestas,
					respuestas[0]
					);
			
			preguntas.get(random).SetEscogida(true); //La pregunta actual no volverá a ser escogida
			//Si se selecciona la opción "Siguiente", acaba el bucle
			if (opcion != 3) {
				bucle = false;
			}
			
			if (preguntas.stream().allMatch(Pregunta::getEscogida)) {
				break;
			}
		} while(bucle);
	}
}
