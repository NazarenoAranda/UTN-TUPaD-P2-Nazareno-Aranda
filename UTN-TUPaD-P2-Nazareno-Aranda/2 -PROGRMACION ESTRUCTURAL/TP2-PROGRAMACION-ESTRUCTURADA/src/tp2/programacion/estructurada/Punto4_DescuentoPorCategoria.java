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

public class Punto4_DescuentoPorCategoria {

    // Método que devuelve el porcentaje de descuento según la categoría
    public static double obtenerDescuento(String categoria) {
        return switch (categoria.toUpperCase()) {
            case "A" -> 0.10; // 10%
            case "B" -> 0.15; // 15%
            case "C" -> 0.20; // 20%
            default -> 0.0; // Categoría inválida → sin descuento
        };      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = sc.nextDouble();

        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = sc.next();

        double descuento = obtenerDescuento(categoria);
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        sc.close();
    }
}
