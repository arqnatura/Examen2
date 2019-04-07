package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Producto;

public class LeerAlmacenarVer2 {


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
		
		// APARTADO A):  categorias.txt-> ArrayList<String>
		public ArrayList<String> creaListaCategorias (String rutafichero) {
			ArrayList<String> lista = new ArrayList<String>();
							
				try {
					BufferedReader fichero = new BufferedReader(new FileReader(rutafichero));
					String registro;

						while ((registro = fichero.readLine()) != null) {
							String[] campos = registro.split("#");
							String nombreCategoria = campos [1];
							
							lista.add(nombreCategoria);

						}
						fichero.close();
									// System.out.println("Fin CREA lista CATEGORIAS");
									// System.out.println(lista);
						
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
		
		public void mostrarListado(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias) {
			
			
			System.out.println("ID \t PRECIO   STOCK   ALMACEN \t CATEGORIA \t\tNOMBRE PRODUCTO");
			System.out.println("== \t ======   =====   ======= \t ========= \t\t===============");
			
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);
				
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombre();
				Float precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = creaListaCategorias.get(idCategoria-1);
					
				System.out.println(id + " \t " + precio + " \t  " + stock + " \t  "  + idAlmacen + "  \t\t " + nombreCategoria + " \t\t    "  + nombreProducto);
				
			}
		}
		
		public static void main(String[] args) {

			LeerAlmacenarVer2 ejercicio = new LeerAlmacenarVer2();
			
			
			ArrayList<String> creaListaCategoria = ejercicio.creaListaCategorias("ficheros/categorias.txt");
			ArrayList<Producto> creaListaProducto = ejercicio.creaListaProductos("ficheros/productos.txt");
			ejercicio.mostrarListado(creaListaProducto, creaListaCategoria);
			System.out.println("------------------------------------------------------------");
					
			
		}

	}
