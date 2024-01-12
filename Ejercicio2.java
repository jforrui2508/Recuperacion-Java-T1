package t1.examen;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static long cambiarDigito(long numero, int posicion, int nuevoValor) {
	    // Convierte el número a una cadena para facilitar la manipulación de los dígitos
	    String numeroStr = Long.toString(numero);

	    // Extrae los dígitos antes y después de la posición deseada
	    String parteAnterior = numeroStr.substring(0, posicion - 1);
	    String partePosterior = numeroStr.substring(posicion);

	    // Construye la nueva cadena con el dígito cambiado
	    String nuevoNumeroStr = parteAnterior + nuevoValor + partePosterior;

	    // Convierte la cadena resultante de nuevo a long
	    return Long.parseLong(nuevoNumeroStr);
	}
	
	public static void main (String[]args){
		
		Scanner scanner = new Scanner(System.in);

			try {
				System.out.print("Por favor, introduzca un número entero positivo: ");
		        long numero = scanner.nextLong();

		        System.out.print("Introduzca la posición dentro del número:");
		        int posicion = scanner.nextInt();

		        System.out.print("Introduzca el nuevo dígito:");
		        int nuevoValor = scanner.nextInt();

		        long resultado = cambiarDigito(numero, posicion, nuevoValor);

		        System.out.println("El número resultante es: " + resultado);
		    } catch (Exception e) {
		        System.out.println("Error: Ingresa datos válidos.");
		    } finally {
		        scanner.close();
		    }
		}
}


