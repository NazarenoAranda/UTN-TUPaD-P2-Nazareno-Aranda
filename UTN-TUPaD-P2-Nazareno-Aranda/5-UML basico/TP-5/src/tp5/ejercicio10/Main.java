/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Lucía Fernández", "12345678");
        ClaveSeguridad clave1 = new ClaveSeguridad("XYZ987", LocalDate.now());

        CuentaBancaria cuenta1 = new CuentaBancaria("000123456789", 15000.0, clave1, titular1);

        System.out.println(cuenta1);
    }
}
