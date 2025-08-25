/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

public class MainLibro {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);

        // Mostrar información inicial
        libro1.mostrarInfo();

        // Intentar poner un año inválido
        libro1.setAnioPublicacion(-100);  // no debería cambiar
        libro1.setAnioPublicacion(3000);  // tampoco debería cambiar

        // Poner un año válido
        libro1.setAnioPublicacion(2005);

        // Mostrar información final
        libro1.mostrarInfo();
    }
}

