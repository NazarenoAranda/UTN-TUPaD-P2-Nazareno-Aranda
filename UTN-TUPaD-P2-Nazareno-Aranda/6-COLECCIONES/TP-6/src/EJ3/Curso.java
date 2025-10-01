/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Usuario
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Asignar/cambiar profesor con sincronización segura
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // ya tiene ese profesor, no hacer nada

        Profesor anterior = this.profesor; // guardamos profesor anterior
        this.profesor = p;

        if (anterior != null) {
            anterior.eliminarCursoSinRecursividad(this); // quitar del profesor anterior
        }

        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCursoSinRecursividad(this); // agregar al nuevo profesor
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (Código: " + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
        System.out.println("---------------------------");
    }
}
