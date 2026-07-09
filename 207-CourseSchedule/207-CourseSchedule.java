// Last updated: 7/9/2026, 3:09:43 PM
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> g=new ArrayList<>();
        int n=prerequisites.length;
        int count=0;
        int[] ind=new int[numCourses];
        for(int i=0;i<=numCourses;i++){
            g.add(new ArrayList<>());
        }
        for(int[] e:prerequisites){
            int u=e[0];
            int v=e[1];
            g.get(v).add(u);
            ind[u]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int nei: g.get(node)){
                ind[nei]--;
                if(ind[nei]==0){
                    q.offer(nei);
                }
            }
            if(count==numCourses){
                return true;
            }
        }
        return false;
    }
}