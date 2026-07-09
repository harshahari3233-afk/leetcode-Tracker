// Last updated: 7/9/2026, 3:06:30 PM
class Solution {
    public int minPairSum(int[] nums) {
        int sum=0;
        int max=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            sum=nums[i]+nums[n-1-i];
            max=Math.max(sum,max);
        }
        return max;
    }
}