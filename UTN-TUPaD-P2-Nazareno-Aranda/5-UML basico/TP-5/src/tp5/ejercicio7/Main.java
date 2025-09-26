/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5.ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR-998877");
        Conductor conductor = new Conductor("Pedro Ramírez", "LIC-445566");
        Vehiculo vehiculo = new Vehiculo("AB123CD", "Toyota Corolla", motor, conductor);

        System.out.println(vehiculo);
        System.out.println("Acceso desde conductor ? " + conductor.getVehiculo().getPatente());
    }
}
