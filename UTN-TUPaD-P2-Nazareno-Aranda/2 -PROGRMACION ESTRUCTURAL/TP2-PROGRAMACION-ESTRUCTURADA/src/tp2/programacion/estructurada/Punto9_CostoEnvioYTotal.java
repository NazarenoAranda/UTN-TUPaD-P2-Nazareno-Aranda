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

public class Punto9_CostoEnvioYTotal {

    // a. Calcula el costo de envío según peso y zona
    public static double calcularCostoEnvio(double peso, String zona) {
        double tarifa;
        if (zona.equalsIgnoreCase("Nacional")) {
            tarifa = 5.0; // $5 por kg
        } else if (zona.equalsIgnoreCase("Internacional")) {
            tarifa = 10.0; // $10 por kg
        } else {
            System.out.println("Zona no válida. Usando tarifa nacional por defecto.");
            tarifa = 5.0;
        }
        return peso * tarifa;
    }

    // b. Suma el precio del producto y el costo de envío
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double pesoPaquete = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine();

        // Calcular costo de envío
        double costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        System.out.println("El costo de envio es: " + costoEnvio);

        // Calcular total
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);

        sc.close();
    }
}
