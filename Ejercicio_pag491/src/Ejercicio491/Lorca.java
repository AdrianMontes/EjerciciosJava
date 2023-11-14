package Ejercicio491;

public class Lorca {
	public static void RecitarPoema() {
		String[] poema = {
				"Amor de mis entranas, viva muerte",
				"en vano espero tu palabra escrita",
				"y pienso, con la flor que se marchita,",
				"que si vivo sin mi quiero perderte.",
				"\nEl aire es inmortal. La piedra inerte",
				"ni conoce la sombra ni la evita.",
				"Corazon interior no necesita",
				"la miel helada que la luna vierte.",
				"\nPero yo te sufri. Rasgue mis venas,",
				"tigre y paloma, sobre tu cintura",
				"en duelo de mordiscos y azucenas.",
				"\nLlena pues de palabras mi locura",
				"o dejame vivir en mi serena",
				"noche del alma para siempre oscura."
		};
		
		for(String verso : poema) {
			System.out.println(verso);
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
