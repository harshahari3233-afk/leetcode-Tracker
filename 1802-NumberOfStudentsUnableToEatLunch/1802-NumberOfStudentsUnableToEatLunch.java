// Last updated: 7/9/2026, 3:06:44 PM
class Solution {
    public int countStudents(int[] s, int[] sand) {
        int n=s.length;
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        int f=0;
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        while(!q.isEmpty() && count<n){
            int stu=q.poll();
            if(s[stu]==sand[f]){
                f++;
                count=0;
            }
            else{
                q.offer(stu);
                count++;
            }
        }
        return q.size();

    }
}