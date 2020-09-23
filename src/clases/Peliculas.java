package clases;

public class Peliculas {

	private int id;
	private String nombre;
	private Categorias categoria;

	public Peliculas(String nombre, Categorias categoria) {
		super();
		this.id++;
		this.nombre = nombre;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categorias getCategoria() {
		return categoria;
	}
	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	
	
}
