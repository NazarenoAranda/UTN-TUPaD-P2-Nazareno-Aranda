/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Laura Fernández", "1122334455");
        Mesa mesa = new Mesa(12, 4);
        Reserva reserva = new Reserva("2025-10-01", "20:30", cliente, mesa);

        System.out.println(reserva);
        System.out.println("Acceso desde reserva ? Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Acceso desde reserva ? Mesa: " + reserva.getMesa().getNumero());
    }
}
