package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

    }
    public void mostrarEnOrdenInverso() {
        mostrarEnOrdenInverso(primero);
    }

    private void mostrarEnOrdenInverso(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        mostrarEnOrdenInverso(nodo.enlace);
        System.out.print(nodo.dato + " ");
    }


    public void eliminarDuplicados() {
        Nodo actual = primero;
        while (actual != null && actual.enlace != null) {
            Nodo buscador = actual;
            while (buscador.enlace != null) {
                if (actual.dato == buscador.enlace.dato) {
                    buscador.enlace = buscador.enlace.enlace;
                } else {
                    buscador = buscador.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    public int obtenerTamaño() {
        int contador = 0; // Inicializamos un contador a 0
        Nodo actual = primero; // Comenzamos con el primer nodo de la lista
        while (actual != null) { // Mientras no lleguemos al final de la lista
            contador++; // Incrementamos el contador
            actual = actual.enlace; // Movemos al siguiente nodo

        }
        return contador; // Retornamos el contador como el tamaño de la lista
    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;

    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    public int obtenerNdesdeFinal(int n) {
        Nodo puntero1 = primero;
        Nodo puntero2 = primero;
        int contador = 0;

        // Avanzar puntero1 n posiciones adelante
        for (int i = 0; i < n; i++) {
            if (puntero1 == null) {
                return -1; //
            }
            puntero1 = puntero1.enlace;
        }

        while (puntero1 != null) {
            puntero1 = puntero1.enlace;
            puntero2 = puntero2.enlace;
        }

        return puntero2.dato;
    }




    
    /**
     * Tarea:
     * 1 - crear metodo para invertir lista enlazada 
     * 2 - crear metodo para obtener elemento de la posicion n desde el final de la lista
     * 3 - crear metodo para eliminar duplicados en una lista enlazada
     * 4 - crear metodo para obtener tamaño de lista enlazada
     */
    
}
