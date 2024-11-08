package Recorridos;

import Clases.Grafo;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {

    public static void bfs(Grafo grafo) {
        Set<Grafo> visitados = new HashSet<>();
        Queue<Grafo> cola = new LinkedList<>();

        cola.add(grafo);
        visitados.add(grafo);

        System.out.print("BFS Desde El Nodo " + grafo.getId() + ": ");

        while (!cola.isEmpty()) {
            Grafo nodoActual = cola.poll();

            System.out.print(nodoActual.getId() + " ");

            for (Grafo vecino : nodoActual.getAdjacencyList()) {
                if (!visitados.contains(vecino)) {
                    visitados.add(vecino);
                    cola.add(vecino);
                }
            }
        }

    }
}
