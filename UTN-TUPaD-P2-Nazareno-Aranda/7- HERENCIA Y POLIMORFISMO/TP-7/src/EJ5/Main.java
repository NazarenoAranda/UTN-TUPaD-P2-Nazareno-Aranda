/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        Pagable pago1 = new TarjetaCredito("Ana Pérez");
        Pagable pago2 = new Transferencia("123-456-789");
        Pagable pago3 = new Efectivo();

        procesarPago(pago1, 1500);
        procesarPago(pago2, 2000);
        procesarPago(pago3, 500);
    }
}
