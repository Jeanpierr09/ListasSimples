package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        lista.insertarCabezaLista(4);
        
        lista.visualizar();
        System.out.println("\n");
        System.out.println("Lista en Orden Inverso");
        lista.mostrarEnOrdenInverso();
        System.out.println("\n");
        System.out.println("Mostramos la lista con valores duplicados");
        lista.visualizar();
        System.out.println("\n");
        lista.eliminarDuplicados();
        System.out.println("Eliminamos los valores duplicados");
        lista.visualizar();
        System.out.println("\n");
        System.out.printf("Mostramos el tamaño de la lista" + lista.obtenerTamaño());
        System.out.println("\n");
        int n = 2;
        System.out.println("Elemento en la posición " + n + " desde el final: " + lista.obtenerNdesdeFinal(n));
//        System.out.println("\n");
//        System.out.println("lista: " + lista);
        /*
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();
        */

    }

}
