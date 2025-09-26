/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio12;

public class Calculadora {

    // Dependencia de uso: recibe un Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto: " + impuesto);
        // Ejemplo de cálculo: 10% del monto
        double resultado = impuesto.getMonto() * 0.10;
        System.out.println("Resultado del cálculo: $" + resultado);
    }
}
