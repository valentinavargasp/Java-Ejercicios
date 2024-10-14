//Calcula el precio de una entrada al cine según la edad: niño (5€), adulto (10€), anciano (7€).
package ejerciciosifelse;

import java.util.Scanner;

public class EntradaCine {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int precioEntrada;
		
		System.out.println("Bienvenido/a al cine Millenium.");
		System.out.println("Ingrese su edad para conocer el valor de la entrada: ");
		int edad = teclado.nextInt();
		
		if (edad < 18) {
			precioEntrada = 5;
		} else if(edad >= 18 && edad <= 65) {
			precioEntrada = 10;
		} else {
			precioEntrada = 7;
		}
		
		System.out.println("El precio de la entrada es: "+ precioEntrada + "€");
		teclado.close();
	}

}
