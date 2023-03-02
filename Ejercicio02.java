package actividad02;

import java.io.IOException;
import java.util.Scanner;

/*
 * Antonio Ruiz Benito DAW
 */

public class Ejercicio02 {
	
	public static void main (String[] args) throws IOException {
		
		// Añado la clase Scanner para poder interactuar con el usuario
		Scanner sc = new Scanner(System.in);
		
		/* 2 */
		// Creo un array bidimensional de tipo String con sus valores ya inicializados
		String[][] curso = {
				{"M01", "8", "5", "10", "10"},
				{"M02", "3", "8", "9", "4"},
				{"M03", "9", "7", "6", "9"}
		};
		

		/* 2.1. */
		
		// Creo 2 variables para almacenar la longitud de cada dimension del array
		int primeraDimension = curso.length;
		int segundaDimension = curso[0].length;

		System.out.println("Los valores del Array Bidimensional son:");
		// Genero un salto de línea
		System.out.println();
		// Utilizo 2 bucles FOR para recorrer el array bidimensional y mostrar por consola los valores
		// Utilizo las 2 variables que almacenan la longitud para usarlas como condicional dentro del bucle FOR
		for (int a = 0; a < primeraDimension; a++) {
			for (int b = 0; b < segundaDimension; b++) {
				// Almaceno en la variable dato los valores que me devuelve el bucle FOR
				String dato = curso[a][b];
				System.out.printf("%s ", dato); // Con  printf("%s ") muestro los datos en modo cuadrícula

			}
			System.out.println("\n"); // Hago un salto de línea
		}
		
		

		/* 3 */ 
		// Creo la variable usuario para recoger el valor que pase el usuario y utilizarla como condicional en el bucle DO WHILE
		int usuario;
		
		// Con un blucle DO WHILE muestro el menú hasta que el usuario pulse 0
		do {
			// Creo el menu para mostrar al usuario
			System.out.println("1 - Mostrar el nombre de todas las asignaturas.");
			System.out.println("2 - Modificar el nombre de una asignatura.");
			System.out.println("3 - Modificar la puntuación de una asignatura.");
			System.out.println("4 - Mostrar la puntuación menor de cada una de las asignaturas.");
			System.out.println("0 - Salir");
			
			// Con la clase escaner recogo el valor que me pasa el usuario y lo guardo en la variable usuario
			usuario =  sc.nextInt();
			/* 4.0. */
			// Utilizo un bucle de seleccion switch para controlar los valores que pase el usuario y ejecutar la opcion elegida
			switch (usuario) {
				// Cuando el usuario pulse 0 finalizara el programa mostrandole un mensaje por consola 
				case 0:
					System.out.println("Gracias por utilizar el programa.");
				break;
				
				case 1:
					// Guardo los valores de las posiciones del nombre de las asignaturas en variables de tipo String
					String m1 = curso[0][0];
					String m2 = curso[1][0];
					String m3 = curso[2][0];
					System.out.println("Las asignaturas del curso son:");
					// Imprimo el valor de las variables por consola
					System.out.println(m1 + " - " + m2 + " - " + m3);
					
				break;
				
				case 2:
					
					int opcionModificar;
					
					// Con un bucle while muestro el menu y con un if else controlo que los valores esten dentro del rango
					while (true) {
						System.out.println("Indica que asignatura quieres modificar:");
						System.out.println("Pulse 1 para modificar M01.");
						System.out.println("Pulse 2 para modificar M02.");
						System.out.println("Pulse 3 para modificar M03.");
						opcionModificar = sc.nextInt();
						sc.nextLine(); // Consumo el caracter de nueva linea en el bufer de entrada
						if (opcionModificar < 1 || opcionModificar > 3) {
							System.out.println("Opción incorecta, vuelva a intentarlo");
						}else {
							System.out.println("Has seleccionado la opción: " + opcionModificar);
							break;
						}
					}
					
					// Con if else if controlo cada opción y con la variable nuevoNombre recojo el nuevo valor y modifico el array	
					if (opcionModificar == 1) {
						System.out.println("Introduce el nuevo nombre de la asignatura:");
						String nuevoNombre = sc.nextLine(); // Recojo el valor del usuario
						curso[0][0] = nuevoNombre; // Se lo asigno a la posición del array el nuevo valor
						System.out.println("Asignatura modificada.");	
						} else if (opcionModificar == 2) {
							System.out.println("Introduce el nuevo nombre de la asignatura:");
							String nuevoNombre = sc.nextLine();
							curso[1][0] = nuevoNombre;
							System.out.println("Asignatura modificada.");	
						} else if (opcionModificar == 3) {
							System.out.println("Introduce el nuevo nombre de la asignatura:");
							String nuevoNombre = sc.nextLine();
							curso[2][0] = nuevoNombre;
							System.out.println("Asignatura modificada.");
						} 		
					
				break;
				
				case 3:
					System.out.println("Indica la posición de la nota que deseas modificar.");
					// Unicializo una variable de tipo boolean en false para poder utilizarla en el bucle
					boolean falso = false;
					
					// Utilizo un bucle do while para pedir los valores al usuario condicionado por la variable falso
					// Mientras no sea true seguira pediendo los datos al usuario
					do {
						System.out.println("Indica el número de fila comprendida entre 0 y 2 que corresponde a la asigantura que deseas modificar:");
						// Recojo el valor de la fila y lo guardo en una variable con la clase scanner
						int fila = sc.nextInt();
						System.out.println("Indica la columna comprendida entre 1 y 4 que corresponde a la nota que deseas modificar:");
						// Recojo el valor de la columna y lo guardo en una variable con la clase scanner
						int columna = sc.nextInt();
						
						// Con un bucle if controlo que los valores introducidos por el usuario esten dentro del rango numérico
						if (fila > -1 && fila < 3 && columna > 0 && columna < 5) {
							System.out.println("Introduce la nueva nota.");
							// Guardo la nueva nota en una variable tipo int
							int nuevaNota = sc.nextInt();
							// Con String.valueOf() convierto el dato de tipo int a String
							String notaString = String.valueOf(nuevaNota);
							// Modifico el valor de la matriz								
							curso[fila][columna] = notaString;	
							System.out.println("Modificación realizada.");
							
							// Con un bucle FOR recorro la fila correspondiente a la asignatura e imprimo sus valores
							for (int i = 0; i < curso[fila].length ; i++) {
								// Lo imprimo en formato cuadrícula con printf("%s ");
								System.out.printf("%s ", curso[fila][i]);
							}
							System.out.println("\n");
							falso = true; // Cambiando el valor de la variable a true salgo del bucle do while
							
						} else {
							System.out.println("Los valores no son correctos.");
						}	
						
					} while(falso != true); // Mientras no sea true seguira ejecutandose el bucle
															
				break;
				
				case 4:
					
					System.out.println("Las puntuaciones mas bajas de cada asignatura son:" + "\n");
					// Con el primer bucle for recorro la primera dimension 
					for (int i = 0; i < primeraDimension; i++) {
						// Guardo en notaMenor el valor mas alto para que la primera nota encontrada sea menor que el valor inicial
						int notaMenor = Integer.MAX_VALUE;						
						// Inicializo asignatura en null para poder guardar e imprimir el nombre de las asignaturas 
						String asignatura = null;
						// Comienzo el segundo bucle en 1 para saltar el nombre de las asignaturas
						for (int e = 1; e < segundaDimension; e++) {
							// Convierto en int las notas de la matriz
							int nota = Integer.parseInt(curso[i][e]);
							// Con el condicional comparo la nota actual con la nota menor actual
							// Si la nota actual es menor, se actualiza la variable notaMenor con la nota actual 
							if (nota < notaMenor) {
								notaMenor = nota;
								asignatura = curso[i][0];

							}

						}
						System.out.println(asignatura + " - " + notaMenor + "\n");

					}

				
				break;
				
				// Dentro del default le muestro un mensaje por consola al usuario si los valores numéricos no son correctos
				default:
					System.out.println("Los valores introducidos no son correctos. Por favor vuelva a intentarlo:");
				break;
			}
			
		} while(usuario != 0); // Con esta condicion mentras no seleccione el 0 seguira dentro del bucle
		
		
		System.out.println("Ejercicio realizado por Antonio Ruiz Benito.");
						
	
		
		
		
		
	}

}
