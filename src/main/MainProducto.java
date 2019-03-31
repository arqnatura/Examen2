package main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Almacen;
import model.Categoria;
import model.Producto;
import view.ProductoView;


public class MainProducto {
	
	

	// RESPUESTA A LA PREGUNTA (B) - metódos para leer los tres ficheros de texto
	
	
/*	public void lecturaFicheros (String rutafichero) {
		
											// Fichero del que queremos leer
	//File fichero = new File("ficheros/almacenes.txt");
	File fichero = new File(rutafichero);	
	Scanner s = null;

	try {
											// Leemos el contenido del fichero
		System.out.println("... Leemos el contenido del fichero ...");
		s = new Scanner(fichero);

											// Leemos linea a linea el fichero
		while (s.hasNextLine()) {
			String linea = s.nextLine(); 	// Guardamos la linea en un String
			System.out.println(linea);      // Imprimimos la linea
		}

	} catch (Exception ex) {
		System.out.println("Mensaje: " + ex.getMessage());
	} finally {
				// Cerramos el fichero tanto si la lectura ha sido correcta o no
		try {
			if (s != null)
				s.close();
		} catch (Exception ex2) {
			System.out.println("Mensaje 2: " + ex2.getMessage());
		}
	}
}
*/	
	public void lecturaFicheros3 (String rutafichero1, String rutafichero2, String rutafichero3) {
		
		// Fichero del que queremos leer
		//File fichero = new File("ficheros/almacenes.txt");
		File fichero = new File(rutafichero1, rutafichero2);	
			Scanner s = null;

			try {
		// Leemos el contenido del fichero
					System.out.println("... Leemos el contenido del fichero ...");
						s = new Scanner(fichero);

		// Leemos linea a linea el fichero
						while (s.hasNextLine()) {
							String linea = s.nextLine(); 	// Guardamos la linea en un String
							System.out.println(linea);      // Imprimimos la linea
						}

			} catch (Exception ex) {
				System.out.println("Mensaje: " + ex.getMessage());
			} finally {
				// Cerramos el fichero tanto si la lectura ha sido correcta o no
				try {
					if (s != null)
						s.close();
				} catch (Exception ex2) {
					System.out.println("Mensaje 2: " + ex2.getMessage());
				}
			}
	}	
	
	
	// RESPUESTA A LA PREGUNTA (B) - y almacenarlos (return) en los siguientes tipos:
	//					(B-1) productos.txt -> ArrayList<Producto>
	
	public ArrayList<Categoria> creaListaCategorias (String rutafichero)
	{
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
						
			try {
				BufferedReader fichero = new BufferedReader(new FileReader(rutafichero));
				String registro;

					while ((registro = fichero.readLine()) != null) {
						String[] campos = registro.split("#");
						Categoria e = new Categoria(0, registro);
						e.setIdCategoria(Integer.parseInt(campos[0]));
						e.setNombreCategoria(campos[1]);
						lista.add(e);
					}
					fichero.close();
					System.out.println("Fin CREA lista CATEGORIAS");
			
					System.out.println(lista);
					
			} catch (NumberFormatException e) {
				System.out.println("Excepción Formato.nulll");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException.null");
				e.printStackTrace();
			}		

		return lista;
	}		
	
	public ArrayList<Almacen> creaListaAlmacenes (String rutafichero)
	{
		ArrayList<Almacen> lista = new ArrayList<Almacen>();
						
			try {
				BufferedReader fichero = new BufferedReader(new FileReader(rutafichero));
				String registro;

					while ((registro = fichero.readLine()) != null) {
						String[] campos = registro.split("#");
						Almacen e = new Almacen(0, registro);
						e.setIdAlmacen(Integer.parseInt(campos[0]));
						e.setNombreAlmacen(campos[1]);
						lista.add(e);
					}
					fichero.close();
					System.out.println("Fin lectura fichero");
			
					System.out.println(lista);
					
			} catch (NumberFormatException e) {
				System.out.println("Excepción Formato.nulll");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException.null");
				e.printStackTrace();
			}		

		return lista;
	}	
	
	
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
					System.out.println("Fin lectura fichero");
			
