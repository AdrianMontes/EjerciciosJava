package Ejercicio424;

public class Ejercicio424 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(10, 100);
		Car c3 = new Car(0, 30);
		
		c1.setFuel(15);
		c1.setMaxSpeed(120);
		
		System.out.println("Gasolina de c2: " + c2.getFuel());
		System.out.println("Velocidad maxima de c2: " + c2.getMaxSpeed());
		
		c1.Refuel(5);
		System.out.println("Gasolina de c1: " + c1.getFuel());
		
		c2.Drive();
		c3.Drive();
	}

}
