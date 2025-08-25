/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class NaveEspacial {
    // Atributos
    String nombre;
    int combustible;
    final int MAX_COMBUSTIBLE = 100;

    // Métodos
    public void despegar() {
        if (combustible > 0) {
            System.out.println(nombre + " ha despegado 🚀");
        } else {
            System.out.println(nombre + " no puede despegar, no tiene combustible.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; // cada unidad de distancia consume 2 de combustible
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= MAX_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " de combustible. Ahora tiene: " + combustible);
        } else {
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " se recargó al máximo (" + MAX_COMBUSTIBLE + ").");
        }
    }

    public void mostrarEstado() {
         System.out.println("Nave: " + nombre + " | Combustible: " + combustible);
    }
}
    