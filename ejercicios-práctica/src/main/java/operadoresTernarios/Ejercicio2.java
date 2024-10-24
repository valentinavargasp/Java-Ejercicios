package operadoresTernarios;

import java.util.Scanner;

// Determina si una persona es mayor de edad con un operador ternario
public class Ejercicio2 {

	public static void main(String[] args) {
		
		int edad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese su edad: ");
		edad = teclado.nextInt(); 
		
		String resultado = (edad > 18) ? "Es mayor de edad" : "Es menor de edad";
		System.out.println("Usted " + resultado);
		
		
		

	}

}
