import java.util.*;

public class DFSGraph {

    // Recursive DFS utility function
    private static void dfsRec(ArrayList<ArrayList<Integer>> adj,
            boolean[] visited, int s, ArrayList<Integer> res) {
             //   1. mark vertex as visited
        visited[s] = true;
        // 2. add vertex to result(List)
        res.add(s);
  // 3. dfs on connection of s
        for (int i : adj.get(s)) {
            if (!visited[i]) {
                dfsRec(adj, visited, i, res); // call dfs on unvisited connection
            }
        }
    }

    // Main DFS function
    public static ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        dfsRec(adj, visited, 0, res); // Start DFS from vertex 0
        return res;
    }

    // Utility function to add an undirected edge
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int t) {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Edge list
        int[][] edges = {
                { 1, 2 },
                { 1, 0 },
                { 2, 0 },
                { 2, 3 },
                { 2, 4 }
        };

        // Add edges to graph
        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }

        // Perform DFS
        ArrayList<Integer> res = DFS(adj);

        // Output DFS result
        System.out.print("DFS Traversal: ");
        for (int node : res) {
            System.out.print(node + " ");
        }
    }
}
