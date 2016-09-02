package py.edu.uaa.pooj.JoseFlorentin_actividad2;

import java.util.Date;

public class Edicion {
	private String isbn;
	private Date fechaPublicacion;
	private Libro libro;
	
	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Date getfechaPublicacion() {
		return fechaPublicacion;
	}

	public void setisbn(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public Libro getlibro() {
		return libro;
	}

	public void setlibro(Libro libro) {
		this.libro = libro;
	}

}
