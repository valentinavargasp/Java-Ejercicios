//Asigna un día de la semana según un número del 1 al 7.
package ejercicioswitch;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un número del 1 al 7: ");
		int numero = teclado.nextInt();
		String dia;

		switch (numero) {
		case 1:
			dia = "Lunes";
			break;
		case 2:
			dia = "Martes";
			break;
		case 3:
			dia = "Miércoles";
			break;
		case 4:
			dia = "Jueves";
			break;
		case 5:
			dia = "Viernes";
			break;
		case 6:
			dia = "Sábado";
			break;
		case 7:
			dia = "Domingo";
			break;
		default:
			dia = "Inválido. Por favor ingrese un número del 1 al 7.";
		}
		
		System.out.println("El día de la semana es: " + dia);
		teclado.close();
	}

}
