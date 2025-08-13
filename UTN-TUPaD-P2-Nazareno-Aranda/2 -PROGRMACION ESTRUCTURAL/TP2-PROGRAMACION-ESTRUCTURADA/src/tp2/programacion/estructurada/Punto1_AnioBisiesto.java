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

public class Punto1_AnioBisiesto {

    // Método que determina si un año es bisiesto según la regla:
    // divisible por 4, no por 100 salvo que sea divisible por 400.
    public static boolean esBisiesto(int anio) {
        if (anio % 400 == 0) return true;
        if (anio % 100 == 0) return false;
        return anio % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        if (esBisiesto(anio)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }

        sc.close();
    }
}