					System.out.println(lista);
					
			} catch (NumberFormatException e) {
				System.out.println("Excepción Formato.nulll");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException.null");
				e.printStackTrace();
			}		

		return lista;
	}
	

	// RESPUESTA A LA PREGUNTA (B) - (B-2) categorias.txt-> ArrayList<String>
	
	public ArrayList<String> ListaCategoria ()
	{
		ArrayList<String> listaCategorias = new ArrayList<String>();

				try {
					FileReader fr = new FileReader("ficheros/categorias.txt");
					BufferedReader br = new BufferedReader(fr);			
					String lineaFichero;
					while((lineaFichero = br.readLine()) !=null) {
						String[] arrayLineaFichero = lineaFichero.split("#");
						String nombreCategoria = arrayLineaFichero[1];						
						listaCategorias.add(nombreCategoria);		
					}		
					br.close();
					fr.close();
					System.out.println("Fin lectura fichero");
			
					System.out.println(listaCategorias);
					
			} catch (NumberFormatException e) {
				System.out.println("Excepción Formato.nulll");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("IOException.null");
				e.printStackTrace();
			}		

		return listaCategorias;
	}
	
	
	
	// RESPUESTA A LA PREGUNTA (B) - (B-3) almacenes.txt-> HashMap<String, String>
	
	
		// RESPUESTA A LA PREGUNTA (C) -  método para grabar en un fichero de tipo object todos los productos individualmente

	public void creaFicheroObjetoProductos() {
		try {
			BufferedReader fichero;
			fichero = new BufferedReader(new FileReader("ficheros/productos.txt"));
			FileOutputStream salida = new FileOutputStream("ficheros/productos.obj");
			ObjectOutputStream objetos = new ObjectOutputStream(salida);

			String registro;
			while ((registro = fichero.readLine()) != null) {
				String[] campos = registro.split("#");
				Producto producto = new Producto(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2]), Integer.parseInt(campos[3]), campos[4], Integer.parseInt(campos[5]));
				producto.setId(0);
				producto.setNombre(null);
				producto.setStock(0);
				producto.setPrecio(0);
				producto.setIdCategoria(null);
				producto.setIdAlmacen(0);
				objetos.writeObject(producto);
			}
			fichero.close();
			System.out.println("Fin de la lectura del fichero");

		} catch (FileNotFoundException excepcion) {
			System.out.println("fichero no encontrado");

		} catch (IOException e) {
			System.out.println("IO Excepcion");
		}

	}



	// RESPUESTA A LA PREGUNTA (D) - método para leer el archivo objecto de productos.obj y lo almacene en un HashMap<Integer,Producto>

	public void leerObjetosProductos() {
		ObjectInputStream objetos = null;
		try {
			objetos = new ObjectInputStream(new FileInputStream("ficheros/productos.obj"));

			while (true) {
				Producto producto = (Producto) objetos.readObject();
				System.out.println(producto.getNombre());
			}

		} catch (FileNotFoundException e) {
			System.out.println("error1");
		} catch (IOException e) {
			System.out.println("Fin de la lectura");
			try {
				objetos.close();
			} catch (IOException e1) {

			}
		} catch (ClassNotFoundException e) {
			System.out.println("clase no encontrada");
		} catch (java.lang.ClassCastException e) {
			System.out.println("Casting imposible");
		}

	}
	
	
	
	
	

	public static void main(String[] args) {
		
		MainProducto ejercicio = new MainProducto();
		ProductoView view = new ProductoView();
		
		// RESPUESTA A LA PREGUNTA (B) - metódos para leer los tres ficheros de texto
		/* ejercicio.lecturaFicheros("ficheros/almacenes.txt");
		System.out.println("------------------------------------------------------------");
		ejercicio.lecturaFicheros("ficheros/categorias.txt");
		System.out.println("------------------------------------------------------------");
		ejercicio.lecturaFicheros("ficheros/productos.txt");
		System.out.println("------------------------------------------------------------");
		*/
		//Recorre el diectorio
	    //	File inputFolder = new File("c:/");
	    //	traverse(inputFolder, "");

		// ejercicio.creaListaProductos("ficheros/productos.txt");
		// System.out.println("------------------------------------------------------------");
		
		// ejercicio.creaFicheroObjetoProductos();
		// ejercicio.leerObjetosProductos();

		// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
		/*ejercicio.lecturaFicheros3("ficheros/productos.txt", "ficheros/categorias.txt", "ficheros/almacenes.txt");
		ejercicio.creaListaProductos("ficheros/productos.txt");
		ejercicio.creaListaCategorias("ficheros/categorias.txt");		
		ejercicio.creaListaAlmacenes("ficheros/almacenes.txt");
		
	
		ArrayList<Producto> creaListaProductos = ejercicio.creaListaProductos("ficheros/productos.txt");
		ArrayList<Categoria> creaListaCategorias = ejercicio.creaListaCategorias("ficheros/categorias.txt");		
		ArrayList<Almacen> creaListaAlmacenes = ejercicio.creaListaAlmacenes("ficheros/almacenes.txt");

		
		view.mostrarListado (creaListaProductos, creaListaCategorias, creaListaAlmacenes);
				*/
		
		
		ejercicio.ListaCategoria();
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.2) - mostrar listado de productos filtrado por una categoria, igual que el de antes pero sólo sale una categoría concreta
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.3) - mostrar listado de productos ordenados por categorías
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.4) - mostrar listado de productos ordenados por almacenes
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.5) - mostrar los productos que tiene un almacén concreto
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.6) - mostrar el stock total de la empresa
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.7) - mostrar el stock de productos que tiene cada almacen
		
		
		System.out.println("------------------------------------------------------------");

		// RESPUESTA A LA PREGUNTA (E.8) - mostrar el stock de productos que tiene cada categoría
		
	}
}
