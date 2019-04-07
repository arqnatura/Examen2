package view;

import java.util.ArrayList;
import java.util.HashMap;

import main.examen;
import model.Almacen;
import model.Categoria;
import model.Producto;

// RESPUESTA A LA PREGUNTA (E)

public class ProductoView {

	

	// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
	
	public void mostrarListado(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> creaListaAlmacenes) {
		
		
		System.out.println("ID \t NOMBRE PRODUCTO \t\t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t\t ====== \t ===== \t ========= \t =======");
		
		for(int i = 0; i < creaListaProductos.size(); i++) {
			Producto unProducto = creaListaProductos.get(i);
			
			Integer id = unProducto.getId();	
			String nombreProducto = unProducto.getNombre();
			Float precio = unProducto.getPrecio();
			Integer stock = unProducto.getStock();
			Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
			Integer idAlmacen = unProducto.getIdAlmacen();
			String nombreCategoria = creaListaCategorias.get(idCategoria-1);
			String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
				
			System.out.println(id + "\t " + nombreProducto + " \t\t\t " + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + idAlmacen);
			
		}
	}
	
	
	// RESPUESTA A LA PREGUNTA (E.2) - mostrar listado de productos filtrado por una categoria, 
	//	igual que el de antes pero sólo sale una categoría concreta
	
	public void mostrarListadoPorUnaCategoria(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> creaListaAlmacenes, String nombreUnaCategoria) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(int i = 0; i < creaListaProductos.size(); i++) {
			Producto unProducto = creaListaProductos.get(i);
			Integer id = unProducto.getId();	
			String nombreProducto = unProducto.getNombre();
			Float precio = unProducto.getPrecio();
			Integer stock = unProducto.getStock();
			Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
			Integer idAlmacen = unProducto.getIdAlmacen();
			String nombreCategoria = creaListaCategorias.get(idCategoria-1);
			String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
			
			if(nombreCategoria.equals(nombreUnaCategoria)){
			System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreUnaCategoria + "\t " + nombreAlmacen);
			}
		}		
	}
	
	// RESPUESTA A LA PREGUNTA (E.3) - mostrar listado de productos ordenados por categorías
	
	public void mostrarListadoProductosOrdenadosPorCategorias(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> creaListaAlmacenes) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(int i = 0; i < creaListaCategorias.size(); i++) {
			String nombreUnaCategoria = creaListaCategorias.get(i);
			
			for(int j = 0; j < creaListaProductos.size(); j++) {
				Producto unProducto = creaListaProductos.get(j);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombre();
				Float precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = creaListaCategorias.get(idCategoria-1);
				String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
			
				if(nombreCategoria.equals(nombreUnaCategoria)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreUnaCategoria + "\t " + nombreAlmacen);
					}
			}		
		}
	}
	
			
	// RESPUESTA A LA PREGUNTA (E.4) - mostrar listado de productos ordenados por almacenes
/*	
	public void mostrarListadoProductosOrdenadosPorAlmacenes(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> creaListaAlmacenes) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
		for(String e:creaListaAlmacenes.values()) 
		{	
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombre();
				Float precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = creaListaCategorias.get(idCategoria-1);
				String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
			
				if(nombreCategoria.equals(e)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + nombreAlmacen);
					}
			}		
		}
	}
*/	

	// RESPUESTA A LA PREGUNTA (E.5) - mostrar los productos que tiene un almacén concreto

	public void mostrarListadoProductosPorUnAlmacen(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> creaListaAlmacenes, String idUnAlmacen) {
		System.out.println("ID \t NOMBRE PRODUCTO \t PRECIO \t STOCK \t CATEGORIA \t ALMACEN");
		System.out.println("== \t =============== \t ====== \t ===== \t ========= \t =======");
		
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombre();
				Float precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				String idAlmacen = unProducto.getIdAlmacen()+"";
				String nombreCategoria = creaListaCategorias.get(idCategoria-1);
				String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
								
				if(idAlmacen.equals(idUnAlmacen)){
					System.out.println(id + "\t " + nombreProducto + " \t\t" + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + nombreAlmacen);
				}			
			}
	}
	
			
	// RESPUESTA A LA PREGUNTA (E.6) - mostrar el stock total de la empresa
	
	public void mostrarStockTotal(ArrayList<Producto> creaListaProductos) {	
		Integer stock = 0 ;
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);			
				stock += unProducto.getStock();				
			}
			System.out.println("STOCK TOTAL DE PRODUCTOS: " + stock + " unidades.");
	}
	
	
			
	// RESPUESTA A LA PREGUNTA (E.7) - mostrar el stock de productos que tiene cada almacen
	
	public void mostrarStockPorAlmacenes(ArrayList<Producto> creaListaProductos, HashMap<String, String> creaListaAlmacenes) {	
		System.out.println("---------------------------------------------");
		System.out.println("STOCK POR ALMACENES: ");
		System.out.println("---------------------------------------------");
		
		for(String idUnAlmacen:creaListaAlmacenes.keySet()) {
			Integer stock = 0;
			String nombreUnAlmacen = creaListaAlmacenes.get(idUnAlmacen);
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);
				String idAlmacen = unProducto.getIdAlmacen()+"";
				
				if(idUnAlmacen.equals(idAlmacen)) {	
					stock += unProducto.getStock();	
				}					
			}									
			System.out.println("STOCK "+  nombreUnAlmacen + ": " + stock + " unidades.");						
		}			
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.8) - mostrar el stock de productos que tiene cada categoría
	
	public void mostrarStockPorCategorias(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias) {	
		System.out.println("---------------------------------------------");
		System.out.println("STOCK POR CATEGORIAS: ");
		System.out.println("---------------------------------------------");
		
		for(int i = 0; i < creaListaCategorias.size(); i++) {
			Integer stock = 0;
			String nombreCategoria = creaListaCategorias.get(i);
			for(int j = 0; j < creaListaProductos.size(); j++) {
				Producto unProducto = creaListaProductos.get(j);
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria())-1;				
				if(idCategoria.equals(i)) {	
					stock += unProducto.getStock();	
				}					
			}
			System.out.println("STOCK "+  nombreCategoria + ": " + stock + " unidades.");						
		}			
	}
	
	
	
	

	
}
