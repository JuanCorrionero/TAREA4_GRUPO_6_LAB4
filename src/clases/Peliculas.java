package clases;

public class Peliculas implements Comparable<Peliculas> {

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Peliculas o) {
		// TODO Auto-generated method stub
		
		return o.getNombre().compareTo(this.getNombre());

	}
	
	
}
