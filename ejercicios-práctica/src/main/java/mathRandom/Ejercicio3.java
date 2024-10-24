package mathRandom;

//Genera un número aleatorio entre 0 y 100 y determina si es mayor, menor o igual a 50:
public class Ejercicio3 {

	public static void main(String[] args) {
		 int num = (int) (Math.random()*100) +1;
		 
		 System.out.println("El número generado es: " + num);
		 
		 if(num < 50) {
			 System.out.println("El número es menor que 50.");
		 } else if (num > 50) {
			 System.out.println("El número es mayor que 50.");
		 } else {
			 System.out.println("El número es 50.");
		 }

	}

}
