/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class Gallina {
    // Atributos
    int idGallina;
    int edad;
    int huevosPuestos;

    // Métodos
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}
