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

public class Punto3_ClasificacionEdad {

    // Método que clasifica la edad según el rango
    public static String clasificarEdad(int edad) {
        if (edad < 12) {
            return "Ninio";
        } else if (edad <= 17) {
            return "Adolescente";
        } else if (edad <= 59) {
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        String clasificacion = clasificarEdad(edad);
        System.out.println("Eres un " + clasificacion + ".");

        sc.close();
    }
}
