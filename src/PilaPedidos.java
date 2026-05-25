public class PilaPedidos {

    private Nodo cima;

    // Constructor
    public PilaPedidos() {

        cima = null;
    }

    // push -> insertar pizza
    public void push(Pizza pizza) {

        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta a la cima actual
        nuevo.siguiente = cima;

        // La cima ahora será el nuevo nodo
        cima = nuevo;

        System.out.println("Pizza agregada correctamente.");
    }

    // pop -> eliminar pizza
    public Pizza pop() {

        if (isEmpty()) {

            return null;
        }

        Pizza pizzaEliminada = cima.pizza;

        // La cima pasa al siguiente nodo
        cima = cima.siguiente;

        return pizzaEliminada;
    }

    // peek -> mostrar cima
    public Pizza peek() {

        if (isEmpty()) {

            return null;
        }

        return cima.pizza;
    }

    // validar si está vacía
    public boolean isEmpty() {

        return cima == null;
    }
}