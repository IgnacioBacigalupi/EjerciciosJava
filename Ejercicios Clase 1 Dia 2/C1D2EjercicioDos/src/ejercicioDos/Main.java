package ejercicioDos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//a  		
				// Declaracion de variables

				int num1;

				double num2;

				String palabra;

				boolean banderas;
				// Habilitar entrada de datos
				Scanner scanner = new Scanner(System.in);

				System.out.println("Introduce un número entero");
				num1 = scanner.nextInt();
				System.out.println("Introduce un número decimal");
				num2 = scanner.nextDouble();
				System.out.println("Introduce una palabra");
				palabra = scanner.next();
				System.out.println("Introduce una bandera");
				banderas = scanner.nextBoolean();

				System.out.println("Valor de num1: " + num1);
				System.out.println("Valor de num2: " + num2);
				System.out.println("Valor de palabra: " + palabra);
				System.out.println("Valor de banderas: " + banderas);
				
				/* B)   System.out.println("Introduce un número entero");
				 *        num1 = scanner.nextBoolean();
				 *        System.out.println("Introduce un número decimal");
				 *        num2 = scanner.next();
				 *        System.out.println("Introduce una palabra");
				 *        palabra = scanner.nextInt();
				 *        System.out.println("Introduce una bandera");
				 *        bandera = scanner.nextDouble();*/
			}


	}


