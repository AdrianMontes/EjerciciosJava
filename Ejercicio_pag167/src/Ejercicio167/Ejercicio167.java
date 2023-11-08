package Ejercicio167;

public class Ejercicio167 {

	public static void main(String[] args) {
		//Lógicos
		final boolean bool = true;
		System.out.println("boolean permite definir una variable mediante true o false. En este caso, es " + bool);
				
				
		//Caracter
		final char caracter = 'a';
		System.out.println("\nchar es un tipo de variable donde se puede definir un solo caracter. En este caso, es " + caracter);
				
				
		//Número entero
		final byte b = 127;
		System.out.println("\nbyte define un número entero del -128 al 127. En este caso, es " + b);
				
		final short s = 15897;
		System.out.println("\nshort define un número entero del -32.768 al 32.767. En este caso, es " + s);
				
		final int i = 4566789;
		System.out.println("\nint define un número entero del -2.147.483.648 al 2.147.483.647. En este caso, es " + i);
				
		final long l = 1122284255;
		System.out.println("\nlong define un número entero del -9.223.372.036.854.775.808 al 9.223.372.036.854.775.807. En este caso, es " + l);
				
				
		//Número real
		final float f = (float) 3.14;
		System.out.println("\nfloat define un número real del 1.4E-45 al 3.40282235E38. En este caso, es " + f);
				
		final double d = 67.12;
		System.out.println("\ndouble define un número real del 4.9E-324 al 1.7976931348623157E308. En este caso, es " + d);
			
				
		//Constantes
		final String primerPrograma = "Hola mundo";
		System.out.println("\nfinal convierte una variable en una constante, por lo que nunca se podrá modificar una vez declarada. En este caso, siempre será " + primerPrograma);
	}

}
