package view;

import java.util.ArrayList;
import java.util.HashMap;

import main.MainProducto;
import model.Almacen;
import model.Categoria;
import model.Producto;

// RESPUESTA A LA PREGUNTA (E)

public class ProductoView {

	

	// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
	
	public void mostrarListado(ArrayList<Producto> creaListaProductos, ArrayList<Categoria> creaListaCategorias, ArrayList<Almacen> creaListaAlmacenes) {
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
			Categoria nombreCategoria = creaListaCategorias.get(idCategoria-1);
			//String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
				
			System.out.println(id + "\t " + nombreProducto + " \t\t\t " + precio + " \t\t" + stock + " \t" + nombreCategoria + "\t " + idAlmacen);
			
		}
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (E.2) - mostrar listado de productos filtrado por una categoria, 
	//	igual que el de antes pero sólo sale una categoría concreta
		
	// RESPUESTA A LA PREGUNTA (E.3) - mostrar listado de productos ordenados por categorías
			
	// RESPUESTA A LA PREGUNTA (E.4) - mostrar listado de productos ordenados por almacenes
					
	// RESPUESTA A LA PREGUNTA (E.5) - mostrar los productos que tiene un almacén concreto
			
	// RESPUESTA A LA PREGUNTA (E.6) - mostrar el stock total de la empresa
			
	// RESPUESTA A LA PREGUNTA (E.7) - mostrar el stock de productos que tiene cada almacen
	
	// RESPUESTA A LA PREGUNTA (E.8) - mostrar el stock de productos que tiene cada categoría
	
/*	public static void main(String[] args) {
		ProductoView ejercicio = new ProductoView();
		
		ArrayList<Producto> creaListaProductos = ejercicio.creaListaProductos("ficheros/productos.txt");
		ArrayList<Categoria> creaListaCategorias = ejercicio.creaListaCategorias("ficheros/categorias.txt");		
		ArrayList<Almacen> creaListaAlmacenes = ejercicio.creaListaAlmacenes("ficheros/almacenes.txt");		
		
	
		mostrarListado(creaListaProductos, creaListaCategorias, creaListaAlmacenes);
		
	}*/
	
}
