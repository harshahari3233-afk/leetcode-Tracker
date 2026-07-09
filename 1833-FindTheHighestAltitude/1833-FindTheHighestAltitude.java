// Last updated: 7/9/2026, 3:06:38 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        int n=gain.length;
        int[]  pre=new int[n+1];
        for(int i=0;i<n;i++){
            sum+=gain[i];
            max=Math.max(sum,max);
        }
        return max;
    }
}