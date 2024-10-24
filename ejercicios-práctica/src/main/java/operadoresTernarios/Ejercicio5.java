package operadoresTernarios;

import java.util.Scanner;

//Asigna un valor "Aprobado" o "Reprobado" a una variable en función de una nota
public class Ejercicio5 {

	public static void main(String[] args) {
		int nota;
		String resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese la nota obtenida: ");
		nota = teclado.nextInt();
		
		resultado = (nota > 6) ? "Aprobado" : "Desaprobado";
		System.out.println(resultado);

	}

}
