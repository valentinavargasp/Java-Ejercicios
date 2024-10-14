/*Determina la categoría de una persona según su edad: bebé (<2), niño (2-12),
 *  adolescente (13-18), adulto (19-64), anciano (65+).
 */
package ejerciciosifelse;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la edad de la persona: ");
		int edad = teclado.nextInt();
		
		if (edad <2) {
			System.out.println("La persona es un bebé.");
		} else if (edad >= 2 && edad <= 12) {
			System.out.println("La persona es un niño.");
		} else if (edad >= 13 && edad <= 18) {
			System.out.println("La persona es un adolescente.");
		} else if (edad >= 19 && edad <= 64) {
			System.out.println("La persona es un adulto.");
		} else {
			System.out.println("La persona es un anciano.");
		}
		
		teclado.close();

	}

}
