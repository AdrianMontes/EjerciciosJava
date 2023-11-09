package Ejercicio332;

public class Ejercicio332 {

	public static void main(String[] args) {
		//Ejercicio 1
		double d = 100.50;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		
		//Ejercicio 2
		short s2 = b;
		int i2 = s2;
		long l2 = i2;
		float f2 = l2;
		double d2 = f2;
		
		//Ejercicio 3
		byte b2 = 100;
		b2 *= 2;
		System.out.println(b2); //Lo que pasa es que el valor pasa de 128, por lo que da la vuelta empezando por el valor mínimo para sumar lo que queda
		b2 = 100;
		short s3 = (short) (b2 * 2);
		System.out.println(s3);
	}

}
