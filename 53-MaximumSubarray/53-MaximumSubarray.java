// Last updated: 7/9/2026, 3:11:37 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int csum=0;
        if(n<=1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            csum+=nums[i];
                if(max<csum){
                    max=csum;
                }
                if(csum<0){
                    csum=0;
                }
        }
        return max;
    }
}