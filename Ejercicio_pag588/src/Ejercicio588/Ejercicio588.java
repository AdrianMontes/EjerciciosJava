package Ejercicio588;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio588 {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame();
		frame1.setTitle("GridLayout");
		frame1.setSize(200, 200);
		frame1.setResizable(false);
		frame1.setLocationRelativeTo(null);
		frame1.setLayout(new GridLayout(2, 2));
		
		JButton b1 = new JButton("North");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b1.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame1.add(b1);
		
		JButton b2 = new JButton("South");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b2.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame1.add(b2);
		
		JButton b3 = new JButton("East");
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b3.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame1.add(b3);
		
		JButton b4 = new JButton("West");
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b4.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame1.add(b4);
		
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		
		
		
		JFrame frame2 = new JFrame();
		frame2.setTitle("GridLayout");
		frame2.setSize(600, 600);
		frame2.setResizable(false);
		frame2.setLocationRelativeTo(null);
		frame2.setLayout(new GridLayout(3, 3));
		
		JButton b5 = new JButton("Contacts");
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b5.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b5);
		
		JButton b6 = new JButton("Message");
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b6.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b6);
		
		JButton b7 = new JButton("Call Log");
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b7.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b7);
		
		JButton b8 = new JButton("Games");
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b8.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b8);
		
		JButton b9 = new JButton("Settings");
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b9.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b9);
		
		JButton b10 = new JButton("Applications");
		b10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b10.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b10);
		
		JButton b11 = new JButton("Music");
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b11.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b11);
		
		JButton b12 = new JButton("Gallery");
		b12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b12.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b12);
		
		JButton b13 = new JButton("Organiser");
		b13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Has pulsado " + b13.getText(), "BorderLayout", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		frame2.add(b13);
		
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
	}

}
