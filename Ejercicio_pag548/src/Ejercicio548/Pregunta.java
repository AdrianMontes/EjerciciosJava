package Ejercicio548;

import javax.swing.Icon;

public class Pregunta {
	private String pregunta;
	private Icon icono;
	private String afirmacion;
	private String negacion;
	private String neutro;
	private boolean escogida;
	
	public Pregunta() {
		
	}

	public Pregunta(String pregunta, Icon icono, String afirmacion, String negacion, String neutro) {
		this.pregunta = pregunta;
		this.icono = icono;
		this.afirmacion = afirmacion;
		this.negacion = negacion;
		this.neutro = neutro;
		this.escogida = false;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Icon getIcono() {
		return icono;
	}

	public void setIcono(Icon icono) {
		this.icono = icono;
	}

	public String getAfirmacion() {
		return afirmacion;
	}

	public void setAfirmacion(String afirmacion) {
		this.afirmacion = afirmacion;
	}

	public String getNegacion() {
		return negacion;
	}

	public void setNegacion(String negacion) {
		this.negacion = negacion;
	}

	public String getNeutro() {
		return neutro;
	}

	public void setNeutro(String neutro) {
		this.neutro = neutro;
	}
	
	public boolean getEscogida() {
		return escogida;
	}
	
	public void SetEscogida(boolean escogida) {
		this.escogida = escogida;
	}
}
