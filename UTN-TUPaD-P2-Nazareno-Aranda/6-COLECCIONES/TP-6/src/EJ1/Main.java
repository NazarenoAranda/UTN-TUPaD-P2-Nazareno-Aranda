/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

        // Crear inventario
        Inventario inventario = new Inventario();

        // Crear 5 productos
        Producto p1 = new Producto("P001", "Arroz", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 3500, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 12000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Celular", 180000, 8, CategoriaProducto.ELECTRONICA);

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar productos
        System.out.println("=== LISTADO DE PRODUCTOS ===");
        inventario.listarProductos();

        // 3. Buscar producto por ID
        System.out.println("\n=== BUSCAR PRODUCTO POR ID: P003 ===");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar productos por categoría
        System.out.println("\n=== PRODUCTOS EN CATEGORÍA ELECTRONICA ===");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar producto
        System.out.println("\n=== ELIMINAR PRODUCTO P001 ===");
        inventario.eliminarProducto("P001");
        inventario.listarProductos();

        // 6. Actualizar stock
        System.out.println("\n=== ACTUALIZAR STOCK P002 ===");
        inventario.actualizarStock("P002", 12);
        inventario.buscarProductoPorId("P002").mostrarInfo();

        // 7. Mostrar total de stock
        System.out.println("\n=== TOTAL STOCK ===");
        System.out.println("Total: " + inventario.obtenerTotalStock());

        // 8. Producto con mayor stock
        System.out.println("\n=== PRODUCTO CON MAYOR STOCK ===");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        // 9. Filtrar productos por precio (1000 - 3000)
        System.out.println("\n=== PRODUCTOS CON PRECIO ENTRE 1000 Y 3000 ===");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // 10. Mostrar categorías disponibles
        System.out.println("\n=== CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
