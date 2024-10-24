package mathRandom;

//Simula el lanzamiento de un dado con Math.random() y muestra el resultado:
public class Ejercicio2 {

	public static void main(String[] args) {
		int dado = (int) (Math.random()*6) + 1;
		System.out.println("El resultado del lanzamiento del dado es: " + dado);

	}

}
