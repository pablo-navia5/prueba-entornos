package practicaAnalizadorTexto;

import java.util.Scanner;

/**
 * @author Pablo
 */
public class Pruebasmenu {
	/**
	 * Metodo main de la clase Pruebasmenu
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;

		do {
			menu();
			for (int i = 0; i <= 10; i++) {
				try {
					System.out.println("TECLEA OPCIÓN(1 a 4):");
					opcion = sc.nextInt();
					// si la opción está entre 1 y 4 incluidos
					if (opcion > 0 && opcion < 5) {
						break;
					}

				} catch (java.util.InputMismatchException e) {
					sc.nextLine();
				}
			}

			switch (opcion) {
			case 1:
				operacionessimples();
				break;
			case 2:
				lecturanotas();
				break;
			case 3:
				compararvariables();
				break;
			case 4:
				System.out.println("----------------------");
				System.out.println("\tFIN");
				System.out.println("----------------------");
				break;

			default:
				System.out.println("Opcion no válida, prueba otra vez");
				break;
			}
		} while (opcion != 4);

	}

	/**
	 * Metodo que imprime el menu.
	 */
	private static void menu() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ejercios de repaso");
		System.out.println("");
		System.out.println("\t1. EJERCICIO 1: operacionessimples");
		System.out.println("\t2. EJERCICIO 2: lecturanotas");
		System.out.println("\t3. EJERCICIO 3: comparar valores");
		System.out.println("\t4. Salir");
		System.out.println("------------------------------------------------------------");

	}


	/**
	 * Metodo para realizar las operaciones simples(sumar, restar, multiplicar, dividir)
	 */
	public static void operacionessimples() {
		// Operaciones con a y b
		int a = 10;
		int b = 5;

		int suma = a + b;
		int resta = a - b;
		int multiplicacion = a * b;
		int division = a / b;

		System.out.println("La suma de " + a + " más " + b + " es igual a " + suma);
		System.out.println("La resta de " + a + " menos " + b + " es igual a " + resta);
		System.out.println("La multipación de " + a + " por " + b + " es igual a " + multiplicacion);
		System.out.println("La division de " + a + " entre " + b + " es igual a " + division);
	}

public static void lecturanotas() {

		Scanner entrada = new Scanner(System.in);

		String nombre_alumno;
		double evaluacion1;
		double evaluacion2;
		double evaluacion3;
		double evaluacion_final;

		System.out.println("Nombre alumno: ");
		nombre_alumno = entrada.nextLine();

		for (;;) {

			try {
				System.out.println("Nota primera evaluación: ");
				evaluacion1 = entrada.nextDouble();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecta, teclea de nuevo:");
				entrada.nextLine();
			}
		}

		for (;;) {
			try {
				System.out.println("Nota segunda evaluación: ");
				evaluacion2 = entrada.nextDouble();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecta, teclea de nuevo:");
				entrada.nextLine();
			}
		}
		for (;;) {
			try {
				System.out.println("Nota tercera evaluación: ");
				evaluacion3 = entrada.nextDouble();
				break;

			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecta, teclea de nuevo:");
				entrada.nextLine();
			}
		}

		evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

		System.out.println("La nota media de " + nombre_alumno + " es " + evaluacion_final);
	}



public static void compararvariables() {

		Scanner entrada = new Scanner(System.in);

		String nombre_alumno;
		int a, b;

		System.out.println("Teclea dos variables enteras: ");

		for (;;) {

			try {
				System.out.println("Variable a: ");
				a = entrada.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecta, teclea de nuevo.");
				entrada.nextLine();
			}
		}

		for (;;) {

			try {
				System.out.println("Variable b: ");
				b = entrada.nextInt();
				break;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Incorrecta, teclea de nuevo.");
				entrada.nextLine();
			}
		}

		// comparamos
		if (a == b) {
			System.out.println("Las variables a y b son iguales.");
		} else {
			if (a < b) {
				System.out.println("La variable a es menor que b.");
			} else {
				System.out.println("La variable a es mayor que b.");
			}

		}
	}

}