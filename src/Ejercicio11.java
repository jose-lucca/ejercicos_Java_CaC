import java.util.Scanner;


public class Ejercicio11 {

	/**
	11.Una función que dado el radio de un círculo devuelva el área del círculo.

	 */
	public static void main(String[] args) {
		
		//procedimiento
		superficie ();
		
		
		
		//funcion
		
		double resultado = area ();
		System.out.println("El area del Circulo es: " + resultado);
		

	}

	

	public static void superficie() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el Radio: ");
		double radio = sc.nextDouble();
		// superficie del Circulo es PI * Radio^2
		
		double superficie = (Math.PI) * (Math.pow(radio, 2));
		System.out.println("la Superficie del Circulo es: " + superficie);
		
		
	}
	
	public static double area() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el Radio: ");
		double radio = sc.nextDouble();
		return (Math.PI) * (Math.pow(radio, 2));
	}

}
