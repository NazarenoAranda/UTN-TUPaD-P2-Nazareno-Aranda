/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Ana López", "33445566");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8901-2345-6789",
                                                       LocalDate.of(2028, 12, 31),
                                                       cliente,
                                                       banco);

        System.out.println(tarjeta);
        System.out.println("Acceso desde cliente ? " + cliente.getTarjeta().getNumero());
    }
}
