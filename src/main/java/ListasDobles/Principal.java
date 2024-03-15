package ListasDobles;

import umg.edu.progra.listas.Lista;

public class Principal {
    public static void main(String[] args){
    ListasD lista = new ListasD();
        lista.agregarinicio(1);
        lista.agregarinicio(2);
        lista.agregarinicio(3);
        lista.agregarinicio(4);
        lista.agregarinicio(5);
        lista.agregarinicio(6);

        lista.listaalreves();
        lista.agregarinicio(4);
        lista.agregarmedio(8);
        lista.removerduplicado();
        lista.listatamaño();
    }
}
