// Last updated: 7/9/2026, 3:07:19 PM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int max=0;
        int i=0;
        for(int j=1;j<n;j++){
            int sum=values[i]+values[j]+i-j;
            max=Math.max(max,sum);
            if(values[i]+i<values[j]+j){
                i=j;
            }
        }
    
        return max;
    }
}