package py.edu.uaa.pooj.JoseFlorentin_actividad2;

import java.util.Date;

public class Prestamo {
	
	private Lector lector;
	private Ejemplar ejemplares;
	private Boolean estado;
	private Date fechaPrestamo;

	public void realizarPrestamo() {
	}
	
	public void consultarEstadoPrestamo() {
		
	}
	
	public void librosAdeudadosLector() {
		
	}
	
	public Lector getlector() {
		return lector;
	}

	public void setnombre(Lector lector) {
		this.lector = lector;
	}
	
	public Ejemplar getejemplares() {
		return ejemplares;
	}

	public void setEjemplar(Ejemplar ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	public Boolean getestado() {
		return estado;
	}

	public void setEjemplar(Boolean estado) {
		this.estado = estado;
	}
	
	public Date getfechaPrestamo() {
		return fechaPrestamo;
	}

	public void setEjemplar(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	
}
