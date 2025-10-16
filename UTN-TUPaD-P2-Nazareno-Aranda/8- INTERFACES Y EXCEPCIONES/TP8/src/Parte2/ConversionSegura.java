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

public class ConversionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un entero: ");
        String linea = sc.nextLine();
        try {
            int valor = Integer.parseInt(linea);
            System.out.println("Valor convertido: " + valor);
        } catch (NumberFormatException nfe) {
            System.out.println("Formato inválido: no se pudo convertir a entero.");
        } finally {
            sc.close();
        }
    }
}
