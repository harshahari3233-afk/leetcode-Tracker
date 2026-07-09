// Last updated: 7/9/2026, 3:09:41 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int n=nums.length;
        int left=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}