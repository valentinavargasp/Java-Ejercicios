import java.util.Scanner;

public class EjercicioEstacionamiento {

	public static void main(String[] args) {
		/*
		 * Solicitar por teclado los datos de la patente del vehículo y el tipo de
		 * estacionamiento
		 */

		String patente = "";
		int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
		double total, totalDia = 0;
		Scanner teclado = new Scanner(System.in);

		/*
		 * El programa debe calcular el monto a pagar por cada cliente en función del
		 * tipo de estacionamiento seleccionado. La carga de datos debe continuar hasta
		 * que el usuario ingrese la palabra "fin" en lugar de la patente.
		 */

		while (!patente.equalsIgnoreCase("fin")) {
			System.out.println("Ingrese la patente de su vehículo:");
			System.out.println("Para salir ingrese: 'fin' ");
			patente = teclado.nextLine();

			if (!patente.equalsIgnoreCase("fin")) {

				System.out.println("Ingrese el tipo de servicio: \n");
				System.out.println("1 - Por hora.");
				System.out.println("2 - Media jornada (5 horas) ");
				System.out.println("3 - Jornada completa (Hasta 10 horas) ");
				

				teclado = new Scanner(System.in);
				tipoServicio = teclado.nextInt();

				/*
				 * Por hora (3usd la hora) Media jornada (15 usd y 5% descuento) Jornada
				 * completa (3o usd y 10 % descuento)
				 */

				if (tipoServicio <= 0 || tipoServicio > 3) {
					System.out.println("Ingrese un servicio correcto.");
				} else {
					if (tipoServicio == 1) {
						System.out.println("Ingrese la cantidad de horas que desea estacionar.");
						cantHoras = teclado.nextInt();
						total = cantHoras * 3;
						System.out.println("El total de su estacionamiento es de: " + total);
						cont1++;
						totalDia = totalDia + total;
					} else {
						if (tipoServicio == 2) {
							System.out.println("El servicio de media jornada es de 5 hs y tiene un descuento del 5%.");
							total = 15 - (15 * 0.05);
							System.out.println("El total de su estacionamiento es de: " + total);
							cont2 = cont2 + 1;
							totalDia = totalDia + total;
						} else {
							System.out.println(
									"El servicio de jornada completa es de 10 hs y tiene un descuento del 10%.");
							total = 30 - (30 * 0.10);
							System.out.println("El total de su estacionamiento es de: " + total);
							cont3++;
							totalDia = totalDia + total;
						}
					}
					System.out.println("Muchas gracias por su compra!");
				}
				
				teclado = new Scanner(System.in);
			}
		}

		System.out.println("============================================\n");
		System.out.println("Totales monetarios del día");
		System.out.println("Cantidad de servicios por hora: " + cont1);
		System.out.println("Cantidad de servicios Media Jornada: " + cont2);
		System.out.println("Cantidad de servicios Jornada Completa: " + cont3);
		System.out.println("El monto toal recaudado es de: $ " + totalDia);
	}

}
