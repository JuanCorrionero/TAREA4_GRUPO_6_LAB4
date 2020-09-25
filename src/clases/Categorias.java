package clases;

public class Categorias implements Comparable<Categorias>{
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
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
		Categorias other = (Categorias) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Categorias o) {
		// TODO Auto-generated method stub
		
		return o.getCategoria().compareTo(this.getCategoria());

	}
	
	
	
	
	
	 }

