package ActividadArrayList;

import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {

        // =============================
        // EJERCICIO 1: Crear el inventario base
        // =============================
        ArrayList<Producto> inventario = new ArrayList<>();

        inventario.add(new Producto("P001", "Portátil", 899.99));
        inventario.add(new Producto("P002", "Ratón", 25.50));
        inventario.add(new Producto("P003", "Teclado", 45.00));
        inventario.add(new Producto("P004", "Monitor", 199.99));
        inventario.add(new Producto("P005", "Webcam", 59.90));

        System.out.println("=== Inventario inicial ===");
        for (Producto p : inventario) {
            System.out.println(p);
        }

        // =============================
        // EJERCICIO 2: Búsqueda y consulta
        // =============================
        System.out.println("\n=== Ejercicio 2 ===");

        // Buscar el producto con código "P003"
        for (Producto p : inventario) {
            if (p.getCodigo().equals("P003")) {
                System.out.println("Producto con código P003 encontrado: " + p);
                break;
            }
        }

        // Verificar si existe un producto llamado "Ratón"
        boolean existeRaton = false;
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase("Ratón")) {
                existeRaton = true;
                break;
            }
        }
        System.out.println("¿Existe un producto llamado 'Ratón'? " + (existeRaton ? "Sí" : "No"));

        // Mostrar cuántos productos hay en el inventario
        System.out.println("Total de productos: " + inventario.size());

        // =============================
        // EJERCICIO 3: Modificaciones
        // =============================
        System.out.println("\n=== Ejercicio 3 ===");

        // Cambiar el precio del Monitor a 179.99€
        for (Producto p : inventario) {
            if (p.getNombre().equalsIgnoreCase("Monitor")) {
                p.setPrecio(179.99);
                System.out.println("Precio del Monitor actualizado: " + p);
                break;
            }
        }

        // Eliminar la Webcam
        inventario.removeIf(p -> p.getNombre().equalsIgnoreCase("Webcam"));
        System.out.println("Webcam eliminada.");

        // Añadir un nuevo producto: P006 - Altavoces - 35.00€
        inventario.add(new Producto("P006", "Altavoces", 35.00));
        System.out.println("Nuevo producto añadido: P006 - Altavoces (35.00€)");

        System.out.println("\nInventario actualizado:");
        for (Producto p : inventario) {
            System.out.println(p);
        }

        // =============================
        // EJERCICIO 4: Operaciones avanzadas
        // =============================
        System.out.println("\n=== Ejercicio 4 ===");

        // Calcular el precio total del inventario
        double total = 0;
        for (Producto p : inventario) {
            total += p.getPrecio();
        }
        System.out.println("Precio total del inventario: " + total + "€");

        // Encontrar el producto más caro
        Producto masCaro = inventario.get(0);
        for (Producto p : inventario) {
            if (p.getPrecio() > masCaro.getPrecio()) {
                masCaro = p;
            }
        }
        System.out.println("Producto más caro: " + masCaro);

        // Mostrar solo productos con precio superior a 50€
        System.out.println("\nProductos con precio superior a 50€:");
        for (Producto p : inventario) {
            if (p.getPrecio() > 50) {
                System.out.println(p);
            }
        }
    }
}

