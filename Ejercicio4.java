package t1.examen;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static boolean esPalindromo (String frase) {
		
		boolean esPalindromo = true;
		
		frase = frase.replace(" ", "").toLowerCase(); //elimino los espacios vacíos y convierto todas las letras en minúsculas
		
		for(int i = 0 ; i<=frase.length() / 2 ; i++) {
			if(frase.charAt(i) != frase.charAt(frase.length() -1 -i)) { //Comparo la posición inical con la final hasta llegar a la mitad de la frase
				esPalindromo = false;
				System.out.println("No es un palíndromo");
			}
		}
		
		if(esPalindromo == true) {
			System.out.println("Es un palíndromo");
		}
		
		return esPalindromo;
	}
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la frase");
		String frase = sc.nextLine();
		
		esPalindromo(frase);
		
	}

}
