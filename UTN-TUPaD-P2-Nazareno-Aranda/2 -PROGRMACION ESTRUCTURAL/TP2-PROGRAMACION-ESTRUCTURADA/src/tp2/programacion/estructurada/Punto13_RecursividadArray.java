/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2.programacion.estructurada;

/**
 *
 * @author Usuario
 */
public class Punto13_RecursividadArray {

    // Función recursiva para mostrar los precios
    public static void mostrarArrayRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarArrayRecursivo(precios, indice + 1);
        }
    }

    public static void main(String[] args) {

        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales usando función recursiva
        System.out.println("Precios originales:");
        mostrarArrayRecursivo(precios, 0);

        // c. Modificar el precio de un producto específico (índice 2 → 3er elemento)
        precios[2] = 129.99;

        // d. Mostrar precios modificados usando función recursiva
        System.out.println("\nPrecios modificados:");
        mostrarArrayRecursivo(precios, 0);
    }
}
