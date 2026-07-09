// Last updated: 7/9/2026, 3:08:17 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return count;

    }
}