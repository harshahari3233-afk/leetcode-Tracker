// Last updated: 7/9/2026, 3:09:55 PM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         int[] dp=new int[n+1];
         Arrays.fill(dp,-1);
        int ans=a(nums,n-1,dp);
        return ans;
    }
    public int a(int[] nums,int i,int[] dp){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=Math.max(nums[i]+a(nums,i-2,dp),a(nums,i-1,dp));
        return dp[i];
    }
}