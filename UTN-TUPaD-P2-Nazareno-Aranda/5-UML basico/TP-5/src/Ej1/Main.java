/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("imagen1.jpg", "jpg");
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("A12345", "01/01/2025", foto, titular);

        System.out.println(pasaporte);
    }
}
