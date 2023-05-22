package ejercicio04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args) {

		// Creamos las dos colecciones necesarias.
		Map<Integer, Integer> numeros = new TreeMap<Integer, Integer>();
		Map<Integer, Integer> stars = new TreeMap<Integer, Integer>();

		// Creamos las variables necesarias.
		String opc = "";// opción que elegirá el usuario.
		int num; // número que introduce el uduario.
		int star; // número de estrellas que introduce el usuario.
		final int MAX_NUM = 5;// valor máximo de números.
		final int MAX_STARS = 2;// valor máximo de estrellas.

		// Creamos un escáner.
		Scanner sc = new Scanner(System.in);

		// Hacemos un do-while para que el usuario introduzca un boleto.
		do {

			// Un bucle for en el que el usuario introduce los números.
			for (int i = 0; i < MAX_NUM; i++) {

				// Pedimos el número hasta que hay introducido los cinco.
				do {

					System.out.println("Introduzca el " + (i + 1) + " º número premiado:");
					num = sc.nextInt();
					sc.nextLine();

				} while (num < 0 || num > 50);

				// Si el mapa no contiene un número con esa clave, la añadimos con valor 1.
				if (!numeros.containsKey(num)) {

					numeros.put(num, 1);

				} else {

					numeros.replace(num, numeros.get(num) + 1);
				}
			}

			// Hacemos otro for que contabilice las estrellas.
			for (int i = 0; i < MAX_STARS; i++) {

				do {

					System.out.println("Introduzca el número de estrellas: ");
					star = sc.nextInt();
					sc.nextLine();

				} while (star < 1 || star > 12);

				if (!stars.containsKey(star)) {

					stars.put(star, 1);

				} else {

					stars.replace(star, stars.get(star) + 1);
				}

			}

			// Imprimimos los resultados.
			System.out.println("Valor números: " + numeros);
			System.out.println("Valor estrellas: " + stars);

			System.out.println("¿Quiere introducir otro boleto? ");
			opc = sc.nextLine();

		} while (!opc.equalsIgnoreCase("no"));

		// Cerramos el escáner.
		sc.close();

	}

}
