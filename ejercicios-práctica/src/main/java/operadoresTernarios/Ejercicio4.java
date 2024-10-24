package operadoresTernarios;

import java.util.Scanner;

//Calcula el mayor de dos números usando un operador ternario
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		String resultado;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese dos números \n");
		System.out.println("Ingrese el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		
		resultado = (num1 > num2) ? "El primer número ingresado es mayor" : "El segundo número ingresado es mayor";
		System.out.println("El número mayor es: " + resultado);
		

	}

}
