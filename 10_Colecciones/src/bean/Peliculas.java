package bean;

public class Peliculas {
	private String titulo;
	private String genero;
	private  Director director;
	private String a�o;
	public Peliculas(String titulo, String genero, Director director, String a�o) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.a�o = a�o;
	}
	public Peliculas() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", a�o=" + a�o + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String getA�o() {
		return a�o;
	}
	public void setA�o(String a�o) {
		this.a�o = a�o;
	}
}
	
	