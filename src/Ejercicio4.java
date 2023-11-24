import java.util.Scanner;


public class Ejercicio4 {

	/**
	 4. Crear una función que lea notas hasta que ingrese -1 y devuelve el promedio de las notas
leídas.
	 */
	public static void main(String[] args) {

		calculoPromedio();
		
		

	} // main

	public static void calculoPromedio() {
		
		int contador = 0;
		int notas = 0;
		int auxiliar = 0;
		int promedio;

		Scanner sc = new Scanner (System.in);

		while (auxiliar !=(-1)){
			System.out.println("Ingrese un valor: ");
			auxiliar = sc.nextInt();
			if (auxiliar !=(-1)){
				notas += auxiliar;
				contador ++;
			}
		}

		System.out.println("LA SUMA DE NOTAS: " + notas);
		System.out.println("Contador: " + contador);

		promedio = notas / contador;
		System.out.println("El promedio de notas es: " + promedio);
		
		
	}
} //class
