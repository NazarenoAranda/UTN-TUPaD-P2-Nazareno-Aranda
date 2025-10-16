/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte1;

/**
 *
 * @author Usuario
 */
public class EcommerceDemo {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan@ejemplo.com");

        // Crear productos
        Producto p1 = new Producto("Auriculares", 120.0);
        Producto p2 = new Producto("Mouse", 50.0);

        // Crear pedido y asociar cliente para notificaciones
        Pedido pedido = new Pedido();
        pedido.setClienteNotificable(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        System.out.println("Pedido creado: " + pedido);
        // Cambiar estado y ver notificación
        pedido.cambiarEstado(Pedido.Estado.PAGADO);

        // Procesar pago con tarjeta (aplicar descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Juan Perez");
        double total = pedido.calcularTotal();
        double totalConDesc = tarjeta.aplicarDescuento(total, 10); // 10% de descuento
        if (tarjeta.procesarPago(totalConDesc)) {
            pedido.cambiarEstado(Pedido.Estado.ENVIADO);
        }

        System.out.println("Pedido final: " + pedido);
    }
}
