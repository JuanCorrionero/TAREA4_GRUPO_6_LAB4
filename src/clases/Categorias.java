package clases;

public class Categorias {
	 private String categoria;

	
	public Categorias(){};
	 
	public Categorias(String categoria) {
		super();
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	 }

