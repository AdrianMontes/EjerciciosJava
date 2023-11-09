package Ejercicio321;

public class Ejercicio321 {

	public static void main(String[] args) {
		//Ejercicio 1
		Long l = new Long(10);
		Byte b = new Byte((byte) 1);
		Short s = new Short((short) 5);
		Integer i = new Integer((int) 7);
		
		//Ejercicio 2
		long num1 = 10;
		byte num2 = 1;
		short num3 = 5;
		int num4 = 7;

		ComprobarDato(l);
		ComprobarDato(b);
		ComprobarDato(s);
		ComprobarDato(i);
		ComprobarDato(num1);
		ComprobarDato(num2);
		ComprobarDato(num3);
		ComprobarDato(num4);
	}
	
	private static void ComprobarDato(Object dato) {
		if (!dato.getClass().isPrimitive()) {
			System.out.println("El objeto no primitivo pertenece al wrapper " + dato.getClass().getSimpleName());
		} else {
			System.out.println("El objeto primitivo perteneceria al wrapper " + (Object) dato.getClass().getSimpleName());
		}
	}

}
