
public class Pelicula {
	
	private String titulo;
	private String director;
	private String genero;
	private double puntuacion;
	
	
	
	public Pelicula() {
		super();
	}


	public Pelicula(String titulo, String director, String genero, double puntuacion) {
		super();
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.puntuacion = puntuacion;
	}

	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", puntuacion="
				+ puntuacion + "]";
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public double getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	

	
}
