package clases;

public class Peliculas {

	private int id;
	private String nombre;
	private Categorias categoria;
	private static int count = 0;

	public Peliculas() {
		super();
		this.count++;
		this.id = count;
		this.nombre = "Sin nombre";
		this.categoria = new Categorias();
	}
	
	public Peliculas(String nombre, Categorias categoria) {
		super();
		this.count++;
		this.id = count;
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
	
	public  int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " Categoria=" + categoria.getCategoria() ;
	}

	
	
}
