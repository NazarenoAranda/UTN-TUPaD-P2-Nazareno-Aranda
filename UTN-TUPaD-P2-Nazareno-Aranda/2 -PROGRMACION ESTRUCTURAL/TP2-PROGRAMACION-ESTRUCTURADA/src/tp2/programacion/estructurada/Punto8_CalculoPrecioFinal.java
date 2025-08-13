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

public class Punto8_CalculoPrecioFinal {

    // Variable estática para seguir la firma pedida: calcularPrecioFinal(impuesto, descuento)
    // Asignamos el precio base a esta variable antes de llamar al método.
    private static double precioBase;

    /**
     * Calcula el precio final usando la fórmula:
     * PrecioFinal = PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
     * Los parámetros impuesto y descuento se reciben en porcentaje (ej: 10 para 10%).
     */
    public static double calcularPrecioFinal(double impuestoPorc, double descuentoPorc) {
        double impuesto = impuestoPorc / 100.0;
        double descuento = descuentoPorc / 100.0;

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuestoPct = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double descuentoPct = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(impuestoPct, descuentoPct);
        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }
}
