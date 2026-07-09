// Last updated: 7/9/2026, 3:07:49 PM
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int m=edges[0].length;
        List<List<Integer>> graph=new ArrayList<>();
        int[] ans=new int[2];
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            boolean[] visited=new boolean[n+1];
            if(dfs(graph,u,v,visited)){
             ans[0]=u;
             ans[1]=v;
             return ans;
            }
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[0];
    }
    private boolean dfs(List<List<Integer>> graph,int node,int destination,boolean[] visited){
        if(node==destination){
            return true;
        }
        visited[node]=true;
        for(int nei:graph.get(node)){
            if(!visited[nei]){
                if(dfs(graph,nei,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }
}