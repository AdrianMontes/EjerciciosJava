package Adapter;

public class Cliente {
	
	/*
	 * Estructural
	 * Adapter se utiliza para poder trabajar con interfaces
	 * incompatibles en conjunto
	 */
	public static void main(String[] args) {
		XMLReader xmlReader = new XMLReader(); //Creamos el lector de xml
		DataReader xmlAdapter = new XMLAdapter(xmlReader); //A continuación, creamos el adaptador
		xmlAdapter.ReadData(); //Ahora podemos usar los métodos de la interfaz
	}

}
