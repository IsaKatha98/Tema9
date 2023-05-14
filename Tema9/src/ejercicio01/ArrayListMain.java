package ejercicio01;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, 
 * en una colección. Hay que asegurarse de que se guardan 20. Deben guardarse ordenados a medida que se 
 * vayan generando, y se mostrará la colección resultante por pantalla.
 */


public class ArrayListMain {

	public static void main(String[] args) {
		
	//Creamos la colección
	List <Integer> coleccion = new ArrayList<Integer>();
	
	//Creamos la variable que guardará el valor que se produce de forma aleatoria.
	int num;
	int index=0; //Un índice que indica el tamaño de la lista.
	
	//Vamos generando números y añadiéndolos a la colección y paramos cuando index=20.
	while (index<=20) {
		
		num=(int) (Math.random()*100);
		coleccion.add(num);
		index++;
	}
	
	//Imprimimos la colección.
	System.out.println("Colección: "+coleccion);
	
	System.out.println();

	}


	

}
