package mathRandom;

//1. Genera un número aleatorio entre 1 y 10 y muestra un mensaje si es mayor que 5:
public class Ejercicio1 {

	public static void main(String[] args) {
		
		int num = (int) (Math.random() * 10) + 1;
		
		System.out.println("El número generado es: " + num);
		
		if (num > 5)  {
			System.out.println("El número generado es mayor que 5.");
		} else {
			System.out.println("El número generado es menor que 5.");
		}

	}

}
