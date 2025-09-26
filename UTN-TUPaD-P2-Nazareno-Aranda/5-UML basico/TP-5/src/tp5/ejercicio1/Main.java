/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Pérez", "12345678");
        Pasaporte pasaporte = new Pasaporte("AR123456", LocalDate.now(), "foto_juan.jpg", "JPG", titular);

        System.out.println(pasaporte);
        System.out.println("Acceso desde titular ? " + titular.getPasaporte().getNumero());
    }
}
