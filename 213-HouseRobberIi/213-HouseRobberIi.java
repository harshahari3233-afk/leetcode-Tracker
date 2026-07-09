// Last updated: 7/9/2026, 3:09:40 PM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            arr1[i] = nums[i];
            arr2[i] = nums[i + 1];
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        int ans1 = a(arr1, arr1.length - 1, dp);
        Arrays.fill(dp, -1);
        int ans2 = a(arr2, arr2.length - 1, dp);

        return Math.max(ans1, ans2);
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