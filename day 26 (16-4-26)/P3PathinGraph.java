//#1971 - Path in Graph
import java.util.*;
public class P3PathinGraph {
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(graph, visited, source, destination);
    }

    private static boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        if (current == destination) {
            return true;
        }
        visited[current] = true;
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, neighbor, destination)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0, 1}, {1, 2}, {2, 5}};
        int source = 0;
        int destination = 5;
        System.out.println(validPath(n, edges, source, destination));
    }
}
