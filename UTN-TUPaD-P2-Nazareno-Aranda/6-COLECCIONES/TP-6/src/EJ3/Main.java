/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. Crear universidad
        Universidad uni = new Universidad("Universidad Nacional");

        // 2. Crear profesores
        Profesor prof1 = new Profesor("P001", "Ana López", "Matemática");
        Profesor prof2 = new Profesor("P002", "Carlos Pérez", "Física");
        Profesor prof3 = new Profesor("P003", "Lucía Martínez", "Programación");

        // 3. Crear cursos
        Curso c1 = new Curso("C101", "Álgebra I");
        Curso c2 = new Curso("C102", "Física General");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Cálculo");
        Curso c5 = new Curso("C105", "Estructuras de Datos");

        // Agregar profesores y cursos a la universidad
        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 4. Asignar profesores a cursos
        uni.asignarProfesorACurso("C101", "P001");
        uni.asignarProfesorACurso("C102", "P002");
        uni.asignarProfesorACurso("C103", "P003");
        uni.asignarProfesorACurso("C104", "P001");
        uni.asignarProfesorACurso("C105", "P003");

        // 5. Listar cursos con profesor y profesores con sus cursos
        System.out.println("=== LISTA DE CURSOS ===");
        uni.listarCursos();

        System.out.println("\n=== LISTA DE PROFESORES ===");
        uni.listarProfesores();

        // 6. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DEL CURSO C105 A P002 ===");
        uni.asignarProfesorACurso("C105", "P002");

        System.out.println("\n=== LISTA DE CURSOS DESPUÉS DEL CAMBIO ===");
        uni.listarCursos();

        System.out.println("\n=== LISTA DE PROFESORES DESPUÉS DEL CAMBIO ===");
        uni.listarProfesores();

        // 7. Eliminar un curso y un profesor
        System.out.println("\n=== ELIMINAR CURSO C102 ===");
        uni.eliminarCurso("C102");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("\n=== ELIMINAR PROFESOR P001 ===");
        uni.eliminarProfesor("P001");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte: cantidad de cursos por profesor
        System.out.println("\n=== CANTIDAD DE CURSOS POR PROFESOR ===");
        for (Profesor p : new Profesor[]{prof1, prof2, prof3}) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
