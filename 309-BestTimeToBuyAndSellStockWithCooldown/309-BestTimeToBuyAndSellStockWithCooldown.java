// Last updated: 7/9/2026, 3:08:50 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int cool=0;
        int buy=-prices[0];
        int sold=0;
        for(int i=1;i<n;i++){
            int pc=cool;
            int pb=buy;
            int ps=sold;
            buy=Math.max(pb,pc-prices[i]);
            sold=pb+prices[i];
            cool=Math.max(pc,ps);

        }
        return Math.max(sold,cool);
    }
}