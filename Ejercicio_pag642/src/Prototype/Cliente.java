package Prototype;

public class Cliente {
	/* 
	 * Creacional
	 * Prototype permite crear objetos clonados para crear
	 * nuevos objetos a partir de uno ya existente (prototipo)
	 */
	public static void main(String[] args) {
		//Creando prototipo
		OrcEnemy orcPrototype = new OrcEnemy("Orco", 10, 20);
		
		//Enemigos clonados
		OrcEnemy enemy1 = (OrcEnemy) orcPrototype.clone();
		OrcEnemy enemy2 = (OrcEnemy) orcPrototype.clone();
		
		enemy1.setFuerza(50);
		
		orcPrototype.MostrarStats();
		enemy1.MostrarStats();
		enemy2.MostrarStats();
	}
}
