/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio5;

public class Main {
    public static void main(String[] args) {
        Propietario propietario = new Propietario("Carlos Díaz", "44556677");
        Computadora compu = new Computadora("Lenovo", "SN12345", "B450M", "AMD B450", propietario);

        System.out.println(compu);
        System.out.println("Acceso desde propietario ? " + propietario.getComputadora().getMarca());
    }
}