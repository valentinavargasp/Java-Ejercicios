package ejerciciosfor;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese por teclado el límite.");
		numero = teclado.nextInt();
		
		for(int i = 0; i < numero; i++) {
			System.out.println(i+1);
		}
	}

}
