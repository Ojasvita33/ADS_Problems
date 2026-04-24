import java.util.*;
class Pair{
    int node, dist;
    Pair(int n, int d){
        node = n;
        dist = d;
    }
}
public class P1Dijkastra {
    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int source){
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        pq.add(new Pair(source, 0));
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int d = curr.dist;
            for(Pair neighbor : adj.get(node)){
                int adjNode = neighbor.node;
                int weight = neighbor.dist;
                if(d + weight < dist[adjNode]){
                    dist[adjNode] = d + weight;
                    pq.add(new Pair(adjNode, dist[adjNode]));
                }
            }
        }
        System.out.println("Shortest distances from source ");
        System.out.println(Arrays.toString(dist));
    }
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Pair(1, 2));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(0, 2));
        adj.get(1).add(new Pair(2, 1));
        adj.get(0).add(new Pair(3, 7));
        adj.get(2).add(new Pair(0, 4));
        adj.get(2).add(new Pair(1, 1));
        adj.get(2).add(new Pair(4, 3));
        adj.get(3).add(new Pair(1, 7));
        adj.get(3).add(new Pair(3, 6));
        adj.get(3).add(new Pair(3, 6));
        adj.get(4).add(new Pair(3, 6));
        adj.get(4).add(new Pair(3, 6));


        int source = 0;
        dijkstra(V, adj, source);
    }
}