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

public class Punto2_MayorDeTres {

    // Método que devuelve el mayor de tres enteros
    public static int mayorDeTres(int a, int b, int c) {
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        return mayor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = sc.nextInt();

        int mayor = mayorDeTres(num1, num2, num3);
        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}
