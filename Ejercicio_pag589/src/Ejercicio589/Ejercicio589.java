package Ejercicio589;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Ejercicio589.Casilla;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ejercicio589 extends JFrame {

	private static final long serialVersionUID = 1L;
	private static int turnos = 1;
	private static int barcosDescubiertos = 0;
	
	private static JLabel textoTurnos = new JLabel("Turno 1");
	private static JLabel textoBarcoDescubierto1 = new JLabel("Barco 1: ");
	private static JLabel textoBarcoDescubierto2 = new JLabel("Barco 2: ");
	private static JLabel textoBarcoDescubierto3 = new JLabel("Barco 3: ");
	private static JLabel textoBarcoDescubierto4 = new JLabel("Barco 4: ");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio589 frame = new Ejercicio589();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio589() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		panelPrincipal.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		JPanel tablero = new JPanel(new GridLayout(6, 6));
		JPanel info = new JPanel(new GridLayout(5, 1));
		info.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		Font fuente = new Font("Arial", Font.BOLD, 25);
		
		//Lógica de las casillas
		Casilla[][] casillas = new Casilla[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                casillas[i][j] = new Casilla();
            }
        }
		//Bucle para insertar los barcos
		Random random = new Random();
		int coorY, coorX, i = 0;
		do {
			coorY = random.nextInt(5);
			coorX = random.nextInt(5);
			
			if (casillas[coorY][coorX].getEstado() == Estado.AGUA) {
				casillas[coorY][coorX].setEstado(Estado.BARCO);
				i++;
			}
		} while(i < 4);
		
		//Coordenada Y 1
		JLabel y1 = new JLabel("1");
		y1.setHorizontalAlignment(SwingConstants.CENTER);
		y1.setFont(fuente);
		tablero.add(y1);
		
		JButton b1_1 = new JButton("");
		b1_1.setIcon(new ImageIcon(""));
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[0][0], b1_1.getIcon().toString()));
				ActualizarInfo(casillas, 1, 1);
				b1_1.setIcon(icono);
				casillas[0][0].setOculto(false);
				ComprobarVictoria();
			}
		});
		
		tablero.add(b1_1);
		
		JButton b2_1 = new JButton("");
		b2_1.setIcon(new ImageIcon(""));
		b2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[1][0], b2_1.getIcon().toString()));
				ActualizarInfo(casillas, 2, 1);
				b2_1.setIcon(icono);
				casillas[1][0].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b2_1);
		
		JButton b3_1 = new JButton("");
		b3_1.setIcon(new ImageIcon(""));
		b3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[2][0], b3_1.getIcon().toString()));
				ActualizarInfo(casillas, 3, 1);
				b3_1.setIcon(icono);
				casillas[2][0].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b3_1);
		
		JButton b4_1 = new JButton("");
		b4_1.setIcon(new ImageIcon(""));
		b4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[3][0], b4_1.getIcon().toString()));
				ActualizarInfo(casillas, 4, 1);
				b4_1.setIcon(icono);
				casillas[3][0].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b4_1);
		
		JButton b5_1 = new JButton("");
		b5_1.setIcon(new ImageIcon(""));
		b5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[4][0], b5_1.getIcon().toString()));
				ActualizarInfo(casillas, 5, 1);
				b5_1.setIcon(icono);
				casillas[4][0].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b5_1);
		
		//Coordenada Y 2
		JLabel y2 = new JLabel("2");
		y2.setHorizontalAlignment(SwingConstants.CENTER);
		y2.setFont(fuente);
		tablero.add(y2);
		
		JButton b1_2 = new JButton("");
		b1_2.setIcon(new ImageIcon(""));
		b1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[0][1], b1_2.getIcon().toString()));
				ActualizarInfo(casillas, 1, 2);
				b1_2.setIcon(icono);
				casillas[0][1].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b1_2);
		
		JButton b2_2 = new JButton("");
		b2_2.setIcon(new ImageIcon(""));
		b2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[1][1], b2_2.getIcon().toString()));
				ActualizarInfo(casillas, 2, 2);
				b2_2.setIcon(icono);
				casillas[1][1].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b2_2);
		
		JButton b3_2 = new JButton("");
		b3_2.setIcon(new ImageIcon(""));
		b3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[2][1], b3_2.getIcon().toString()));
				ActualizarInfo(casillas, 3, 2);
				b3_2.setIcon(icono);
				casillas[2][1].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b3_2);
		
		JButton b4_2 = new JButton("");
		b4_2.setIcon(new ImageIcon(""));
		b4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[3][1], b4_2.getIcon().toString()));
				ActualizarInfo(casillas, 4, 2);
				b4_2.setIcon(icono);
				casillas[3][1].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b4_2);
		
		JButton b5_2 = new JButton("");
		b5_2.setIcon(new ImageIcon(""));
		b5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[4][1], b5_2.getIcon().toString()));
				ActualizarInfo(casillas, 5, 2);
				b5_2.setIcon(icono);
				casillas[4][1].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b5_2);
		
		//Coordenada Y 3
		JLabel y3 = new JLabel("3");
		y3.setHorizontalAlignment(SwingConstants.CENTER);
		y3.setFont(fuente);
		tablero.add(y3);
		
		JButton b1_3 = new JButton("");
		b1_3.setIcon(new ImageIcon(""));
		b1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[0][2], b1_3.getIcon().toString()));
				ActualizarInfo(casillas, 1, 3);
				b1_3.setIcon(icono);
				casillas[0][2].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b1_3);
		
		JButton b2_3 = new JButton("");
		b2_3.setIcon(new ImageIcon(""));
		b2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[1][2], b2_3.getIcon().toString()));
				ActualizarInfo(casillas, 2, 3);
				b2_3.setIcon(icono);
				casillas[1][2].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b2_3);
		
		JButton b3_3 = new JButton("");
		b3_3.setIcon(new ImageIcon(""));
		b3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[2][2], b3_3.getIcon().toString()));
				ActualizarInfo(casillas, 3, 3);
				b3_3.setIcon(icono);
				casillas[2][2].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b3_3);
		
		JButton b4_3 = new JButton("");
		b4_3.setIcon(new ImageIcon(""));
		b4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[3][2], b4_3.getIcon().toString()));
				ActualizarInfo(casillas, 4, 3);
				b4_3.setIcon(icono);
				casillas[3][2].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b4_3);
		
		JButton b5_3 = new JButton("");
		b5_3.setIcon(new ImageIcon(""));
		b5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[4][2], b5_3.getIcon().toString()));
				ActualizarInfo(casillas, 5, 3);
				b5_3.setIcon(icono);
				casillas[4][2].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b5_3);
		
		//Coordenada Y 4
		JLabel y4 = new JLabel("4");
		y4.setHorizontalAlignment(SwingConstants.CENTER);
		y4.setFont(fuente);
		tablero.add(y4);
		
		JButton b1_4 = new JButton("");
		b1_4.setIcon(new ImageIcon(""));
		b1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[0][3], b1_4.getIcon().toString()));
				ActualizarInfo(casillas, 1, 4);
				b1_4.setIcon(icono);
				casillas[0][3].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b1_4);
		
		JButton b2_4 = new JButton("");
		b2_4.setIcon(new ImageIcon(""));
		b2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[1][3], b2_4.getIcon().toString()));
				ActualizarInfo(casillas, 2, 4);
				b2_4.setIcon(icono);
				casillas[1][3].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b2_4);
		
		JButton b3_4 = new JButton("");
		b3_4.setIcon(new ImageIcon(""));
		b3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[2][3], b3_4.getIcon().toString()));
				ActualizarInfo(casillas, 3, 4);
				b3_4.setIcon(icono);
				casillas[2][3].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b3_4);
		
		JButton b4_4 = new JButton("");
		b4_4.setIcon(new ImageIcon(""));
		b4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[3][3], b4_4.getIcon().toString()));
				ActualizarInfo(casillas, 4, 4);
				b4_4.setIcon(icono);
				casillas[3][3].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b4_4);
		
		JButton b5_4 = new JButton("");
		b5_4.setIcon(new ImageIcon(""));
		b5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[4][3], b5_4.getIcon().toString()));
				ActualizarInfo(casillas, 5, 4);
				b5_4.setIcon(icono);
				casillas[4][3].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b5_4);
		
		//Coordenada Y 5
		JLabel y5 = new JLabel("5");
		y5.setHorizontalAlignment(SwingConstants.CENTER);
		y5.setFont(fuente);
		tablero.add(y5);
		
		JButton b1_5 = new JButton("");
		b1_5.setIcon(new ImageIcon(""));
		b1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[0][4], b1_5.getIcon().toString()));
				ActualizarInfo(casillas, 1, 5);
				b1_5.setIcon(icono);
				casillas[0][4].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b1_5);
		
		JButton b2_5 = new JButton("");
		b2_5.setIcon(new ImageIcon(""));
		b2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[1][4], b2_5.getIcon().toString()));
				ActualizarInfo(casillas, 2, 5);
				b2_5.setIcon(icono);
				casillas[1][4].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b2_5);
		
		JButton b3_5 = new JButton("");
		b3_5.setIcon(new ImageIcon(""));
		b3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[2][4], b3_5.getIcon().toString()));
				ActualizarInfo(casillas, 3, 5);
				b3_5.setIcon(icono);
				casillas[2][4].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b3_5);
		
		JButton b4_5 = new JButton("");
		b4_5.setIcon(new ImageIcon(""));
		b4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[3][4], b4_5.getIcon().toString()));
				ActualizarInfo(casillas, 4, 5);
				b4_5.setIcon(icono);
				casillas[3][4].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b4_5);
		
		JButton b5_5 = new JButton("");
		b5_5.setIcon(new ImageIcon(""));
		b5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icono = new ImageIcon(ComprobarCasilla(casillas[4][4], b5_5.getIcon().toString()));
				ActualizarInfo(casillas, 5, 5);
				b5_5.setIcon(icono);
				casillas[4][4].setOculto(false);
				ComprobarVictoria();
			}
		});
		tablero.add(b5_5);
		
		//Coordenada Y 6
		JLabel y6 = new JLabel(""); //Esquina inferior izquierda vacía
		tablero.add(y6);

		JLabel l1_6 = new JLabel("1");
		l1_6.setHorizontalAlignment(SwingConstants.CENTER);
		l1_6.setFont(fuente);
		tablero.add(l1_6);

		JLabel l2_6 = new JLabel("2");
		l2_6.setHorizontalAlignment(SwingConstants.CENTER);
		l2_6.setFont(fuente);
		tablero.add(l2_6);
		
		JLabel l3_6 = new JLabel("3");
		l3_6.setHorizontalAlignment(SwingConstants.CENTER);
		l3_6.setFont(fuente);
		tablero.add(l3_6);

		JLabel l4_6 = new JLabel("4");
		l4_6.setHorizontalAlignment(SwingConstants.CENTER);
		l4_6.setFont(fuente);
		tablero.add(l4_6);

		JLabel l5_6 = new JLabel("5");
		l5_6.setHorizontalAlignment(SwingConstants.CENTER);
		l5_6.setFont(fuente);
		tablero.add(l5_6);
		
		panelPrincipal.add(tablero, BorderLayout.CENTER);
		
		
		
		info.add(textoTurnos);
		info.add(textoBarcoDescubierto1);
		info.add(textoBarcoDescubierto2);
		info.add(textoBarcoDescubierto3);
		info.add(textoBarcoDescubierto4);
		
		panelPrincipal.add(info, BorderLayout.EAST);
		
		getContentPane().add(panelPrincipal);
	}
	
	private static void ComprobarVictoria() {
		if (barcosDescubiertos == 4) {
			JOptionPane.showMessageDialog(null, "¡Has ganado!", "¡Victoria!", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);
		}
	}
	
	private static void ActualizarInfo(Casilla[][] casillas, int coorY, int coorX) {
		if (casillas[coorY - 1][coorX - 1].isOculto()) {
			turnos++;
			textoTurnos.setText("Turno " + turnos);
		}
		
		if (casillas[coorY - 1][coorX - 1].getEstado() == Estado.BARCO && casillas[coorY - 1][coorX - 1].isOculto()) {
			if (barcosDescubiertos == 1) {
				textoBarcoDescubierto1.setText("Barco 1: " + coorX + ", " + coorY);
			} else if (barcosDescubiertos == 2) {
				textoBarcoDescubierto2.setText("Barco 2: " + coorX + ", " + coorY);
			} else if (barcosDescubiertos == 3) {
				textoBarcoDescubierto3.setText("Barco 3: " + coorX + ", " + coorY);
			} else if (barcosDescubiertos == 4) {
				textoBarcoDescubierto4.setText("Barco 4: " + coorX + ", " + coorY);
			}
		}
	}
	
	private static String ComprobarCasilla(Casilla casilla, String iconoOriginal) {
		if (casilla.isOculto()) {
			if (casilla.getEstado() == Estado.AGUA) {
				return "agua.jpg";
			} else if (casilla.getEstado() == Estado.BARCO) {
				barcosDescubiertos++;
				return "barco.jpg";
			}
		} 

		return iconoOriginal;
	}
}