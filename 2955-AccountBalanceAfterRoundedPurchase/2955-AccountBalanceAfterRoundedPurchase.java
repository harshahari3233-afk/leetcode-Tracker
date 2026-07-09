// Last updated: 7/9/2026, 3:05:38 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r=Math.round(purchaseAmount/10.0f)*10;
        System.out.print(r);
        return 100-r; 
    }
}