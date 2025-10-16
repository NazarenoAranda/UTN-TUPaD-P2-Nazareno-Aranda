/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Edad inválida: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad " + edad + " no está en el rango permitido (0-120).");
        }
    }
}
