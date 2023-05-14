package ejercicio03;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
	
	public static void main(String[] args) {
		
	//Creamos la colección.
	Set<String> coleccion= new TreeSet<String>();
	
	//Creamos la variable que guardará el valor introducido por el usuario.
		String nombre;
		
		
		//Creamos un scanner.
		Scanner sc= new Scanner(System.in);
		
		//Añadimos nombres a la colección hasta que se introduzca fin.
		
		System.out.println("Escriba un nombre: ");
		nombre=sc.nextLine();
				
		//Hemos hecho un bucle while y no do-while para que no guarde la palabra fin.
		while (!nombre.equals("fin")) {
			
			coleccion.add(nombre);
			
			
			System.out.println("Escriba un nombre: ");
			nombre=sc.nextLine();
					
			
		}
		
		System.out.println("Colección: "+coleccion);
		
		
	}

}
