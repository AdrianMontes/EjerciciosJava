package Ejercicio491;

public class Ejercicio491 {

	public static void main(String[] args) {
		if ("Federico".equals(args[0]) && "GarciaLorca".equals(args[1])) {
			Lorca.RecitarPoema();
		} else {
			NbtAutorized.ParametrosIncorrectos();
		}
	}

}
