
public class Ejercicio6 {

	/**
	 6. Una funci�n que se llame cuadrado, que reciba como par�metro un valor, y devuelva el
valor del n�mero ingresado como par�metro elevado al cuadrado.

	 */
	public static void main(String[] args) {

		cuadrado (10);

	}

	public static void cuadrado(int i) {
		double aux = Math.pow(i, 2);
		System.out.println("El valor " + i + " elevado al cuadrado es: " + aux);
		
	}

}
