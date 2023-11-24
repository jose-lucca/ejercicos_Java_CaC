
public class Ejercicio6 {

	/**
	 6. Una función que se llame cuadrado, que reciba como parámetro un valor, y devuelva el
valor del número ingresado como parámetro elevado al cuadrado.

	 */
	public static void main(String[] args) {

		cuadrado (10);

	}

	public static void cuadrado(int i) {
		double aux = Math.pow(i, 2);
		System.out.println("El valor " + i + " elevado al cuadrado es: " + aux);
		
	}

}
