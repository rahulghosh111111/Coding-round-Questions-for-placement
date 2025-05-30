import java.util.ArrayList;

// CycleDetection class to detect cycles in an undirected graph using DFS

public class CycleDetection {

    public boolean dfs(int s, int p, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[s] = true;
        // call dfs on connection of s
        for (int i : adj.get(s)) {
            if (vis[i] == false) { // if unvisited
                if (dfs(i, s, vis, adj) == true)
                    return true;
            } else if (i != p) { // if visited and not parent
                return true; // cycle found
            }
        }
        return false; // no cycle found
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                if (dfs(i, -1, vis, adj) == true)
                    return true;
            }
        }
        return false;

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int t) {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Define edges (creates a cycle: 0-1-2-0)
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 0 },
                { 3, 4 } // Disconnected component without a cycle
        };

        for (int[] e : edges) {
            addEdge(adj, e[0], e[1]);
        }

        CycleDetection obj = new CycleDetection();

        if (obj.isCycle(V, adj)) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }
}