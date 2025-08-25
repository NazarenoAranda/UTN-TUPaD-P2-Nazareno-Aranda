/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
package ejercicios;

public class Estudiante {
    // Atributos
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    // Métodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La calificación ha aumentado a: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("La calificación ha disminuido a: " + calificacion);
    }
}
