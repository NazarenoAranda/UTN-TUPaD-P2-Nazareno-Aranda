/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class MainMascota {
    public static void main(String[] args) {
        // Crear objeto mascota
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 3;

        // Mostrar información inicial
        m1.mostrarInfo();

        // Cumplir años
        m1.cumplirAnios();
        m1.cumplirAnios();

        // Mostrar información final
        m1.mostrarInfo();
    }
}
