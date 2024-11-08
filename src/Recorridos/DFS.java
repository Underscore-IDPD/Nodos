package Recorridos;
import Clases.*;

import java.util.Set;

public class DFS {
    public static void dfs (Grafo grafo, Set<Grafo> visitados){
        System.out.print("DFS Desde El Nodo " + grafo.getId() + ": ");
        dfsRecursivo(grafo, visitados);
    }

    private static void dfsRecursivo(Grafo grafo, Set<Grafo> visitados) {
        if (visitados.contains(grafo)) {
            return;
        }
        visitados.add(grafo);

        System.out.print(grafo.getId() + " ");

        for (Grafo vecino : grafo.getAdjacencyList()) {
            if (!visitados.contains(vecino)) {
                dfsRecursivo(vecino, visitados);
            }
        }
    }
}
