// Last updated: 7/9/2026, 3:07:23 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int left=0;
        int count=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                    left++;
            }
                max=Math.max(max,r-left+1);
            
        }
        return max;
    }
}