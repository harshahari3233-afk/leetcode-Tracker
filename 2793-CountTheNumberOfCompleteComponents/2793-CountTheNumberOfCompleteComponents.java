// Last updated: 7/9/2026, 3:05:45 PM
class Solution {

    List<Integer>[] graph;
    boolean[] visited;

    int nodes;
    int degreeSum;

    public int countCompleteComponents(int n, int[][] edges) {

        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[n];

        int complete = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                nodes = 0;
                degreeSum = 0;

                dfs(i);

                int actualEdges = degreeSum / 2;
                int expectedEdges = nodes * (nodes - 1) / 2;

                if (actualEdges == expectedEdges) {
                    complete++;
                }
            }
        }

        return complete;
    }

    private void dfs(int node) {

        visited[node] = true;
        nodes++;

        degreeSum += graph[node].size();

        for (int neigh : graph[node]) {
            if (!visited[neigh]) {
                dfs(neigh);
            }
        }
    }
}