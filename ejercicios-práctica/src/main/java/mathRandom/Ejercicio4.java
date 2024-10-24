package mathRandom;

//Genera un número aleatorio entre 1 y 100 y determina si es múltiplo de 10:
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*100) + 1;
		
		System.out.println("El nñumero generado es: " + num);
		
		if (num % 10 == 0) {
			System.out.println("El número es múltiplo de 10.");
		} else {
			System.out.println("El número no es múltiplo de 10.");
		}

	}

}
