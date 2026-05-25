import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GestionPedidos sistema = new GestionPedidos();

        int opcion;

        do {

            System.out.println("\n===== PIZZA TRACK =====");

            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre de la pizza: ");
                    String nombre = sc.nextLine();

                    String[] ingredientes = new String[3];

                    for (int i = 0; i < 3; i++) {

                        System.out.print("Ingrediente " + (i + 1) + ": ");

                        ingredientes[i] = sc.nextLine();
                    }

                    Pizza nuevaPizza = new Pizza(nombre, ingredientes);

                    sistema.registrarPizza(nuevaPizza);

                    break;

                case 2:

                    sistema.deshacer();

                    break;

                case 3:

                    sistema.rehacer();

                    break;

                case 4:

                    sistema.mostrarPedidoActual();

                    break;

                case 0:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}