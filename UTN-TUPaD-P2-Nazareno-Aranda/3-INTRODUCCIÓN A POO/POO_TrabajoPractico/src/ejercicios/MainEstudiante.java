/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class MainEstudiante {
    public static void main(String[] args) {
        // Crear un objeto estudiante
        Estudiante est = new Estudiante();
        est.nombre = "Juan";
        est.apellido = "Pérez";
        est.curso = "1°A";
        est.calificacion = 8.0;

        // Mostrar información
        est.mostrarInfo();

        // Subir y bajar calificación
        est.subirCalificacion(1.5);
        est.bajarCalificacion(0.5);

        // Mostrar información final
        est.mostrarInfo();
    }
}
