// Last updated: 7/9/2026, 3:06:33 PM
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n=costs.length;
        int count=0;
        if(costs[0]>coins){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(costs[i]<=coins){
                count++;
                coins-=costs[i];
            }
        }
        return count;
    }
}