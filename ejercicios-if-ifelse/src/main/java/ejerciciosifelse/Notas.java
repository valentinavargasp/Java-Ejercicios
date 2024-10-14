//Asigna una nota en función de la calificación: A (>=90), B (>=80), C (>=70), D (>=60), F (<60).
package ejerciciosifelse;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Bienvenido al sistema de calificaciones.");
		System.out.println("Ingrese su puntaje (0 - 100): ");
		int puntaje = teclado.nextInt();
		char nota = 0;

		if (puntaje < 0 || puntaje > 100)
			System.out.println("Puntaje inválido. Por favor indique un número entre 0 y 100.");
		else {
			if (puntaje >= 90) {
				nota = 'A';
			} else if (puntaje >= 80) {
				nota = 'B';
			} else if (puntaje >= 70) {
				nota = 'C';
			} else if (puntaje >= 60) {
				nota = 'D';
			} else {
				nota = 'F';
			}

			System.out.println("Su calificación final es: " + nota);
			teclado.close();
		}
	}
}
