package t1.examen;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
	
	public static void pintarPecera(int ancho, int alto) {
		
        // Verificar que el ancho y el alto sean al menos 4 unidades
        if (ancho < 4 || alto < 4) {
            System.out.println("El ancho y el alto deben ser como mínimo de 4 unidades.");
            return;
        }

        // Crear la pecera con el pececito
        char[][] pecera = new char[alto][ancho];

        // Inicializar la pecera con espacios en blanco
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                pecera[i][j] = ' ';
            }
        }

        // Colocar el pececito en una posición aleatoria
        Random random = new Random();
        int xPez = random.nextInt(ancho - 2) + 1;
        int yPez = random.nextInt(alto - 2) + 1;
        pecera[yPez][xPez] = 'P';

        // Imprimir la pecera
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(pecera[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el ancho y el alto de la pecera
        System.out.print("Ingrese el ancho de la pecera (mínimo 4): ");
        int anchoPecera = scanner.nextInt();

        System.out.print("Ingrese el alto de la pecera (mínimo 4): ");
        int altoPecera = scanner.nextInt();

        // Llamar a la función para pintar la pecera
        pintarPecera(anchoPecera, altoPecera);

        scanner.close();
    }
}

