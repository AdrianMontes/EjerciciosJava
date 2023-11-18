package Ejercicio589;

import javax.swing.JButton;

enum Estado {
	AGUA, BARCO
}

public class Casilla {
	private boolean oculto;
	private Estado estado;

	public Casilla() {
		this.oculto = true;
		this.estado = Estado.AGUA;
	}

	public boolean isOculto() {
		return oculto;
	}

	public void setOculto(boolean oculto) {
		this.oculto = oculto;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}
