/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class MainGallina {
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 5;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;

        // Simular acciones
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.envejecer();

        // Mostrar estado final
        System.out.println("\n--- Estado Final ---");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
