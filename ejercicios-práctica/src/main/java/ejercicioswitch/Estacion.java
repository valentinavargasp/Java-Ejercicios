//Determina el nombre de una estación del año según un número (1: invierno, 2: primavera, 3: verano, 4: otoño).
package ejercicioswitch;

import java.util.Scanner;

public class Estacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			
		System.out.println("Ingrese un número del 1 al 4 para elegir estación: ");
		int n = teclado.nextInt();
		String estacion;
		
		switch(n) {
		case 1:
			estacion = "A abrigarse! Estamos en Invierno.";
			break;
		case 2:
			estacion = "Época de antialérgicos. Llegó la primavera!";
			break;
		case 3:
			estacion = "Pileta, sol y VERANO!";
			break;
		case 4: 
			estacion = "Bienvenida la mejor estación: OTOÑO!";
			break;
		default:
			estacion = "Ingrese un número válido";
			break;
		} 
		
		System.out.println(estacion);
		teclado.close();
		
	}

}
