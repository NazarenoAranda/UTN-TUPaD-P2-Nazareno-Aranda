/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Punto5_SumaParesWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        // Pedir números hasta que el usuario ingrese 0
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            // Si es par, se suma
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = sc.nextInt();
        }

        System.out.println("La suma de los numero pares es: " + sumaPares);

        sc.close();
    }
}

