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

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Dividendo: ");
            double a = Double.parseDouble(sc.nextLine());

            System.out.print("Divisor: ");
            double b = Double.parseDouble(sc.nextLine());

            // ? Aquí verificamos el divisor antes de dividir
            if (b == 0) throw new ArithmeticException("División por cero");

            double resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Error: entrada no numérica.");
        } finally {
            sc.close();
        }
    }
}
