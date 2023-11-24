import java.util.Scanner;


public class Ejercicio12 {

	/**
	 12.Una función que dado un número de mes y me devuelva la cantidad de días de ese mes
(suponiendo que no es un año bisiesto).
	 */
	public static void main(String[] args) {
		
		// procedimiento
		diasDelMes ();
	
		

	}

	public static void diasDelMes() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Elija un mes para saber cuantos dias tiene: ");
		System.out.println("1 - ENERO");
		System.out.println("2 - FEBRERO");
		System.out.println("3 - MARZO");
		System.out.println("4 - ABRIL");
		System.out.println("5 - MAYO");
		System.out.println("6 - JUNIO");
		System.out.println("7 - JULIO");
		System.out.println("8 - AGOSTO");
		System.out.println("9 - SEPTIEMBRE");
		System.out.println("10 - OCTUBRE");
		System.out.println("11 - NOVIEMBRE");
		System.out.println("12 - DICIEMBRE");
		
		int numeroMes = sc.nextInt(); 
		int dias;
		String mes;
		switch (numeroMes) {
		case 1:
			mes = "ENERO";
			 dias =31;
	            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
	            break;
        case 3:
        	mes = "MARZO";
        	 dias =31;
             System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
             break;
        case 5:
        	mes = "MAYO";
        	 dias =31;
             System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
             break;
        case 7:
        	mes = "JULIO";
        	 dias =31;
             System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
             break;
        case 8:
        	mes = "AGOSTO";
        	 dias =31;
             System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
             break;
        case 10:
        	mes = "OCTUBRE";
        	 dias =31;
             System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
             break;
        case 12:
        	mes = "DICIEMBRE";
            dias =31;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
            break;
        case 4:
        	mes = "ABRIL";
            dias =30;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
            break;
        case 6:
        	mes = "JUNIO";
            dias =30;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
            break;
        case 9:
        	mes = "SEPTIEMBRE";
            dias =30;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
            break;
        case 11:
            mes = "NOVIEMBRE";
            dias =30;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
            break;
        case 2:
        	mes = "FEBRERO";
		    dias = 28;
            System.out.println("El Mes " + mes + " tiene: " + dias + " dias");
			break;

		default:
			System.out.println("Debe ingresar un mes entre 1-12");
			break;
		}
		
	}

}
