/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Usuario
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto, double porcentaje) {
        return monto * (1 - porcentaje / 100.0);
    }

    @Override
    public boolean procesarPago(double monto) {
        // Simulación: siempre retorna true (en un caso real se integraría con pasarela)
        System.out.println("Procesando pago con Tarjeta de " + titular + " por $" + monto);
        return true;
    }
}
