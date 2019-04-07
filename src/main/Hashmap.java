package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import model.Producto;

public class Hashmap {
	
	// APARTADO B)
	
	public ArrayList<Producto> listadoProductos(){
		ArrayList<Producto> listadoProducto= new ArrayList<Producto>();
		//ID    NOMBRE PRODUCTO  STOCK  PRECIO   CATEGORIA  ALMACEN
		try {
			FileReader fr = new FileReader("ficheros/productos.txt");
			BufferedReader br = new BufferedReader(fr);			
			String lineaFichero;
			while((lineaFichero = br.readLine()) !=null) {
				String[] arrayLineaFichero = lineaFichero.split("#");
				Integer id = Integer.parseInt(arrayLineaFichero[0]);
				String nombre = arrayLineaFichero[1];
				Integer stock = Integer.parseInt(arrayLineaFichero[2]);
				float precio = (float) Double.parseDouble(arrayLineaFichero[3]);				
				String idCategoria = arrayLineaFichero[4];
				Integer idAlmacen = Integer.parseInt(arrayLineaFichero[5]);
				
				//(int id, String nombre, int stock, float precio, String idCategoria, int idAlmacen)
				
				Producto unProducto = new Producto(id, nombre, stock, precio, idCategoria, idAlmacen);
				listadoProducto.add(unProducto);			
			}			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error FileNotFound");
		} catch (IOException e) {
			System.out.println("Error I/O");
		}		
		return listadoProducto;
	}
	
	// APARTADO C) método para grabar en un fichero de tipo objeto todos los productos individualmente

	public void grabarFicheroObjetos(ArrayList<Producto> listadoProductos) {		
		try {
			FileOutputStream fls = new FileOutputStream("ficheros/productos.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fls);
			for(int i=0; i < listadoProductos.size(); i++) {
				Producto unProducto = listadoProductos.get(i);
				oos.writeObject(unProducto);
			}			
			oos.close();
			fls.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error FileNotFound");
		} catch (IOException e) {
			System.out.println("Error I/O");
		}	
	}
	
	
	// APARTADO D) método para leer el archivo objeto de productos.obj y lo almacene en un HashMap<Integer, Producto> (return)

	public HashMap<Integer, Producto> leerFicheroObjetos(){
		HashMap<Integer, Producto> listadoProductos= new HashMap<Integer, Producto>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("ficheros/productos.obj");
			ois = new ObjectInputStream(fis);	
			System.out.println("antes de entrar ");
			while(true) {
				Producto unProducto = (Producto) ois.readObject();		
				listadoProductos.put(unProducto.getId(), unProducto);
			}				
			
		} catch (FileNotFoundException e) {
			System.out.println("Error FileNotFound");
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {
			System.out.println("Error ClassNotFound");
		}finally {
			try {
				ois.close();			
				fis.close();
			} catch (Exception e) {
				
			}	
		}
		return listadoProductos;
	}

	
	
	
	public static void main(String[] args) {

		Hashmap controller = new Hashmap();


	/*	ArrayList<Producto> listadoProductos = controller.listadoProductos();
		//System.out.println(listadoProductos);
		ArrayList<String> listadoCategorias = controller.listadoCategorias();
		//System.out.println(listadoCategorias);
		HashMap<String, String> listadoAlmacenes = controller.listadoAlmacenes();
		//System.out.println(listadoAlmacenes);
	*/	 
				
		//controller.grabarFicheroObjetos(listadoProductos);
		HashMap<Integer, Producto> lecturaFicheroObjetos = controller.leerFicheroObjetos();
		System.out.println(lecturaFicheroObjetos);
		
	}

}
