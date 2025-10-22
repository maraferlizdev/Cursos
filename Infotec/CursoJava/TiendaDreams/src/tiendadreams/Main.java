/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadreams;

import java.util.Scanner;
/**
 *
 * @author dsi
 */
public class Main {
    private static TiendaDreams tienda = new TiendaDreams("Dreams Store", "Av. Principal #123");
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Selecciona una opción: ");
            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    registrarCliente();
                    break;
                case 3:
                    registrarVenta();
                    break;
                case 4:
                    consultarVentas();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    listarProductos();
                    break;
                case 7:
                    cargarDatosIniciales();
                    break;
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 8);
    }

    // ======== MÉTODOS DE MENÚ ========

    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ TIENDA DREAMS ===");
        System.out.println("1. Registrar producto");
        System.out.println("2. Registrar cliente");
        System.out.println("3. Registrar venta");
        System.out.println("4. Consultar ventas");
        System.out.println("5. Listar clientes");
        System.out.println("6. Listar productos");
        System.out.println("7. Cargar Base de datos");
        System.out.println("8. Salir");
        System.out.println("===========================");
    }
    
    private static void registrarMenu(String opcion){
        System.out.println("\n--- Registrar ---" + opcion);
    }
    
    private static void registrarProducto() {
        registrarMenu("Productos");
        String nombre = solicitarCampo("Nombre");
        double precio = leerDouble("Precio: ");
        String categoria = solicitarCampo("Categoría");
        int stock = leerEntero("Stock inicial: ");

        tienda.registrarProducto(nombre, precio, categoria, stock);
    }

    private static void registrarCliente() {
        registrarMenu("Cliente");
        String nombre = solicitarCampo("Nombre");
        String correo = solicitarCampo("Correo");
        int telefono = leerEntero("Teléfono:");
        
        tienda.registrarCliente(nombre, correo, telefono);
    }

    private static void registrarVenta() {
        registrarMenu("Venta");
        if (tienda.getClientes().isEmpty() || tienda.getProductos().isEmpty()) {
            System.out.println("Debes tener al menos un cliente y un producto registrado.");
            return;
        }

        System.out.println("Clientes disponibles:");
        for (int i = 0; i < tienda.getClientes().size(); i++) {
            System.out.println((i + 1) + ". " + tienda.getClientes().get(i).getNombre());
        }
        int idxCliente = leerEntero("Selecciona cliente: ") - 1;
        Cliente cliente = tienda.getClientes().get(idxCliente);

        Ventas venta = new Ventas(cliente);

        String continuar;
        do {
            System.out.println("\nProductos disponibles:");
            for (int i = 0; i < tienda.getProductos().size(); i++) {
                Producto p = tienda.getProductos().get(i);
                System.out.println((i + 1) + ". " + p.getNombre() + " (Stock: " + p.getStock() + ")");
            }

            int idxProducto = leerEntero("Selecciona producto: ") - 1;
            int cantidad = leerEntero("Cantidad: ");
            Producto producto = tienda.getProductos().get(idxProducto);

//            venta.registrarVenta(producto, cantidad);
            
            boolean agregado = venta.agregarDetalle(producto, cantidad);
            if (agregado) {
                System.out.println("Producto agregado a la venta.");
            } else {
                System.out.println("No hay suficiente stock para " + producto.getNombre());
            }

            System.out.print("¿Deseas agregar otro producto a la venta? (s/n): ");
            continuar = sc.nextLine().trim().toLowerCase();
        } while (continuar.equals("s"));

        // Al terminar la composición de la venta:
        venta.calcularTotal();          // asegura que el total está actualizado
        tienda.registrarVenta(venta);  // persiste la venta en la tienda
        cliente.agregarCompra(venta);   // registra la compra en el historial del cliente
        venta.mostrarFactura();         // mostramos la factura al finalizar
        System.out.println("✅ Venta registrada correctamente.");
    }

    private static void consultarVentas() {
        System.out.println("\n--- Consultar Ventas ---");
        tienda.mostrarResumenVentas();
    }
    
        private static void listarClientes() {
        System.out.println("\n--- Lista de Clientes ---");
        
        tienda.listarClientes();
    }

    private static void listarProductos() {
        System.out.println("\n--- Lista de Productos ---");
        tienda.listarProductos();
    }
    
    // ======== UTILIDADES ========
    
    private static String solicitarCampo(String nombre){
        System.out.print(nombre + ": ");
        String campo = sc.nextLine();
        return campo;
    }
        
    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = Integer.parseInt(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido.");
            }
        }
    }

    private static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double valor = Double.parseDouble(sc.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido.");
            }
        }
    }
    
    // ======== DATOS INICIALES ========

    private static void cargarDatosIniciales() {
        System.out.println("Cargando datos iniciales...");

        // Productos
        tienda.registrarProducto("Camisa Dream", 299.99, "Ropa", 2);
        tienda.registrarProducto("Pantalón Classic", 499.50, "Ropa", 1);
        tienda.registrarProducto("Tenis Urban", 899.00, "Calzado", 1);
        tienda.registrarProducto("Gorra Dreams", 149.00, "Accesorios", 3);

        // Clientes
        tienda.registrarCliente("Ana Torres", "ana.torres@mail.com", 551234567);
        tienda.registrarCliente("Carlos López", "carlos.lopez@mail.com", 554567890);
        tienda.registrarCliente("Mario Pérez", "maria.perez@mail.com", 556789012);

        System.out.println("Datos cargados correctamente.");
    }
}