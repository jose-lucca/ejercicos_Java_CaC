
public class Ejercicio7 {

	/**
	 7. Una función que se denomine imprimirValores que dado un número por parámetro,
imprima cual es el valor siguiente, el doble y el cuadrado.

	 */
	public static void main(String[] args) {

		imprimirValores (8); //ingreso valor 8 por parametro

	}

	public static void imprimirValores(int i) {
		int siguiente = i + 1;
		int doble = i *2;
		int cuadrado = (int) Math.pow(i, 2);
		
System.out.println("Valor ingresado es: " + i);
System.out.println("El numero siguiente es "+ siguiente);
System.out.println("El doble es: " + doble);
System.out.println("El cuadrado es: " + cuadrado);
	}

}
