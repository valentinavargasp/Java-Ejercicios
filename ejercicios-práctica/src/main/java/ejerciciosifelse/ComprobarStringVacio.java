//Revisa si una cadena está vacía usando if con string.isEmpty().
package ejerciciosifelse;

import java.util.Scanner;

public class ComprobarStringVacio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese una cadena de texto: ");
		String cadena = teclado.nextLine();
		
        if (cadena.isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            System.out.println("La cadena ingresada es: " + cadena);
        }
        
        teclado.close();
	}

}
