// Last updated: 7/9/2026, 3:08:13 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count=0;
            }
            else{
                count++;
                max=Math.max(count,max);
            }
        }
        return max;
    }
}