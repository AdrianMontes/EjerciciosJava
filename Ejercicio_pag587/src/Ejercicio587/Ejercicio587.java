package Ejercicio587;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejercicio587 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Flow Layout -");
		frame.setSize(600, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		//Centrar
		frame.setLayout(new FlowLayout());
		//Alinear a la derecha
		//frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//Alinear a la izquierda
		//frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton b1 = new JButton("Button:1");
		JButton b2 = new JButton("Button:2");
		JButton b3 = new JButton("Button:3");
		JButton b4 = new JButton("Button:4");
		JButton b5 = new JButton("Button:5");
		JButton b6 = new JButton("Button:6");
		JButton b7 = new JButton("Button:7");
		JButton b8 = new JButton("Button:8");
		
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
