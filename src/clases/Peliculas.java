package clases;

public class Peliculas {

	private int id;
	private String nombre;
	private Categorias categoria;

	public Peliculas() {
		super();
		this.id++;
		this.nombre = "Sin nombre";
		this.categoria.setCategoria("Sin categoria");
	}
	
	public Peliculas(String nombre, String categoria) {
		super();
		this.id++;
		this.nombre = nombre;
		this.categoria.setCategoria(categoria);
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
