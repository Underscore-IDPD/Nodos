import Clases.Grafo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Grafo[] nodos = new Grafo[9];
        for(int ind = 0; ind < 9; ind++){
            nodos[ind] = new Grafo();
        }

        nodos[0].addVertice(nodos[1],5);
        nodos[0].addVertice(nodos[2],5);
        nodos[1].addVertice(nodos[3],5);
        nodos[1].addVertice(nodos[4],5);
        nodos[2].addVertice(nodos[5],5);
        nodos[2].addVertice(nodos[6],5);
        nodos[3].addVertice(nodos[4],5);
        nodos[3].addVertice(nodos[7],5);
        nodos[4].addVertice(nodos[8],5);
        nodos[5].addVertice(nodos[6],5);
        nodos[6].addVertice(nodos[7],5);
        nodos[7].addVertice(nodos[8],5);
        nodos[8].addVertice(nodos[5],5);

        StringBuilder secuenciaGrados = new StringBuilder("[");
        for(int ind = 0; ind < 9; ind++){
            secuenciaGrados.append(nodos[ind].getAdjacencyList().size()).append(",");
        }
        System.out.println(secuenciaGrados.substring(0,secuenciaGrados.length()-1) + "]");
    }
}