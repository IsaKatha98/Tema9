package ejercicio05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain {

	// Creamos la colección
	static Map<String, Double> productos = new HashMap<String, Double>();

	// Opción del menú.
	static int opc;

	// Nombre del producto.
	static String nombre;

	// Precio del producto.
	static double precio;

	// Creamos un escáner.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
	
	
	//Hacemos un bucle que presente el menú y pregunte por la opción que queremos.
	do {
		
		//Presentamos el menú.
		menu();
		
		System.out.println();
		System.out.println("Elija su opción: ");
		opc=sc.nextInt();
		
		switch (opc) {
		
		case 1-> { 
			
			//Función de añadir un producto.
			altaProducto();
		
		} case 2 -> {
			
			sc.nextLine();
			System.out.println("Introduzca el nombre del producto que quiere eliminar: ");
			nombre= sc.nextLine();
			
			//Función de eliminar un producto.
			bajaProducto(nombre);
			
		} case 3 -> {
			
			//Función de listado.
			listado();
			
		} case 0 -> {
			
			System.out.println("Ha cerrado el programa.");
		
		} default -> {
			
			System.out.println("Esa opción no es válida.");
		}
	}
	

	} while (opc!=0);
	
	}

	/**
	 * Método que imprime el menú del CRUD.
	 */
	public static void menu() {

		System.out.println("PRODUCTOS");
		System.out.println();
		System.out.println("1.Alta del producto.");
		System.out.println("2.Baja del producto.");
		System.out.println("3.Lista de existencias.");
		System.out.println("0.Salir.");
		
	}
	
	/**
	 * Método que da de alta un producto nuevo.
	 */
	public static void altaProducto () {
		
		sc.nextLine();
		System.out.println("Introduzca el nombre del producto: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduzca el precio del producto: ");
		precio=sc.nextDouble();
		
		//Añadimos ambos valores a una posición del mapa.
		productos.put(nombre, precio);
		
		System.out.println("Se ha completado un registro con éxito.");
		
	}
	
	/**
	 * Método que elimina un producto.
	 * 
	 * @param nombre así se identifica el producto a borrar.
	 */
	public static void bajaProducto (String nombre) {
		
		productos.remove(nombre);
		
		System.out.println("Se ha eliminado un producto con éxito.");
		
	}
	
	/**
	 * Método que lista todos los productos que hay.
	 */
	public static void listado () {
		
		System.out.println("Productos disponibles: "+productos);
	}


}
