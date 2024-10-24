package operadoresTernarios;

import java.util.Scanner;

//Asigna el valor "Positivo" o "Negativo" a una variable según el valor de un número
public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero;
		String resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		
		numero = teclado.nextInt();
		
		resultado = (numero >= 0) ? "El número es positivo" : "El número es negativo.";
		System.out.println(resultado);
		
		
	}

}
