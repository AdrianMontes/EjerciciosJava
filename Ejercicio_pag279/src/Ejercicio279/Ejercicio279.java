package Ejercicio279;

public class Ejercicio279 {

	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
			if (i < 10) {
				for (int j = 0; j < 20 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i * 2; k++) {
					System.out.print("\033[42m*\033[0m");
				}
			} else {
				for (int l = 0; l < 18; l++) {
					System.out.print(" ");
				}
				for (int m = 0; m < 4; m++) {
					System.out.print("\033[40m*\033[0m");
				}
			}
			
			System.out.println();
		}
	}

}
