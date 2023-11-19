package Prototype;

public class OrcEnemy implements EnemyPrototype {
	private String tipo;
	private int velocidad;
	private int fuerza;
	
	public OrcEnemy(String tipo, int velocidad, int fuerza) {
		this.tipo = tipo;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
	}
	
	public EnemyPrototype clone() {
		try {
            return (EnemyPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public void MostrarStats() {
		System.out.println("Tipo: " + tipo + "\nVelocidad: " + velocidad + "\nFuerza: " + fuerza + "\n");
	}
}
