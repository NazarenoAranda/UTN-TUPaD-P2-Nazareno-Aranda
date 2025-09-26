/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-123", 5000);
        Usuario usuario = new Usuario("María Gómez", "98765432");
        Celular celular = new Celular("123456789ABC", "Samsung", "Galaxy S23", bateria, usuario);

        System.out.println(celular);
        System.out.println("Acceso desde usuario ? " + usuario.getCelular().getModelo());
    }
}
