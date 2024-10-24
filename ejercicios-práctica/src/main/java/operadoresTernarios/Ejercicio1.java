package operadoresTernarios;

//Verifica si un número es par o impar usando un operador ternario
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numero = (int) (Math.random() * 50);
		System.out.println("El número es: " + numero);
		
		String resultado = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println("El número es: " + resultado);


	}

}
