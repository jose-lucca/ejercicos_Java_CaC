
public class Ejercicio8 {

	/**
	 8.Una funci�n que dado la longitud de un lado de un cuadrado devuelva el per�metro
	 */
	public static void main(String[] args) {

         perimetro (6);  // ingreso por parametro el numero 6

	}

	public static void perimetro(int i) {
		//perimetro de un cuadrado es lado*4
		
		int perimetro = i * 4;
		
		System.out.println("El perimetro de un cuadrado de longitud " + i + " es: " + perimetro);
		
	}

}
