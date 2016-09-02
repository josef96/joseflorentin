package py.edu.uaa.pooj.JoseFlorentin_actividad2;

import java.util.List;

public class Libro {
	
	private String titulo ;
	private List<String> autores ;
	private String Editorial ;


	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}
	

	public List<String> getautores() {
		return autores;
	}

	public void setautores(List<String> autores) {
		this.autores = autores;
	}
	

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String Editorial) {
		this.Editorial = Editorial;
	}
	
	

}
