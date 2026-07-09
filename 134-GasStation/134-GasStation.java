// Last updated: 7/9/2026, 3:10:37 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int tank=0;
        int ttank=0;
        int start=0;
        for(int i=0;i<n;i++){
            int diff=gas[i]-cost[i];
            ttank+=diff;
            tank+=diff;
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        if(ttank>=0){
            return start;
        }
        return -1;
    }
}