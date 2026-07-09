// Last updated: 7/9/2026, 3:06:53 PM
class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0){
            low++;
        }
        if(low>high){
            return 0;
        }
        return (high-low)/2+1;
    }
}