//Determina si un año es bisiesto. (Pista: un año es bisiesto si es divisible por 4 y no por 100, excepto si es divisible por 400).
package ejerciciosifelse;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un año: ");
		
		int anio = teclado.nextInt();
		//Verificamos si el año es divisible por 4 (anio % 4 == 0) y no es divisible por 100 (anio % 100 != 0).
		//O, si es divisible por 400 (anio % 400 == 0), entonces es un año bisiesto.
		
		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
		
		teclado.close();


	}

}
