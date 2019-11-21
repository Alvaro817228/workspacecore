package modelo.entidad;

public class Libros {
	private String ISBN;
	private String titulo;
	private String editorial;
	private int aniopublicacion;
	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAniopublicacion() {
		return aniopublicacion;
	}
	public void setAniopublicacion(int aniopublicacion) {
		this.aniopublicacion = aniopublicacion;
	}
	@Override
	public String toString() {
		return "Libros [ISBN=" + ISBN + ", titulo=" + titulo + ", editorial=" + editorial + ", aniopublicacion="
				+ aniopublicacion + "]";
	}
	


}