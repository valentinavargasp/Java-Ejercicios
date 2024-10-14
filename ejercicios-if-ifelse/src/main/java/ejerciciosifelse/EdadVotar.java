//Determina si una persona puede votar (mayor de 18 años) o no
package ejerciciosifelse;

import java.util.Scanner;

public class EdadVotar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su edad para comprobar si puede votar: ");
		int edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Usted puede votar.");
		} else {
			System.out.println("Usted no puede votar.");
		}
		
		teclado.close();
	}

}
