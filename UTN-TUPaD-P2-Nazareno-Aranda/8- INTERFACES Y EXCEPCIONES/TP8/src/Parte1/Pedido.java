/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    public enum Estado { CREADO, PAGADO, ENVIADO, ENTREGADO }

    private List<Producto> productos;
    private Estado estado;
    private Notificable clienteNotificable; // opcional, puede ser null

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = Estado.CREADO;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void removerProducto(Producto p) {
        productos.remove(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setClienteNotificable(Notificable n) {
        this.clienteNotificable = n;
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar si hay un cliente asociado
        if (clienteNotificable != null) {
            clienteNotificable.notificar("El pedido cambió a: " + nuevoEstado);
        }
    }

    @Override
    public String toString() {
        return "Pedido [estado=" + estado + ", total=$" + calcularTotal() + "]";
    }
}
