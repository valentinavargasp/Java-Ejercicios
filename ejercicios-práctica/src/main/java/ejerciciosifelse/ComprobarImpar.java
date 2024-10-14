//Verifica si un número es par o impar y muestra un mensaje correspondiente.

package ejerciciosifelse;

import java.util.Scanner;

public class ComprobarImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int n = teclado.nextInt();
		
		if (n %2 != 0) {
			System.out.println("El número ingresado es impar.");
		} else {
			System.out.println("El número ingresado es par.");
		}
		
		teclado.close();
	}

}
