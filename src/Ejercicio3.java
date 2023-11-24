
public class Ejercicio3 {

	/**
	 3. Crear una función que se llame promedio3, que reciba como parámetro tres valores y
devuelva el promedio de los mismos
	 */
	public static void main(String[] args) {

		// procedimiento
		System.out.println("Con Procedimiento");
		
  promedio3 (10, 20, 10); // ingreso tres valores como parametro -- ojo sigue siengo procedimeinto

// funcion
  System.out.println();
  System.out.println("Con funcion");
  double resultado = promedio (10,20,10);
  System.out.println("El promedio es: " + resultado);

	}

	public static double promedio(int a, int b, int c) {
				return (a + b + c)/3;
	}

	public static void promedio3(int i, int j, int k) {
		double resultado = (i + j + k)/3;
		System.out.println("El promedio es: " + resultado);
	}

}
