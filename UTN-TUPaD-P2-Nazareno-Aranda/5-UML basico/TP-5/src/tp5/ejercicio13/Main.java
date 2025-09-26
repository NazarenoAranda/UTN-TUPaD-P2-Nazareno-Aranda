/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Laura Martínez", "laura@mail.com");

        GeneradorQR generador = new GeneradorQR();
        generador.generar("https://example.com", usuario1);
    }
}
