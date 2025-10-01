/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

        // 1. Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A01", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A02", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A03", "Julio Cortázar", "Argentina");

        // 3. Agregar 5 libros a la biblioteca
        biblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, a1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, a3);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la cámara secreta", 1998, a2);
        biblioteca.agregarLibro("ISBN005", "El amor en los tiempos del cólera", 1985, a1);

        // 4. Listar todos los libros
        System.out.println("=== LISTADO DE LIBROS ===");
        biblioteca.listarLibros();

        // 5. Buscar un libro por ISBN
        System.out.println("\n=== BUSCAR LIBRO ISBN002 ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) {
            buscado.mostrarInfo();
        }

        // 6. Filtrar libros por año
        System.out.println("\n=== LIBROS DEL AÑO 1997 ===");
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar un libro
        System.out.println("\n=== ELIMINAR LIBRO ISBN003 ===");
        biblioteca.eliminarLibro("ISBN003");
        biblioteca.listarLibros();

        // 8. Mostrar cantidad de libros
        System.out.println("\n=== TOTAL DE LIBROS EN LA BIBLIOTECA ===");
        System.out.println("Cantidad: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores disponibles
        biblioteca.mostrarAutoresDisponibles();
    }
}
