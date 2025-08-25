/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class MainNave {
    public static void main(String[] args) {
        // Crear nave con 50 de combustible
        NaveEspacial nave1 = new NaveEspacial();
        nave1.nombre = "Explorer";
        nave1.combustible = 50;

        // Estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar
        nave1.avanzar(30);

        // Recargar y volver a intentar
        nave1.recargarCombustible(40);
        nave1.despegar();
        nave1.avanzar(20);

        // Estado final
        System.out.println("\n--- Estado Final ---");
        nave1.mostrarEstado();
    }
}
