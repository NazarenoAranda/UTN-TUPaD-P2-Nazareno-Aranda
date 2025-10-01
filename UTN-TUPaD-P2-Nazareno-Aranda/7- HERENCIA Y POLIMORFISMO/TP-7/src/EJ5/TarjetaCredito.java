/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
 *
 * @author Usuario
 */
public class TarjetaCredito implements Pagable {
    private String titular;

    public TarjetaCredito(String titular) {
        this.titular = titular;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta de crédito de " + titular);
    }
}