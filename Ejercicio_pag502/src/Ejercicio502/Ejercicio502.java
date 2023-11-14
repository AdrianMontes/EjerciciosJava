package Ejercicio502;

public class Ejercicio502 {

	public static void main(String[] args) {
		Developer d1 = new Developer("Arnesio", "Turo Cayetano", 30, "54343456S", Profesiones.BACK_END_DEVELOPER);
		Developer d2 = new Developer("Carmen", "Gutierrez Sanamo", 26, "8884432P", Profesiones.FRONT_END_DEVELOPER);
		Developer d3 = new Developer("Ernesto", "Turo Cayetano", 32, "1276653M", Profesiones.FULL_STACK_DEVELOPER);
		
		Developer[] developers = {d1, d2, d3};
		
		for(Developer d : developers) {
			if (d.rolTecnologico == Profesiones.BACK_END_DEVELOPER || d.rolTecnologico == Profesiones.FULL_STACK_DEVELOPER) {
				System.out.println(d.getNombre() + ": Viva el Back");
			} else {
				System.out.println(d.getNombre() + ": JS es una 💩 es mejor utilizar TypeScript");
			}
		}
	}
}
