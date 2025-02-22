package com;

import com.servicio.CategoriasServicio;
import com.servicio.UsuariosServicio;
import com.servicio.GastosServicio;
import java.util.Scanner;

public class MenuPrincipal {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CategoriasServicio categoriasServicio = new CategoriasServicio();
    private static final UsuariosServicio usuariosServicio = new UsuariosServicio();
    private static final GastosServicio gastosServicio = new GastosServicio();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gestionar Categorías");
            System.out.println("2. Gestionar Usuarios");
            System.out.println("3. Gestionar Gastos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    gestionarCategorias();
                    break;
                case 2:
                    gestionarUsuarios();
                    break;
                case 3:
                    gestionarGastos();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void gestionarCategorias() {
        int opcion;
        do {
            System.out.println("\n--- GESTIÓN DE CATEGORÍAS ---");
            System.out.println("1. Crear Categoría");
            System.out.println("2. Actualizar Categoría");
            System.out.println("3. Eliminar Categoría");
            System.out.println("4. Listar Categorías");
            System.out.println("5. Volver");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la categoría: ");
                    String nombre = scanner.nextLine();
                    categoriasServicio.guardarCategoria(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el ID de la categoría: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    categoriasServicio.actualizarCategoria(idActualizar, nuevoNombre);
                    break;
                case 3:
                    System.out.print("Ingrese el ID de la categoría a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    categoriasServicio.eliminarCategoria(idEliminar);
                    break;
                case 4:
                    System.out.println(categoriasServicio.consultarCategorias());
                    break;
            }
        } while (opcion != 5);
    }

    private static void gestionarUsuarios() {
        System.out.println("(Funcionalidad de gestión de usuarios en desarrollo)");
    }

    private static void gestionarGastos() {
        System.out.println("(Funcionalidad de gestión de gastos en desarrollo)");
    }
}
