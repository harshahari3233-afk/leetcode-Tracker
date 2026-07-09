// Last updated: 7/9/2026, 3:07:34 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int i=0;i<piles.length;i++){
            right=Math.max(piles[i],right);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            long ho=0;
            for(int i=0;i<piles.length;i++){
                ho+=(piles[i]+mid-1)/mid;
            }
            if(ho<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}