package main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Producto;






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
	
	// RESPUESTA A LA PREGUNTA (B) - y almacenarlos (return) en los siguientes tipos:
	//					(B-1) productos.txt -> ArrayList<Producto>
	
/*	public ArrayList<Producto> creaListaProductos (String rutafichero)
	{
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
			try {
				BufferedReader fichero;
				fichero = new BufferedReader(new FileReader(rutafichero));
				String registro;
			
					while ((registro = fichero.readLine()) != null) {
						String[] campos = registro.split("#");
						Producto e = new Producto();
						e.setId(Integer.parseInt(campos[0]));
						e.setNombre(campos[1]);
						e.setStock(Integer.parseInt(campos[2]));
						e.setPrecio(Float.parseFloat(campos[3]));
						e.setIdCategoria(Integer.parseInt(campos[4]));
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
	
*/
	// RESPUESTA A LA PREGUNTA (B) - (B-2) categorias.txt-> ArrayList<String>
	
	// RESPUESTA A LA PREGUNTA (B) - (B-3) almacenes.txt-> HashMap<String, String>
	
	
		// RESPUESTA A LA PREGUNTA (C) -  método para grabar en un fichero de tipo object todos los productos individualmente








	// RESPUESTA A LA PREGUNTA (D) - método para leer el archivo objecto de productos.obj y lo almacene en un HashMap<Integer,Producto>

	
	

	public static void main(String[] args) {
		
		MainProducto ejercicio = new MainProducto();
		
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
		

		// RESPUESTA A LA PREGUNTA (E.1) - mostrar listado de productos sin filtros (ID    NOMBRE PRODUCTO   PRECIO   STOCK   CATEGORIA  ALMACEN)
		
				
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
