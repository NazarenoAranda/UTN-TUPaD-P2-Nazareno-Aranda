/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente1 = new Contribuyente("Carlos Díaz", "20-12345678-9");
        Impuesto impuesto1 = new Impuesto(5000, contribuyente1);

        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto1);
    }
}
