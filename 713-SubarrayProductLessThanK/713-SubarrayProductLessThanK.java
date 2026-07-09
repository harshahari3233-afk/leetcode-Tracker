// Last updated: 7/9/2026, 3:07:45 PM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int prod=1;
        int count=0;
        int n=nums.length;
        if(k<=1){
            return 0;
        }
        for(int right=0;right<n;right++){
            prod*=nums[right];
            while(prod>=k){
                prod=prod/nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}