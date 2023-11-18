package Ejercicio586;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio586 {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setTitle("BorderLayout");
		frame1.setSize(800, 600);
		frame1.setResizable(false);
		frame1.setLocationRelativeTo(null);
		frame1.setLayout(new BorderLayout());
		
		JButton b1 = new JButton("Hide North Border");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b1.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b2 = new JButton("Hide West Border");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b2.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b3 = new JButton("Hide Center Border");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b3.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b4 = new JButton("Hide East Border");
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b4.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b5 = new JButton("Hide South Border");
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b5.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		frame1.add(b1, BorderLayout.NORTH);
		frame1.add(b2, BorderLayout.WEST);
		frame1.add(b3, BorderLayout.CENTER);
		frame1.add(b4, BorderLayout.EAST);
		frame1.add(b5, BorderLayout.SOUTH);
		
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		
		JFrame frame2 = new JFrame();
		frame2.setTitle("BorderLayout");
		frame2.setSize(400, 300);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);
		frame2.setLayout(new BorderLayout());
		
		Font fuente = new Font("Arial", Font.BOLD | Font.ITALIC, 20);
		
		JButton b6 = new JButton("North");
		b6.setBackground(Color.RED);
		b6.setForeground(Color.WHITE);
		b6.setFont(fuente);
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b6.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b7 = new JButton("West");
		b7.setBackground(Color.BLUE);
		b7.setForeground(Color.WHITE);
		b7.setFont(fuente);
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b7.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b8 = new JButton("Center");
		b8.setBackground(Color.YELLOW);
		b8.setForeground(Color.BLACK);
		b8.setFont(fuente);
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b8.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b9 = new JButton("East");
		b9.setBackground(Color.BLUE);
		b9.setForeground(Color.WHITE);
		b9.setFont(fuente);
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b9.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton b10 = new JButton("South");
		b10.setBackground(Color.RED);
		b10.setForeground(Color.WHITE);
		b10.setFont(fuente);
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b10.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		frame2.add(b6, BorderLayout.NORTH);
		frame2.add(b7, BorderLayout.WEST);
		frame2.add(b8, BorderLayout.CENTER);
		frame2.add(b9, BorderLayout.EAST);
		frame2.add(b10, BorderLayout.SOUTH);
		
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
	}
}
