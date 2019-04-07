package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Producto;

public class LeerAlmacenar {

	/*	Métodos para leer los tres ficheros de texto y almacenarlos (return) en los 
		siguientes tipos (estos métodos en la carpeta controller): (1.5 puntos)
			productos.txt -> ArrayList<Producto>
			categorias.txt-> ArrayList<String>
			almacenes.txt-> HashMap<String, String>*/

	// APARTADO A):  productos.txt -> ArrayList<Producto>
	
	public ArrayList<Producto> creaListaProductos (String rutafichero)
	{
		ArrayList<Producto> lista = new ArrayList<Producto>();
						
			try {
				BufferedReader fichero = new BufferedReader(new FileReader(rutafichero));
				String registro;

					while ((registro = fichero.readLine()) != null) {
						String[] campos = registro.split("#");
						Producto e = new Producto(0, registro, 0, 0, registro, 0);
						e.setId(Integer.parseInt(campos[0]));
						e.setNombre(campos[1]);
						e.setStock(Integer.parseInt(campos[2]));
						e.setPrecio(Float.parseFloat(campos[3]));
						e.setIdCategoria(campos[4]);
						e.setIdAlmacen(Integer.parseInt(campos[5]));
						lista.add(e);
					}
					fichero.close();
								//	System.out.println("Fin listado fichero PRODUCTOS");
								//	System.out.println(lista);
					
			} catch (NumberFormatException e) {
				System.out.println("Excepción Formato.nulll");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException.null");
				e.printStackTrace();
			}		

		return lista;
	}
	
	// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
	
	public void mostrarListado(ArrayList<Producto> creaListaProductos) {
		
		
		System.out.println("ID \t PRECIO   STOCK   ALMACEN \t NOMBRE PRODUCTO");
		System.out.println("== \t ======   =====   ======= \t ===============");
		
		for(int i = 0; i < creaListaProductos.size(); i++) {
			Producto unProducto = creaListaProductos.get(i);
			
			Integer id = unProducto.getId();	
			String nombreProducto = unProducto.getNombre();
			Float precio = unProducto.getPrecio();
			Integer stock = unProducto.getStock();
			Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
			Integer idAlmacen = unProducto.getIdAlmacen();
			//String nombreCategoria = creaListaCategorias.get(idCategoria-1);
			//String nombreAlmacen = creaListaAlmacenes.get(idAlmacen +"");
				
			System.out.println(id + " \t " + precio + " \t  " + stock + " \t  "  + idAlmacen + " \t\t "  + nombreProducto);
			
		}
	}
	
	public static void main(String[] args) {

		LeerAlmacenar ejercicio = new LeerAlmacenar();

		ArrayList<Producto> creaListaProductos = ejercicio.creaListaProductos("ficheros/productos.txt");
		ejercicio.mostrarListado (creaListaProductos);
		System.out.println("------------------------------------------------------------");
				
		
	}

}
