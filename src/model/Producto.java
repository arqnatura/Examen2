package model;


// RESPUESTA A LA PREGUNTA (A) - Crear la clase producto sólamente

//id, nombre, stock, precio, idCategoria, idAlmacen

public class Producto {

	private int id;	
	private String nombre;
	private int stock;
	private float precio;
	private String idCategoria;
	private int idAlmacen;
	private String nombreAlmacen;
	
	
	public Producto(int id, String nombre, int stock, float precio, String idCategoria, int idAlmacen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.idCategoria= idCategoria;
		this.idAlmacen = idAlmacen;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombreAlmacen() {
		return nombreAlmacen;
	}

	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}
	
	
	
	
	
	
}


