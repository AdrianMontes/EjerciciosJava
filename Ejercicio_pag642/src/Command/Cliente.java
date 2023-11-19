package Command;

public class Cliente {
	/*
	 * Comportamiento
	 * Command convierte una solicitud en un objeto para
	 * parametrizar a los clientes con diferentes solicitudes
	 */
	public static void main(String[] args) {
		//Se crea el receptor
		Light light = new Light();
		
		Command lightOnCommand = new LightOnCommand(light);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.SetCommand(lightOnCommand);
		
		remoteControl.PressButton();
	}
}
