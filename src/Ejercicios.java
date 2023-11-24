
public class Ejercicios {

	
	public static void main(String[] args) {
		/*Realizar una función, a la que se le pase como parámetro un número N, y muestre por
		consola N veces, el siguiente mensaje: “Bienvenidos al curso Full Stack”*/

 System.out.println("FUNCION CON FOR"); // en realidad es un procedimiento
repetir(2);

System.out.println("FUNCION CON WHILE"); // en realidad es un procedimiento
repetirWhile(3);
}

	public static void repetir(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println((j+1) + " Bienvenidos al curso Full Stack");
			
		}
		
	}
	
	
	public static void repetirWhile (int i){
		while (i>0){
			System.out.println((i) + " Bienvenidos al curso Full Stack"  );
			i--;
		}
	}
}
