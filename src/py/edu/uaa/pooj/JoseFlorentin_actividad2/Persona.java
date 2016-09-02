package py.edu.uaa.pooj.JoseFlorentin_actividad2;

import java.util.Date;

public class Persona {
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getapellido() {
		return apellido;
	}

	public void settitulo(String apellido) {
		this.apellido = apellido;
	}
	
	public Date getfechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setfechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}

