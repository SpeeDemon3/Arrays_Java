package actividad02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Antonio Ruiz Benito DAW
 */

public class Ejercicio01 {

	public static void main (String[] args) {
		
		// Creo el array de 5 posiciones incialmente a 0 cada posición de tipo double
		double[] recipiente = { 0.0, 0.0, 0.0, 0.0, 0.0}; 
		
		
		
//		// Comento esta parte del ejercicio porque en la parte 1.3. tengo que modificar cosas para utilizar el DO WHILE y seguir con el ejercicio
		// Esta parte estara mas abajo de manera ejecutable
//		/* 1.1. */
//		// Ofrezco las opciones al usuario
//		System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
//		System.out.println("1. Añadir refresco a un recipiente.");
//		System.out.println("2. Quitar refresco de un recipiente.");
//		System.out.println("3. Calcular el total de refresco.");
//		System.out.println("0. Finalizar");
//		
//		// Utilizo la clase Scanner para pedir datos al usuario
//		Scanner sc = new Scanner(System.in);
//		
//		// Creo la variable usuario de tipo int para recoger el valor seleccionado por el usuario utilizando la clase Scanner
//		int usuario = sc.nextInt();
//		
//		
//		/* 1.2. */
//		
//		// Creo la variable longitudArray para poder saber la logintud del array recipiente
//		int longitudArray = recipiente.length;
//		
//		// Utilizo una estructura de selección switch para controlar los valores 1, 2, 3 sleccionados por el usuario
//		// y mostrar por consola el estado de los recipientes
//		switch(usuario) {
//			case 1:
//				// Con un bucle FOR y utilizando la variable logitudArray cmomo condición recorro el array y recogo el valor para imprimirlo
//				for(int i = 0; i < longitudArray; i++) {
//					// Con la variable litros saco por consola cada posición del array
//					double litros = recipiente[i];
//					System.out.println("El recipiente "+ i + " contiene " + litros + " litros");
//				}
//			break;
//			
//			case 2:
//				for(int i = 0; i < longitudArray; i++) {
//					double litros = recipiente[i];
//					System.out.println("El recipiente "+ i + " contiene " + litros + " litros");
//				}
//			break;
//			
//			case 3:
//				for(int i = 0; i < longitudArray; i++) {
//					double litros = recipiente[i];
//					System.out.println("El recipiente "+ i + " contiene " + litros + " litros");
//				}
//			break;
//				
//		}
		
		
		/* 1.3. */
		
		// Utilizo la clase Scanner para pedir datos al usuario 
			Scanner sc = new Scanner(System.in);
					
		int usuario = 0;
		
		// Controlo con un bucle DO WHILE que mientras no se seleccione la opción número 0 se siga ejecutando el programa
		do {
			
			// Ofrezco las opciones al usuario
			System.out.println("Introduzca la operación a realizar del siguiente menú de opciones:");
			System.out.println("1. Añadir refresco a un recipiente.");
			System.out.println("2. Quitar refresco de un recipiente.");
			System.out.println("3. Calcular el total de refresco.");
			System.out.println("0. Finalizar");
			
			
			
			// Creo la variable usuario de tipo int para recoger el valor seleccionado por el usuario utilizando la clase Scanner
			// Capturo si el usuario no introduce un valor numérico y vuelvo al inicio del bucle en caso de que introduzca una letra
			try {
				usuario = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto vuelva a intentarlo.");
				sc.next();
				continue;
			}
			
			// Con el if controlo que el valor introducido no sea negativo o salga del rango numérico de opciones
			if (usuario < 0 || usuario > 3) {
				System.out.println("El valor introducido no es correcto vuelva a intentarlo.");
				continue;
			}
			
			
			/* 1.2. */
			
			// Creo la variable longitudArray para poder saber la logintud del array recipiente
			int longitudArray = recipiente.length;
			
			// Utilizo una estructura de selección switch para controlar los valores 1, 2, 3 sleccionados por el usuario
			// y mostrar por consola el estado de los recipientes
			switch(usuario) {
				/* 1.7. */
				// Añado el case 0 para controlar cuando el usuario utiliza la opción 0
				case 0:
					System.out.println("Gracias por utilizar el programa.");
				break;
					
				case 1:
					/* 1.4. - 1.4.1. */
					
					// Inicializo las 2 variables a -1 para que entre en el bucle
					int selecRecip = -1;
					double selecRefres = -1;
					// Con el bucle DO WHILE controlo que el usuario respete los rangos numéricos
					do {
						// Pido al usuario el recipiente que desea llenar
						System.out.println("Selecciona el número de recipiente entre el 0 y el 4 que deseas llenar por favor.");
						// Almaceno el valor en la variable selecRecip utilizando la clase Scanner y el metodo nextInt() para leer el valor de tipo entero
						selecRecip = sc.nextInt();
						// Utilizo un condicional if comprobar el valor, si no esta bien mostrar un mensaje de error y con continue volver a pedirlo
						if (selecRecip < 0 || selecRecip > 4) {
							System.out.println("Los valores introducidos no son validos.");
							continue;
						} 
						
						// Pido al usuario la cantidad que desea rellenar
						System.out.println("Perfecto, ahora selecciona la cantidad de refresco que deseas añadir por favor.");
						// Almaceno en la variable selecRefres el valor utilizando la clase Scanner y el metodo nextDouble() para leer el valor de tipo double
						selecRefres = sc.nextDouble();
						// Utilizo un condicional if comprobar el valor, si no esta bien mostrar un mensaje de error y con continue volver a pedirlo
						if (selecRefres < 0) {
							System.out.println("Has introducido un valor negativo, introduce valores positivos para llenar el recipiente, por favor.");
							continue;
						}
						
						
					} while(selecRecip < 0 || selecRecip > 4 || selecRefres < 0);
					
					// Modifico la el valor de dentro del array pasandole los parámetros que el usuario a seleccionado
					recipiente[selecRecip] = selecRefres;
					
					
					// Con un bucle FOR y utilizando la variable logitudArray como condición recorro el array y recogo el valor para imprimirlo
					for(int i = 0; i < longitudArray; i++) {
						// Con la variable litros saco por consola cada posición del array
						double litros = recipiente[i];
						System.out.println("El recipiente "+ i + " contiene " + litros + " litros");											
					}
				break;
				
				case 2:
					/* 1.5. - 1.5.1*/
					
					int selecRecip2 = -1;
					double quitarCantidad = -1;
					
					do {
						// Pido al usuario que seleccione el recipiente
						System.out.println("Selecciona el número de recipiente entre el 0 y el 4 al que desea quitar refresco.");
						// Guardo el valor en la variable selecRecip2 de tipo int, con la clase scanner y el método nextInt() el recipiente seleccionado 
						selecRecip2 = sc.nextInt();
						// Con un condicional if controlo que el usuario introduzca valores validos, de no ser así con continue vuelvo a pedir el valor
						if(selecRecip2 < 0 || selecRecip2 > 4) {
							System.out.println("Los valores introducidos no son válidos, por favor vuelva a intentarlo");
							continue;
						}
						// Pido al usuario la cantidad que desea quitar
						System.out.println("Selecciona la cantidad que desea quitar del recipiente.");
						// Guardo el valor en la variable quitarCantidad de tipo double, con la clase scanner y el metodo nextDouble() la cantidad a quitar
						quitarCantidad = sc.nextDouble();
						// Con un condicional if controlo que la cantidad de refresco no se pueda quedar en valores negativos
						if(recipiente[selecRecip2] < quitarCantidad) {
							System.out.println("Error, por favor vuelva a introducir el valor.");
						} else {
							// Modifico el array con los valores pasados por el usuario
							recipiente[selecRecip2] -= quitarCantidad; 
							break;
						}
						
					} while(selecRecip2 < 0 || selecRecip2 > 4 || quitarCantidad < 0 || recipiente[selecRecip2] < quitarCantidad);
					
					
					for(int i = 0; i < longitudArray; i++) {
						double litros = recipiente[i];
						System.out.println("El recipiente " + i + " contiene " + litros + " litros");
					}
				break;
				
				case 3:
					/* 1.6. */
					// Añado la variable suma de tipo double para sumar los valores de dentro del array
					// y con el bucle for los sumo y muestro por pantalla la cantidad total de litros que hay
					double suma = 0;
					for(int i = 0; i < longitudArray; i++) {
						suma += recipiente[i];
						double litros = recipiente[i];
						System.out.println("El recipiente "+ i + " contiene " + litros + " litros");
					}
					
					System.out.println("En total hay " + suma + " litros.");

				break;
					
			}	
			
			
		} while (usuario != 0);
		
		System.out.println("Ejercicio realizado por Antonio Ruiz Benito.");
	}
}
