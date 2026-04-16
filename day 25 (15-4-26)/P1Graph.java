import java.util.*;
public class P1Graph {
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        int v = 5;
        graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdges(0, 1);
        addEdges(0, 2);
        addEdges(1, 3);
        addEdges(2, 4);
        printGraph();
    }

    public static void addEdges(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void printGraph() {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");
            for (int j : graph.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
