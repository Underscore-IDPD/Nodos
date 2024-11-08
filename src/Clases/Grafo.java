package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Grafo {
    private static int counter = 0;
    private final char id;
    private final List<Grafo> adjacencyList;
    private final HashMap <Character,Integer> AtributosArista;

    public Grafo() {
        this.id = (char) ('A' + (counter++));
        System.out.println("Creado Grafo: " + id);
        this.adjacencyList = new ArrayList<>();
        this.AtributosArista = new HashMap<>();
    }

    public static int getCounter() {
        return counter;
    }

    public HashMap<Character,Integer> getAtributosArista() {
        return AtributosArista;
    }

    public char getId() {
        return id;
    }

    public List<Grafo> getAdjacencyList() {
        return adjacencyList;
    }

    public void addVertice(Grafo vertice, int peso) {
        if (!adjacencyList.contains(vertice)) {
            adjacencyList.add(vertice);
            AtributosArista.put(vertice.id,peso);
            vertice.getAdjacencyList().add(this);
            vertice.getAtributosArista().put(id,peso);
            System.out.println("Conectado del Grafo " + id + " al Grafo " + vertice.id);
        }
    }

    public void removerVertice(Grafo vertice) {
        adjacencyList.remove(vertice);
        AtributosArista.remove(vertice.getId());
    }

    public void clearAdjacencyList() {
        adjacencyList.clear();
        AtributosArista.clear();
    }

    public Arista getArista(Grafo vertice) {
        for (Grafo Grafo : adjacencyList) {
            if (Grafo.id == vertice.id) {
                return new Arista(id, Grafo.getId(), AtributosArista.get(vertice.getId()));
            }
        }
        System.out.println("Arista no existe");
        return null;
    }

    public List<Arista> getAristas() {
        List<Arista> Aristas = new ArrayList<>();
        for (Grafo Grafo : adjacencyList) {
            Aristas.add(new Arista(id, Grafo.getId(), AtributosArista.get(Grafo.getId())));
        }
        return Aristas;
    }
}
