public class GestionPedidos {

    // Pila principal
    PilaPedidos pilaUndo = new PilaPedidos();

    // Pila secundaria
    PilaPedidos pilaRedo = new PilaPedidos();

    // Registrar pizza
    public void registrarPizza(Pizza pizza) {

        pilaUndo.push(pizza);

        // Cuando se agrega una nueva pizza,
        // el redo se limpia
        pilaRedo = new PilaPedidos();
    }

    // Deshacer
    public void deshacer() {

        if (pilaUndo.isEmpty()) {

            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaUndo.pop();

        pilaRedo.push(pizza);

        System.out.println("Pedido deshecho.");
    }

    // Rehacer
    public void rehacer() {

        if (pilaRedo.isEmpty()) {

            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaRedo.pop();

        pilaUndo.push(pizza);

        System.out.println("Pedido recuperado.");
    }

    // Mostrar pedido actual
    public void mostrarPedidoActual() {

        Pizza actual = pilaUndo.peek();

        if (actual == null) {

            System.out.println("No hay pedidos activos.");
            return;
        }

        System.out.println("\nPedido actual:");

        actual.mostrarPizza();
    }
}