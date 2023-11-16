package Ejercicio574;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ejercicio574 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setTitle("Fundación Esplai");
		jframe.setSize(800, 600);
		jframe.setResizable(false);
		jframe.getContentPane().setBackground(Color.BLUE);
		jframe.setIconImage(Toolkit.getDefaultToolkit().getImage("./icon.png"));
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
