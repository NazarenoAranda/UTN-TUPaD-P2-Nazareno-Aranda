/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4;

/**
 *
 * @author Usuario
 */
public class Empleado {
    // Atributos de la clase
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático (compartido por todos los empleados)
    private static int totalEmpleados = 0;

    // Constructor completo (recibe todos los atributos)
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;              // "this" se usa para diferenciar atributos de parámetros
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;  // Asigna id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000;          // Salario por defecto
        totalEmpleados++;
    }

    // Métodos para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    // Método toString para mostrar información
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    // Getters (lectura de atributos)
public int getId() {
    return id;
}

public String getNombre() {
    return nombre;
}

public String getPuesto() {
    return puesto;
}

public double getSalario() {
    return salario;
}

// Setters (modificación de atributos)
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setPuesto(String puesto) {
    this.puesto = puesto;
}

public void setSalario(double salario) {
    this.salario = salario;
}
}
