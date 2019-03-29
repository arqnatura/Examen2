package model;

public class Categoria {

	private int idCategoria;
	private String nombreCategoria;
	


	public Categoria(int idCategoria, String nombreCategoria) {
		super();
		this.setIdCategoria(idCategoria);
		this.setNombreCategoria(nombreCategoria);
		
}



	public int getIdCategoria() {
		return idCategoria;
	}



	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}



	public String getNombreCategoria() {
		return nombreCategoria;
	}



	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}



	
		
	}


