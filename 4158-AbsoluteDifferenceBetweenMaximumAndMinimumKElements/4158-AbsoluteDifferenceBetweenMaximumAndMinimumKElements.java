// Last updated: 7/9/2026, 3:05:19 PM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        int lsum=0;
        int gsum=0;
        while(k>0){
        lsum+=nums[i];
        gsum+=nums[n-i-1];
        k=k-1;
        i++;
        }
        System.out.print(gsum);
        System.out.print(lsum);
        return Math.abs(gsum-lsum);
    }
}