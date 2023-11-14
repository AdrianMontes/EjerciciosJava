package Ejercicio471;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio471 {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		int coorX = 0;
		int coorY = 0;
		boolean partidaAcabada;
		char fichaActual;
		
		do {
			System.out.println("***Tres en raya***");
			System.out.println("1. Humano contra humano");
			System.out.println("2. Humano contra CPU (Humano: X; CPU: O)");
			System.out.println("3. CPU contra CPU");
			System.out.println("0. Salir");
			System.out.println("Elige una opcion");
			opcion = sc.nextInt();
			
			partidaAcabada = false;
			char[][] tablero = {
					{' ', ' ', ' '},
					{' ', ' ', ' '},
					{' ', ' ', ' '}
			};
			fichaActual = 'X';
			
			switch(opcion) {
			case 1: //Humano contra humano
				fichaActual = ElegirTurnoInicial();
				while(!partidaAcabada) {
					ImprimirTablero(tablero);
					System.out.println("Jugador " + fichaActual + ". Ingresa las coordenadas X e Y para colocar " + fichaActual);
					System.out.print("Ingresa la coordenada X: ");
					coorX = sc.nextInt();
					System.out.print("Ingresa la coordenada Y: ");
					coorY = sc.nextInt();
					coorX--;
					coorY--;
					
					if (coorX >= 0 && coorX < 3) {
						if (coorY >= 0 && coorY < 3) {
							if (tablero[coorX][coorY] == ' ') {
								if (fichaActual == 'O') {
									tablero[coorX][coorY] = 'O';
									fichaActual = 'X';
								} else {
									tablero[coorX][coorY] = 'X';
									fichaActual = 'O';
								}
							} else {
								System.out.println("Esa casilla esta ocupada. Escoge otra");
							}
						} else {
							System.out.println("Las coordenadas que has introducido no son correctas");
						}
					} else {
						System.out.println("Las coordenadas que has introducido no son correctas");
					}
					
					char ganador = ComprobarGanador(tablero);
					if (ganador != ' ') {
						ImprimirTablero(tablero);
						System.out.println("\nHa ganado el jugador " + ganador + "!\n\n");
						partidaAcabada = true;
					} else {
						if (ComprobarEmpate(tablero)) {
							System.out.println("\nEmpate!\n\n");
							partidaAcabada = true;
						}
					}
				}
				
				break;
				
			case 2: //Humano contra CPU (Humano: X; CPU: O)
				while (!partidaAcabada) {
					ImprimirTablero(tablero);
					if (fichaActual == 'X') {
						System.out.println("Ingresa las coordenadas X e Y para colocar X");
						System.out.print("Ingresa la coordenada X: ");
						coorX = sc.nextInt();
						System.out.print("Ingresa la coordenada Y: ");
						coorY = sc.nextInt();
						coorX--;
						coorY--;
						
						if (coorX >= 0 && coorX < 3) {
							if (coorY >= 0 && coorY < 3) {
								if (tablero[coorX][coorY] == ' ') {
									tablero[coorX][coorY] = 'X';
									fichaActual = 'O';
								} else {
									System.out.println("Esa casilla esta ocupada. Escoge otra");
								}
							} else {
								System.out.println("Las coordenadas que has introducido no son correctas");
							}
						} else {
							System.out.println("Las coordenadas que has introducido no son correctas");
						}
						
						if (ComprobarGanador(tablero) == 'X') {
							ImprimirTablero(tablero);
							System.out.println("\nHa ganado el jugador!\n\n");
							partidaAcabada = true;
						} else {
							if (ComprobarEmpate(tablero)) {
								ImprimirTablero(tablero);
								System.out.println("\nEmpate!\n\n");
								partidaAcabada = true;
							}
						}
					} else {
						int[] coordenadas = TurnoMaquina(tablero);
						tablero[coordenadas[0]][coordenadas[1]] = 'O';
						fichaActual = 'X';
						
						if (ComprobarGanador(tablero) == 'O') {
							ImprimirTablero(tablero);
							System.out.println("\nHa ganado la maquina!\n\n");
							partidaAcabada = true;
						} else {
							if (ComprobarEmpate(tablero)) {
								ImprimirTablero(tablero);
								System.out.println("\nEmpate!\n\n");
								partidaAcabada = true;
							}
						}
					}
				}
				
				break;
				
			case 3: //CPU contra CPU
				while (!partidaAcabada) {
					System.out.println("Turno de " + fichaActual + ". Esperando...");
					Random generadorAleatorio = new Random();
					int espera = generadorAleatorio.nextInt(5) + 3;
					try {
						Thread.sleep(espera * 1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					int[] coordenadas = TurnoMaquina(tablero);
					tablero[coordenadas[0]][coordenadas[1]] = fichaActual;
					
					if (ComprobarGanador(tablero) != ' ') {
						ImprimirTablero(tablero);
						System.out.println("\nHa ganado la maquina " + fichaActual + "!\n\n");
						partidaAcabada = true;
					} else {
						if (ComprobarEmpate(tablero)) {
							System.out.println("\nEmpate!");
							partidaAcabada = true;
						}
						
						if (fichaActual == 'X') {
							fichaActual = 'O';
						} else if (fichaActual == 'O') {
							fichaActual = 'X';
						}
						
						ImprimirTablero(tablero);
					}
				}
				break;
				
			case 0: //Salir
				System.out.println("\nSaliendo del programa...");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			default:
				System.out.println("No has elegido una opcion correcta");
				break;
			}
		} while (opcion != 0);
	}
	
	private static int[] TurnoMaquina(char[][] tablero) {
		Random generadorAleatorio = new Random();
		int coorX, coorY;
		do {
			coorX = generadorAleatorio.nextInt(3) + 1;
			coorY = generadorAleatorio.nextInt(3) + 1;
			coorX--;
			coorY--;
		} while (tablero[coorX][coorY] != ' ');
		int[] coordenadas = {coorX, coorY};
		return coordenadas;
	}
	
	private static boolean ComprobarEmpate(char[][] tablero) {
		int casillasOcupadas = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j] != ' ') {
					casillasOcupadas++;
				}
			}
		}
		
		if (casillasOcupadas == 9) {
			return true;
		}
		
		return false;
	}
	
	private static char ComprobarGanador(char[][] tablero) {
		char ganador = ' ';
		
		//Comprobar líneas verticales
		if (tablero[0][0] == 'X' && tablero[0][1] == 'X' && tablero[0][2] == 'X') {
			ganador = 'X';
		}
		if (tablero[1][0] == 'X' && tablero[1][1] == 'X' && tablero[1][2] == 'X') {
			ganador = 'X';
		}
		if (tablero[2][0] == 'X' && tablero[2][1] == 'X' && tablero[2][2] == 'X') {
			ganador = 'X';
		}
		
		if (tablero[0][0] == 'O' && tablero[0][1] == 'O' && tablero[0][2] == 'O') {
			ganador = 'O';
		}
		if (tablero[1][0] == 'O' && tablero[1][1] == 'O' && tablero[1][2] == 'O') {
			ganador = 'O';
		}
		if (tablero[2][0] == 'O' && tablero[2][1] == 'O' && tablero[2][2] == 'O') {
			ganador = 'O';
		}
		
		//Comprobar líneas horizontales
		if (tablero[0][0] == 'X' && tablero[1][0] == 'X' && tablero[2][0] == 'X') {
			ganador = 'X';
		}
		if (tablero[0][1] == 'X' && tablero[1][1] == 'X' && tablero[2][1] == 'X') {
			ganador = 'X';
		}
		if (tablero[0][2] == 'X' && tablero[1][2] == 'X' && tablero[2][2] == 'X') {
			ganador = 'X';
		}
		
		if (tablero[0][0] == 'O' && tablero[1][0] == 'O' && tablero[2][0] == 'O') {
			ganador = 'O';
		}
		if (tablero[0][1] == 'O' && tablero[1][1] == 'O' && tablero[2][1] == 'O') {
			ganador = 'O';
		}
		if (tablero[0][2] == 'O' && tablero[1][2] == 'O' && tablero[2][2] == 'O') {
			ganador = 'O';
		}
		
		//Comprobar diagonales
		if (tablero[0][0] == 'X' && tablero[1][1] == 'X' && tablero[2][2] == 'X') {
			ganador = 'X';
		}
		if (tablero[0][2] == 'X' && tablero[1][1] == 'X' && tablero[2][0] == 'X') {
			ganador = 'X';
		}
		
		if (tablero[0][0] == 'O' && tablero[1][1] == 'O' && tablero[2][2] == 'O') {
			ganador = 'O';
		}
		if (tablero[0][2] == 'O' && tablero[1][1] == 'O' && tablero[2][0] == 'O') {
			ganador = 'O';
		}
		
		return ganador;
	}
	
	private static char ElegirTurnoInicial() {
		Random generadorAleatorio = new Random();
		int random = generadorAleatorio.nextInt(2);
		char turno = ' ';
		
		if (random == 0) {
			turno = 'O';
		} else {
			turno = 'X';
		}
		
		System.out.println("Turno de " + turno);
		return turno;
	}
	
	private static void ImprimirTablero(char[][] tablero) {
		System.out.println("\n\t|1|\t|2|\t|3|");
		System.out.println("|1|\t|" + tablero[0][0] + "|\t|" + tablero[1][0] + "|\t|" + tablero[2][0] + "|");
		System.out.println("|2|\t|" + tablero[0][1] + "|\t|" + tablero[1][1] + "|\t|" + tablero[2][1] + "|");
		System.out.println("|3|\t|" + tablero[0][2] + "|\t|" + tablero[1][2] + "|\t|" + tablero[2][2] + "|");
		System.out.println();
	}
}
