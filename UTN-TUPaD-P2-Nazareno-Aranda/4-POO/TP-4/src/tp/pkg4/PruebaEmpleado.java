/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author Usuario
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear empleados con el constructor completo
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Analista", 80000);
        Empleado emp2 = new Empleado(2, "Ana Gómez", "Desarrolladora", 90000);

        // Crear empleados con el constructor sobrecargado (nombre y puesto)
        Empleado emp3 = new Empleado("Luis Torres", "Tester");
        Empleado emp4 = new Empleado("María López", "Diseñadora");

        // Aplicar aumentos
        emp1.actualizarSalario(10.0);      // Aumento del 10%
        emp2.actualizarSalario(5000);    // Aumento fijo de 5000

        // Mostrar información de cada empleado
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
