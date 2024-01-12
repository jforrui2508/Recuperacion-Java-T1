package t1.examen;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static boolean confirmacion () { //Creo una función booleana para que el resultado sea true o false 
		
		Scanner sc = new Scanner (System.in);
		
		boolean confirmado = false; //Establezco la variable que devolverá la función
		boolean error = false; //Establezco la primera condición de repetición del bucle
		int intentos = 0; //Establezco la segunda condición de repetición del bucle
		
		do {
		
		System.out.println("¿Desea confirmar?");
		String respuesta = sc.nextLine();
			
		switch(respuesta) {
		
		case "s" , "S", "sí" ,"SI", "Si" , "si" ,"Sí" , "j" , "ja" , "JA" , "Ja" : //Respuestas válidas
			System.out.println("Ha confirmado");
			confirmado = true;
			error = false; //respuesta válida
			intentos++;
			break;
		case "n" , "N",  "no" , "NO" , "No" , "nein" , "NEIN" , "Nein": //Respuestas válidas
			System.out.println("Ha rechazado");
			confirmado = false;
			error = false; //respuesta válida
			intentos++;
			break;
		default :
			if(intentos <=1) {
			System.out.println("Error.Elija una respuesta válida");
			System.out.println("Ha perdido un intento");
			error=true; //respuesta no válida
			intentos++;
			}else if(intentos == 2) { //creo esto para que al llegar a 3 intentos cambie el mensaje final.
			System.out.println("No puede elegir más");
			error = true;
			intentos++;
			}
			break;
		}
		
		}while(error==true && intentos <= 2);
		
		if(intentos==3) {
			confirmado = false; //Si responde mal 3 veces entonces no ha confirmado por tanto es falso
		}
		
		return confirmado;
	}
	
	public static void main (String[]args) {
		
		confirmacion();
		
	}

}
