/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Usuario
 */
public class PayPal implements Pago {
    private String cuentaEmail;

    public PayPal(String cuentaEmail) {
        this.cuentaEmail = cuentaEmail;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal cuenta " + cuentaEmail + " por $" + monto);
        return true;
    }
}
