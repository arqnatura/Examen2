package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import model.Almacen;
import model.Producto;

public class LeerAlmacenarVer3 {

		/*	Métodos para leer los tres ficheros de texto y almacenarlos (return) en los 
			siguientes tipos (estos métodos en la carpeta controller): (1.5 puntos)
				productos.txt -> ArrayList<Producto>
				categorias.txt-> ArrayList<String>
				almacenes.txt-> HashMap<String, String>*/

		// APARTADO A.1):  productos.txt -> ArrayList<Producto>
		
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
		
		// APARTADO A.2):  categorias.txt-> ArrayList<String>
		
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

		// APARTADO A.3):  almacenes.txt-> HashMap<String, String>
		
		public HashMap<String, String> creaListaAlmacenes(){
			HashMap<String, String> listadoAlmacen= new HashMap<String, String>();
			
			try {
				FileReader fr = new FileReader("ficheros/almacenes.txt");
				BufferedReader br = new BufferedReader(fr);			
				String lineaFichero;
				while((lineaFichero = br.readLine()) !=null) {
					String[] arrayLineaFichero = lineaFichero.split("#");
					String idAlmacen = arrayLineaFichero[0];
					String nombreAlmacen = arrayLineaFichero[1];				
					listadoAlmacen.put(idAlmacen, nombreAlmacen);					
				}		
				br.close();
				fr.close();
			} catch (FileNotFoundException e) {
				System.out.println("Error FileNotFound");
			} catch (IOException e) {
				System.out.println("Error I/O");
			}	
			return listadoAlmacen;
		}
		
			
		
		// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
		
		public void mostrarListado(ArrayList<Producto> creaListaProductos, ArrayList<String> creaListaCategorias, HashMap<String, String> listadoAlmacen) {
			
			
			System.out.println("ID \t PRECIO   STOCK   ALMACEN \t ALMACEN \t\t CATEGORIA \t\t NOMBRE PRODUCTO");
			System.out.println("== \t ======   =====   ======= \t ========= \t\t =============== \t ===============");
			
			for(int i = 0; i < creaListaProductos.size(); i++) {
				Producto unProducto = creaListaProductos.get(i);
				
				Integer id = unProducto.getId();	
				String nombreProducto = unProducto.getNombre();
				Float precio = unProducto.getPrecio();
				Integer stock = unProducto.getStock();
				Integer idCategoria = Integer.parseInt(unProducto.getIdCategoria());
				Integer idAlmacen = unProducto.getIdAlmacen();
				String nombreCategoria = creaListaCategorias.get(idCategoria-1);
				String nombreAlmacen = listadoAlmacen.get(idAlmacen +"");
					
				System.out.println(id + " \t " + precio + " \t   " + stock + " \t   "  + idAlmacen + "  \t\t "  + nombreAlmacen + "  \t " + nombreCategoria + " \t\t    "  + nombreProducto);
				
			}
		}
		
		public static void main(String[] args) {

			LeerAlmacenarVer3 ejercicio = new LeerAlmacenarVer3();
			
			HashMap<String, String> listadoAlmacen= ejercicio.creaListaAlmacenes();
			ArrayList<String> creaListaCategoria = ejercicio.creaListaCategorias("ficheros/categorias.txt");
			ArrayList<Producto> creaListaProducto = ejercicio.creaListaProductos("ficheros/productos.txt");
			ejercicio.mostrarListado(creaListaProducto, creaListaCategoria, listadoAlmacen);
			System.out.println("------------------------------------------------------------");
					
			
		}

	}
