/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej2;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("Samsung-EB123", 5000);
        Usuario usuario = new Usuario("Ana López", "87654321");
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S21", bateria, usuario);

        System.out.println(celular);
    }
}
