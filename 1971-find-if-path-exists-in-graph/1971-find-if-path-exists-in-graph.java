import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            g[u].add(v);
            g[v].add(u);
        }
        
        boolean[] v = new boolean[n];
        return dfs(source, destination, g, v);
    }

    boolean dfs(int source, int destination, List<Integer>[] g, boolean[] v) {
        if (source == destination) return true;
        v[source] = true;
        
        for (int next : g[source]) {
            if (!v[next]) {
                if (dfs(next, destination, g, v)) {
                    return true;
                }
            }
        }
        return false;
    }
}