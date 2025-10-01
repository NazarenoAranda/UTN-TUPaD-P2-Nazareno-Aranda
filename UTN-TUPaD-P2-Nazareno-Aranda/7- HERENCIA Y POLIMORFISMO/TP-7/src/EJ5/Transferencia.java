/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
 *
 * @author Usuario
 */
public class Transferencia implements Pagable {
    private String cuenta;

    public Transferencia(String cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " mediante transferencia a la cuenta " + cuenta);
    }
}