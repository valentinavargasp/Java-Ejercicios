package ejercicioswhile;

import java.util.Scanner;

public class EjercicioWhile {

	public static void main(String[] args) {
		String palabra;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la palabra que quiere mostrar por teclado.");
		palabra = teclado.nextLine();

		while (!palabra.equalsIgnoreCase("salir")) {
			System.out.println("La palabra es: " + palabra);
			
			System.out.println("Ingrese la palabra que quiere mostrar por teclado.");
			palabra = teclado.nextLine();
		}
		
		System.out.println("Gracias por usar nuestro programa.");

	}

}
