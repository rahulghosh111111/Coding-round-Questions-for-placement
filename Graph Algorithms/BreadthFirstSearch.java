import java.util.*;

public class BreadthFirstSearch {
    private List<List<Integer>> graph;
    private int vertices;

    // Constructor to initialize the graph
    public BreadthFirstSearch(int v) {
        this.vertices = v;
        graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Method to add an edge (undirected)   
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // Remove this line if the graph is directed
    }

    // BFS traversal from a starting node
    public void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        System.out.print("BFS traversal: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    q.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch(4); // 4 vertices: 0, 1, 2, 3

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.BFS(2); // Start BFS from node 2
    }
}
