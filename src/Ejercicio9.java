
public class Ejercicio9 {

	/**
	 9. Una función que dado la longitud de un lado de un cuadrado devuelva la superficie.

	 */
	public static void main(String[] args) {

		//procedimiento
		superficie (6);   // ingreso el 6 como parametro
		
		//funcion
		double resultado = superfi (6);
		System.out.println("La Superficie del cuadrado es " + resultado);
	}

	public static double superfi(int i) {
		// TODO Auto-generated method stub
		return i*i;
	}

	public static void superficie(int i) {
		// superficie de un cuadrado es lado * lado
		
		int superficie = i * i;
		System.out.println("La superficies de un cuadrado de lado " + i + " es "+ superficie);
	}

}
