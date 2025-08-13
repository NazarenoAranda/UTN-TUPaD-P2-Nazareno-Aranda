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

public class Punto7_ValidacionNota {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        // Ciclo do-while para asegurar al menos una ejecución
        do {
            System.out.print("Ingrese una nota (0 a 10): ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("❌ Nota invalida. Intente nuevamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println(" Nota valida ingresada: " + nota);

        sc.close();
    }
}

