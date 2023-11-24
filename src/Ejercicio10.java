import java.util.Scanner;




public class Ejercicio10 {
	
	/*
	 * 10.Una función que dado el radio de un círculo devuelva la circunferencia (perímetro del
círculo).

	 */
	public static void main (String [] args) {
		
		// procedimiento
		perimetro ();   
		
		
		// funcion
		
		double resultado = perime();
		System.out.println("El perimetro del Circulo es: " + resultado);
		
	}

	

	public static void perimetro() {
		Scanner sc = new Scanner (System.in);
		System.out.println("INGRESE el valor del Radio: ");
		int radio = sc.nextInt();
		// perimetro del circulo es Pi * 2 radio
		
		double perimetro = Math.PI * 2 * radio;
		
		System.out.println("El Perimetro del circulo es: " + perimetro);
		
		
	}
	
	public static double perime() {
		Scanner sc = new Scanner (System.in);
		System.out.println("INGRESE el valor del Radio: ");
		int radio = sc.nextInt();
		return (Math.PI) * 2 * radio;
	}
}
