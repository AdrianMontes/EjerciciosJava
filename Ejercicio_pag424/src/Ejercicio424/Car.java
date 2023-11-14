package Ejercicio424;

public class Car {
	private int fuel;
	private int maxSpeed;
	
	public Car() {
		
	}
	
	public Car(int fuel, int maxSpeed) {
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
	}

	public int getFuel() {
		return fuel;
	}

	public void setFuel(int fuel) {
		this.fuel = fuel;
		if (this.fuel < 0) {
			this.fuel = 0;
		}
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		if (this.maxSpeed < 0) {
			this.maxSpeed = 0;
		}
	}
	
	public void Refuel(int cantidad) {
		this.fuel += cantidad;
	}
	
	public void Drive() {
		if (getFuel() <= 0) {
			System.out.println("No tienes gasolina");
		} else {
			System.out.println("Conduciendo...");
			this.fuel -= 5;
		}
	}
}
