package Ejercicio175;

public class Ejercicio175 {

	public static void main(String[] args) {
		byte bitsChar = 16;
		int rangoChar = (int) Math.pow(2, bitsChar) - 1;
		
		byte bitsByte = 8;
		long rangoByte = (long) Math.pow(2, bitsByte);
		long rangoBytePositivo = (long) (rangoByte / 2) - 1;
		long rangoByteNegativo = (long) (rangoBytePositivo * -1) - 1;
		
		byte bitsShort = 16;
		long rangoShort = (long) Math.pow(2, bitsShort);
		long rangoShortPositivo = (long) (rangoShort / 2) - 1;
		long rangoShortNegativo = (long) (rangoShortPositivo * -1) - 1;
		
		byte bitsInt = 32;
		long rangoInt = (long) Math.pow(2, bitsInt);
		long rangoIntPositivo = (long) (rangoInt / 2) - 1;
		long rangoIntNegativo = (long) (rangoIntPositivo * -1) - 1;
		
		byte bitsLong = 64;
		long rangoLongPositivo = Long.MAX_VALUE;
		long rangoLongNegativo = Long.MIN_VALUE;
		
		byte bitsFloat = 32;
		byte bitsDouble = 64;
		
		System.out.println("\t\t\t\t\tTipos de datos primitivos");
		System.out.println("Nombre\t\tTipo\t\tTamano\t\tValor por defecto\t\tRango");
		System.out.println("boolean\t\tLogico\t\t1 bit\t\tfalse\t\t\t\ttrue-false");
		System.out.println("char\t\tCaracter\t" + bitsChar + " bits\t\t0\t\t\t\t Unicode (del 0 al " + rangoChar + ")");
		System.out.println("byte\t\tNumero entero\t" + bitsByte + " bits\t\t0\t\t\t\t" + rangoByteNegativo + " a " + rangoBytePositivo);
		System.out.println("short\t\tNumero entero\t" + bitsShort + " bits\t\t0\t\t\t\t" + rangoShortNegativo + " a " + rangoShortPositivo);
		System.out.println("int\t\tNumero entero\t" + bitsInt + " bits\t\t0\t\t\t\t" + rangoIntNegativo + " a " + rangoIntPositivo);
		System.out.println("long\t\tNumero entero\t" + bitsLong + " bits\t\t0l a 0L\t\t\t\t" + rangoLongNegativo + " a " + rangoLongPositivo);
		System.out.println("float\t\tNumero real\t" + bitsFloat + " bits\t\t0.0f a 0.0F\t\t\t" + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
		System.out.println("double\t\tNumero real\t" + bitsDouble + " bits\t\t0.0d a 0.0D\t\t\t" + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
	}
}
