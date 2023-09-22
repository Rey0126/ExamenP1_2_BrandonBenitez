package examenp1_2_brandonbenitez;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author brhb2
 */
public class ExamenP1_2_BrandonBenitez {

    static Scanner rd = new Scanner(System.in);
    static Scanner rd2 = new Scanner(System.in);
    static Random ran = new Random();
    static ArrayList<Producto> array = new ArrayList<>();

    public static void main(String[] args) {

        boolean menu = true;

        while (menu) {

            System.out.print("""
                               == MENU ==
                               1. Agregar productos
                               2. Buscar producto por nombre o codigo
                               3. Listar todos los productos
                               4. Salir
                               Ingrese una opcion: """);
            int opcion = rd.nextInt();

            switch (opcion) {

                case 1:

                    agregarProducto();

                    break;

                case 2:

                    boolean menu2 = true;

                    while (menu2) {

                        System.out.print("""
                                           == Sub Menu ==
                                           1. Buscar producto por nombre
                                           2. Buscar producto por codigo
                                           3. Salir del sub menu
                                              Ingrese una opción: """);
                        int op = rd.nextInt();

                        switch (op) {

                            case 1:

                                System.out.println("== Buscar producto por nombre == ");
                                System.out.print("Ingrese el nombre del producto: ");
                                String name2 = rd2.next();
                                buscarNombreProducto(name2);

                                break;

                            case 2:

                                System.out.println("== Buscar producto por codigo == ");
                                System.out.print("Ingrese el nombre del producto: ");
                                int codigo = rd.nextInt();
                                buscarCodigoProducto(codigo);

                                break;

                            case 3:

                                menu2 = false;

                                break;

                            default:
                                System.out.println("¡Opnción Invalida!");

                        }

                    }

                    break;

                case 3:

                    printArray();

                    break;

                case 4:

                    menu = false;

                    break;

                default:
                    System.out.println("¡Opción Invalida!");

            }

        }

    }

    public static void agregarProducto() {

        System.out.println("== Agregar Productos ==");

        System.out.println("Ingrese el nombre del producto: ");
        String name = rd2.next();

        int id = 900 + ran.nextInt(1000);
        System.out.println("ID del producto: " + id);

        System.out.println("Ingrese la cantidad que hay en el almacen: ");
        int cantidad = rd.nextInt();

        while (cantidad <= 0) {
            System.out.println("¡La cantidad del producto no puede ser 0!");
            System.out.print("Ingrese la cantidad que hay en el almacen: ");
            cantidad = rd.nextInt();
        }

        System.out.println("Ingrese el precio unitario: ");
        int precioU = rd.nextInt();

        while (precioU <= 0) {
            System.out.println("¡El precio del producto no puede ser 0!");
            System.out.print("Ingrese el precio unitario: ");
            precioU = rd.nextInt();
        }

        System.out.println("Ingrese el estado del producto (Disponible/Agotado): ");
        String estadoP = rd2.next();

        array.add(new Producto(id, cantidad, name, precioU, estadoP));

        System.out.println("¡Producto agregado exitosamente!");

    }

    public static void printArray() {

        for (int i = 0; i < array.size(); i++) {

            System.out.println("ID producto: " + array.get(i).getId_producto());
            System.out.println("Nombre: " + array.get(i).getNombre());
            System.out.println("Cantidad: " + array.get(i).getCantidad());
            System.out.println("Precio Unitario: " + array.get(i).getPrecio());
            System.out.println("Estado: " + array.get(i).getEstado());
            System.out.println();

        }

    }

    public static void buscarNombreProducto(String name2) {
        
        boolean hay = false;
        
        for (int i = 0; i < array.size(); i++) {

            if (name2.equalsIgnoreCase(array.get(i).getNombre())) {

                System.out.println("ID producto: " + array.get(i).getId_producto());
                System.out.println("Nombre: " + array.get(i).getNombre());
                System.out.println("Cantidad: " + array.get(i).getCantidad());
                System.out.println("Precio Unitario: " + array.get(i).getPrecio());
                System.out.println("Estado: " + array.get(i).getEstado());
                System.out.println();
                hay = true;
                
            } 

        }
        if(!hay) {
                System.out.println("¡No hay productos con este nombre!");               
            }

    }
    
    public static void buscarCodigoProducto(int codigo){
        
        boolean hay = false;
        
        for (int i = 0; i < array.size(); i++) {

            if (codigo == (array.get(i).getId_producto())) {

                System.out.println("ID producto: " + array.get(i).getId_producto());
                System.out.println("Nombre: " + array.get(i).getNombre());
                System.out.println("Cantidad: " + array.get(i).getCantidad());
                System.out.println("Precio Unitario: " + array.get(i).getPrecio());
                System.out.println("Estado: " + array.get(i).getEstado());
                System.out.println();
                hay = true;
            } 

        }
        if(!hay) {
                System.out.println("¡No hay productos con este codigo!");
                
            }
        
    }

}
