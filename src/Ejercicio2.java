import java.util.Scanner;


public class Ejercicio2 {


	public static void main(String[] args) {
	/*	 Diseñar una función que tenga como parámetros dos números, y que calcule el máximo.*/
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese el primer numero: ");
	double numeroA = sc.nextInt();
	System.out.println("Ingrese el segundo numero: ");
	double numeroB = sc.nextInt();
	
 maximo(numeroA, numeroB);
	
	
		

	

	}

	public static void maximo(double i, double j) {
		if (i>j){
			System.out.println("El valor maximo es: " + i);
		} else {
			System.out.println("El valoar maximo es " + j);
		}
	
	}

}
