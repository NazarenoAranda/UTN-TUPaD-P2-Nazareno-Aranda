/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    // Agregar curso con sincronización segura
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    // Eliminar curso con sincronización segura
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
        }
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    // Métodos internos sin recursividad (usados por Curso)
    public void agregarCursoSinRecursividad(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void eliminarCursoSinRecursividad(Curso c) {
        cursos.remove(c);
    }

    // Listar cursos
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println(nombre + " no dicta cursos.");
        } else {
            System.out.println("Cursos de " + nombre + ":");
            for (Curso c : cursos) {
                System.out.println("- " + c.getCodigo() + " : " + c.getNombre());
            }
        }
    }

    // Mostrar info
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (ID: " + id + ")");
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
        System.out.println("---------------------------");
    }
}
