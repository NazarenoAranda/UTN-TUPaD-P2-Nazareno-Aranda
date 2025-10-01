/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 50000));
        empleados.add(new EmpleadoTemporal("Juan", 120, 300));
        empleados.add(new EmpleadoPlanta("Lucía", 60000));
        empleados.add(new EmpleadoTemporal("Pedro", 80, 250));

        for (Empleado e : empleados) {
            e.mostrarInfo();

            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }

            System.out.println("-------------------");
        }
    }
}
