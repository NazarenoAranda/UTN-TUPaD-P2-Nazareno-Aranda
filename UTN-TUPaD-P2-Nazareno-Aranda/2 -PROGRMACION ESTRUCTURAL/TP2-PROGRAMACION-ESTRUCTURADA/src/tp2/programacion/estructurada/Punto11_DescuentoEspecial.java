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

public class Punto11_DescuentoEspecial {

    // Variable global (constante) con el descuento del 10%
    static final double DESCUENTO_ESPECIAL = 0.10;

    /**
     * Calcula el precio final aplicando el descuento especial global.
     * También muestra el descuento aplicado.
     */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL; // variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        // Calcular y mostrar el descuento
        calcularDescuentoEspecial(precio);

        sc.close();
    }
}
