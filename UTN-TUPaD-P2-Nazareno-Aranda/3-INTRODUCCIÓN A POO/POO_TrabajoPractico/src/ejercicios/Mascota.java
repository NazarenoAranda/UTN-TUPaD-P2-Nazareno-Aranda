/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class Mascota {
    // Atributos
    String nombre;
    String especie;
    int edad;

    // Métodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido años. Ahora tiene " + edad + " años.");
    }
}
